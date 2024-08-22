package operatii_cu_liste;
import java.util.Scanner;

public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea numărului de elemente
        System.out.print("Introduceți numărul de elemente din array: ");
        int n = scanner.nextInt();

        // Crearea array-ului
        int[] array = new int[n];

        // Citirea elementelor array-ului
        System.out.println("Introduceți elementele array-ului:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementul " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Afișați array-ul înainte de sortare
        System.out.println("Array înainte de sortare:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Sortarea array-ului în ordine crescătoare folosind metoda personalizată
        sortArray(array);

        // Afișarea elementelor sortate
        System.out.println("Elementele array-ului sortate în ordine crescătoare sunt:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Metodă personalizată pentru sortarea array-ului (Bubble Sort)
    public static void sortArray(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Schimbă elementele între ele
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Dacă nu s-a efectuat niciun schimb, array-ul este deja sortat
            if (!swapped) break;
        }
    }
}


