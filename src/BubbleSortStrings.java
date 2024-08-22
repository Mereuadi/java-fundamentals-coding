import java.util.Scanner;

public class BubbleSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducerea numărului de elemente din array
        System.out.print("Introduceți numărul de elemente din array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumă newline-ul rămas

        String[] array = new String[n];

        // Introducerea elementelor array-ului
        System.out.println("Introduceți elementele array-ului:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        // Sortarea array-ului în ordine alfabetică folosind Bubble Sort
        bubbleSort(array, true);
        System.out.println("Array-ul sortat în ordine alfabetică / crescatoare:");
        for (String s : array) {
            System.out.println(s);
        }

        // Sortarea array-ului în ordine inversă
        bubbleSort(array, false);
        System.out.println("Array-ul sortat în ordine inversă alfabetică / descrescatoare:");
        for (String s : array) {
            System.out.println(s);
        }
    }


    // Metodă pentru Bubble Sort
    public static void bubbleSort(String[] array, boolean ascending) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && array[j].compareTo(array[j + 1]) > 0) ||
                        (!ascending && array[j].compareTo(array[j + 1]) < 0)) {
                    // Schimbare a elementelor
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
