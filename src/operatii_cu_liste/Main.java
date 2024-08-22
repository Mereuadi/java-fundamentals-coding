package operatii_cu_liste;

import java.util.Scanner;

/**
 * 1. Sa se defineasca un array de 10 elemente, sa se afiseze acel array in consola
 * 2. Sa se afiseze array-ul invers, de la coada spre cap
 * 3. Sa se afiseze toate numerele pare din array
 * 4. Sa se calculeze suma nr divizibile cu 3 din array-ul dat
 * 5. Sa se verifice daca numarul 9 este prezent in array, daca este prezent sa se afiseze un mesaj
 * 6. Se citeste de la tastatura un numar intreg n, sa se verifice daca acest numar este prezent in array
 * 7. Se citeste de la tastatura un nr intreg n, care va fi dimensiunea unui array, elementele array-ului se vor citi de la tastatura. Sa se afiseze elementele array-ului intr-o singura linie, separate prin virgula
  **/
public class Main {
    public static void main(String[] args) {

        int[] numbers = {8, 1, 2, 33, 4, 20, 6, 7, 17, 9};
        //                0 1 2 3  4 5  6 7 8 9 pozitiile din array
        afisareArray(numbers);
        System.out.println();
        System.out.println("-------------------------------");
        afisareArrayInvers(numbers);
        System.out.println("-------------------------------");
        afisareNumerePare(numbers);
        System.out.println("-------------------------------");
        afisareSumaNumereDivizibileCu3(numbers);
        System.out.println("-------------------------------");
        cautareNumarInArray(numbers);
        citireNumarSiCautareInArray(numbers);
        afisareArray(numbers);

    }

    public static void afisareArray(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            int element = numbers[j];
            // Pentru a afisa elementele invers, folosim linia de mai jos
            //  int element = numbers[numbers.length-1-i];

            System.out.print(element + ", ");
        }
    }

    public static void afisareArrayInvers(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            int element = numbers[i];

            System.out.print(element + ", ");
        }
    }

    public static void afisareNumerePare(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            if (element % 2 == 0) {
                System.out.print(element + ", ");
            }
        }
    }

    public static void afisareSumaNumereDivizibileCu3(int[] numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];

            if (element % 3 == 0) {
                suma = suma + element;

            }

        }
        System.out.println(suma);
    }

    public static void cautareNumarInArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9) {
                System.out.println("S-a gasit numarul 9");
            }
        }
    }

    public static void citireNumarSiCautareInArray(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg, pozitiv:");
        int nrIntreg = scanner.nextInt();
        boolean isPresent = false;


            for (int i = 0; i < numbers.length; i++) {
                int element = numbers[i];

                if (element == nrIntreg) {
                    isPresent = true;

                    System.out.println("Numarul " + nrIntreg + " este prezent in array");

                }
            }
            if (isPresent==false){
                System.out.println("Numarul " + nrIntreg + " nu este prezent in array");
            }


        scanner.close();
    }
    public static void citireArrayDeLaTastatura() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu lungimea array-ului");
        int n = scanner.nextInt();

        int[] number = new int[n];

        for (int j = 0; j < n; j++) {
            //pentru a adauga un element pe pozitia i in array
            System.out.println("Introdu un numar");
            number[j] = scanner.nextInt();
        }
        scanner.close();
        afisareArray(number);

    }








}


