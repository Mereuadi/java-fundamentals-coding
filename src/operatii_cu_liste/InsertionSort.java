package operatii_cu_liste;

public class InsertionSort { public static void main(String[] args) {
    // Array-ul care va fi sortat
    int[] numbers = {5, 3, 8, 1, 9, 2, 7, 4, 6};

    // Afișați array-ul înainte de sortare
    System.out.println("Array înainte de sortare:");
    for (int num : numbers) {
        System.out.print(num + " ");
    }
    System.out.println();

    // Aplicați sortarea prin inserție
    insertionSort(numbers);

    // Afișați array-ul după sortare
    System.out.println("Array după sortare:");
    for (int num : numbers) {
        System.out.print(num + " ");
    }
}


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            // Mută elementele array-ului care sunt mai mari decât current,
            // la o poziție înainte de poziția lor curentă
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            // Plasează current în poziția corectă
            array[j + 1] = current;
        }
    }
}

