package obiecte_clase;

public class Main {
    public static void main(String[] args) {

        Dog rex = new Dog("Labrador", 2, "Rex");
        String rexText = rex.toString();

        System.out.println(rexText);
        System.out.println(rex);

        Dog lady = new Dog("Bichon", 5, "Lady");

        System.out.println(lady);

        Dog rex2 = new Dog ("Labrador", 2, "Rex");

        // NU FOLOSIM "==" ATUNCI CAND DORIM SA COMPARM 2 OBIECTE

        if (rex == rex2) {
            System.out.println("Obiectele sunt egale");
        }else{
                System.out.println("Obiectele nu sunt egale");
            }
        // FOLOSIM .EQUALS() PENTRU A COMPARA 2 OBIECTE
        if (rex .equals( rex2)) {
            System.out.println("Obiectele sunt egale");
        }else{
            System.out.println("Obiectele nu sunt egale");
        }
        }
    }

