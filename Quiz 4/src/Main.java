public class Main {
    public static void main(String[] args) {
        SimpleHashtable hashtable = new SimpleHashtable();

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyJimmy = new Player(32, "deadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        System.out.println("--- Inserting Players ---");
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        System.out.println("\n--- Current Hashtable State ---");
        hashtable.printHashtable();

        System.out.println("\n--- Testing Removal ---");
        hashtable.remove("deadlyJimmy");
        hashtable.remove("Plooful");

        System.out.println("\n--- Final State ---");
        hashtable.printHashtable();
    }
}