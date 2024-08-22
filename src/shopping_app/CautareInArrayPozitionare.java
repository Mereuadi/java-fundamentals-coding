package shopping_app;

import java.util.Scanner;

public class CautareInArrayPozitionare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citire si parcurgere primul array de stringuri
        System.out.print("Introduceti numarul de elemente pentru primul array: ");
        int n1 = scanner.nextInt();
        scanner.nextLine(); // consuma newline
        String[] array1 = new String[n1];

        System.out.println("Introduceti elementele pentru primul array:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Elementul " + (i + 1) + ": ");
            array1[i] = scanner.nextLine();
        }

        // Citire si parcurgere al doilea array de stringuri
        System.out.print("Introduceti numarul de elemente pentru al doilea array: ");
        int n2 = scanner.nextInt();
        scanner.nextLine(); // consuma newline
        String[] array2 = new String[n2];

        System.out.println("Introduceti elementele pentru al doilea array:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Elementul " + (i + 1) + ": ");
            array2[i] = scanner.nextLine();
        }

        // Cautarea elementelor din primul array in al doilea array
        System.out.println("\nRezultatul cautarii:");
        for (int i = 0; i < n1; i++) {
            boolean found = false;
            for (int j = 0; j < n2; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println("Elementul \"" + array1[i] + "\" din primul array " + " de pe pozitia "+ (i+1) + " a fost gasit in al doilea array la pozitia: " + (j+1));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Elementul \"" + array1[i] + "\" din primul array nu a fost gasit in al doilea array.");
            }
        }

        scanner.close();
    }
}
