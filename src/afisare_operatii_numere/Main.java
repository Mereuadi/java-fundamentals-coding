package afisare_operatii_numere;

import java.math.BigInteger;

/**
 * 1. afisare nr impare de la 0 la 50
 * 2. afisare suma primelor 5 numere divizibile cu 3 si 5
 * 3. afisare produsul primelor 50 sau 10 numere divizibile cu 9
 */

public class Main {
    public static void main(String[] args) {
        afisareNumereImpare();
        afisareNumereDivizibileCu3Si5();
        produsulNumerelorDivizibileCu9();
        produsulPrimelor10NumerelorDivizibileCuUnNumar();
    }


    public static void afisareNumereImpare() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void afisareNumereDivizibileCu3Si5() {
        int i = 1;// i ne ajuta sa luam toate numerele de la 1 la infinit
        int contor = 0; // contor tine evidenta numerelor ce indeplinesc conditia
        int suma = 0; // suma ne ajuta sa calculam suma nr gasite

        while (contor < 5) { //se executa cat timp variabila contor <5

            if (i % 3 == 0 && i % 5 == 0) {//verificam daca nr i se imparte exact la 3 si la 5
                suma = suma + i; // daca este indeplinita conditia adunam nr gasit la suma existenta
                contor++; // contorul se incrementeaza cand gasim un numsr ce indeplinste conditia
            }
            i++; // i-ul se incrementeaza indiferent daca conditia este indeplinita sau nu
        }
        System.out.println(suma); // afisam suma cu nr gasite
    }

    public static void produsulNumerelorDivizibileCu9() {
        int numar = 1;
        int contor2 = 0;
        long produsulNumerelorDivizibileCu9 = 1;
        while (contor2 < 10) {
            if (numar % 9 == 0) {
                produsulNumerelorDivizibileCu9 = produsulNumerelorDivizibileCu9 * numar;
                contor2++;

            }
            numar++;
        }
        System.out.println(produsulNumerelorDivizibileCu9);

    }
// CTRL ALT L formatare cod

    public static void produsulPrimelor10NumerelorDivizibileCuUnNumar() {

        long produsPrimele10NumereDivizibileCuUnNumar = 1;
        int unNumarIntregCuCareEsteDivizibil = 9; // ca sa nu mai folosesc scanner
        System.out.println("numarul cu care sunt divizibile primele 10 numere este:" + unNumarIntregCuCareEsteDivizibil);
        for (int j = 1; j <= 10; j++) {
            produsPrimele10NumereDivizibileCuUnNumar = produsPrimele10NumereDivizibileCuUnNumar * j * unNumarIntregCuCareEsteDivizibil;

        }
        System.out.println("Produsul primelor 10 numere divizibile cu " + unNumarIntregCuCareEsteDivizibil + " este:" + produsPrimele10NumereDivizibileCuUnNumar);
    }
}
