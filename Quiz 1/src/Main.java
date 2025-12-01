public class Main {
    public static void main(String[] args) {
        int[] numbers = {
                35,
                69,
                1,
                10,
                -50,
                320,
                63,
                58,
                26,
                13
        };

        System.out.println("Before selection sort:");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\nAfter selection sort:");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int smallIndex = 0;

            for (int j = 1; j <= i; j++) {
                if (arr[j] < arr[smallIndex]) {
                    smallIndex = j;
                }
            }

            int temp = arr[smallIndex];
            arr[smallIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printArrayElements(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}