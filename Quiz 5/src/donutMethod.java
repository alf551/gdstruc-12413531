import java.util.Scanner;

public class donutMethod {

    /*
       The Donut Method
       Data Type: Works on unsorted or sorted data.

       How it works:
       1. Start searching from the very beginning (left) and the very end (right) at the same time.
       2. Check if the number at the left or right is the one we want.
       3. If not, move the left side forward and the right side backward.
       4. Repeat until the number is found or the two sides meet in the middle.
       Additional info: The reason why I called it the donut method was because it all comes
       back to the middle, just like a donut being circular and always coming back to
       where it belongs.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = {15, 42, 8, 99, 4, 23, 16, 77, 100, 1};

        System.out.println("--- The Donut Method ---");
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        int result = donutSearch(data, target);

        if (result != -1) {
            System.out.println("Found " + target + " at index: " + result);
        } else {
            System.out.println(target + " is not in the list.");
        }
    }

    public static int donutSearch(int[] list, int target) {
        int left = 0;
        int right = list.length - 1;

        while (left <= right) {
            if (list[left] == target) {
                return left;
            }

            if (list[right] == target) {
                return right;
            }

            left++;
            right--;
        }

        return -1;
    }
}