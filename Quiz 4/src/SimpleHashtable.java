public class SimpleHashtable {
    private StoredPlayer[] hashtable;
    private StoredPlayer placeholder;

    public SimpleHashtable() {
        hashtable = new StoredPlayer[10];
        placeholder = new StoredPlayer("---DELETED---", null);
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null && hashtable[index] != placeholder;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        int stoppingIndex = hashedKey;

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        hashedKey = (hashedKey + 1) % hashtable.length;

        while (hashedKey != stoppingIndex && hashtable[hashedKey] != null) {

            if (hashtable[hashedKey].key.equals(key)) {
                return hashedKey;
            }

            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        return -1;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);
        int index = hashedKey;

        while (hashtable[index] != null && !hashtable[index].key.equals(key)) {
            index = (index + 1) % hashtable.length;

            if (index == hashedKey) {
                System.out.println("Error: Table is full, cannot insert " + key);
                return;
            }
        }

        if (hashtable[index] != null && hashtable[index].key.equals(key)) {
            System.out.println("Error: Key " + key + " already exists (Updating is not supported in this simple version).");
            return;
        }

        hashtable[index] = new StoredPlayer(key, value);
    }

    public void remove(String key) {
        int index = findKey(key);

        if (index == -1) {
            System.out.println("Failure: Key '" + key + "' not found.");
            return;
        }

        hashtable[index] = placeholder;
        System.out.println("Success: Key '" + key + "' removed and marked as deleted.");
    }

    public Player get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].value;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.print("Element " + i + ": ");
            if (hashtable[i] == null) {
                System.out.println("---");
            } else if (hashtable[i] == placeholder) {
                System.out.println(placeholder.key);
            } else {
                System.out.println(hashtable[i].value.getUserName());
            }
        }
    }
}