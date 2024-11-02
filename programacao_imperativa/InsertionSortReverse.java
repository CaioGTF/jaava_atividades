public class InsertionSortReverse {
    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        System.out.println("Vetor original: ");
        printArray(vetor);

        insertionSort(vetor);

        System.out.println("\nVetor em ordem decrescente: ");
        printArray(vetor);
    }

    public static void insertionSort(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;

            // Compare the new element to elements in the sorted section of the array
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] < newElement; i--) {
                arr[i] = arr[i - 1];
            }

            // Insert the newElement into its appropriate position
            arr[i] = newElement;
        }
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

