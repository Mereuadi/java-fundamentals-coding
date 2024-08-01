package obiecte_clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *Keyword STATIC
 * - se foloseste pentru: proprietati, metode, clase (nu se foloseste pentru constructori)
 * - atunci cand o proprietate/variabila/clasa/metoda este statica, se aloca spatiu in memorie la pornirea aplicatiei
 * - intr-o metoda statica NU putem apela proprietati (variabile) care nu sunt statice
 * - pentru a apela o proprietate/metoda/clasa statica, folosim NUMELE CLASEI . NUMELE PROPRIETATII/METODEI/CLASEI=> Dog.bark() nu folosim instanta clasei, adica rex.bark()
 * - elementele statice sunt independente de obiecte, acestea depind de clasa, nu de instanta lor
 */
public class Main {
    public static void main(String[] args) {

        Dog rex = new Dog("Labrador", 2, "Rex"); //obiectul rex este instanta(implementarea, popularea campurilor din clasa cu valori) clasei Dog
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

        Dog.bark();// folosim clasa Dog si nu obiectele clasei Dog

        rex.apport();// folosim obiectul nu clasa Dog

        // addDog();
        dogManagers();
        }

        public static Dog addDog(){
            System.out.println("Add dog");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert name: ");

            String name = scanner.nextLine();

            System.out.println("Insert race: ");

            String race = scanner.nextLine();

            System.out.println("Insert age:");
            int age = scanner.nextInt();

            scanner.close();

            // Dog - tipul variabilei, in acest caz clasa Dog
            // variabila DeTipDog - este numele variabilei
            // = - operator de atribuire (initializare)
            // new Dog() - reprezinta apelul constructorului din clasa Dog

            Dog variabilaDeTipDog = new Dog(race, age, name);

            //
            Integer number = 0;
            String text ="";
            StringBuilder builder = null;
            number = 10;
            return variabilaDeTipDog;// System out println

        }

        public static void dogManagers(){
            List<Dog> dogList = new ArrayList<>();

            Dog dog1 = new Dog("Bichon", 2, "Max");
            Dog dog2 = new Dog("Labrador", 5,"Ben");
            Dog dog3 = new Dog( "Chihuahus", 3,"Picky");
            Dog dog4 = addDog();

            dogList.add(dog1);
            dogList.add(dog2);
            dogList.add(dog3);
            dogList.add(dog4);
            for(int i =0; i< dogList.size(); i++){
                Dog element = dogList.get(i);

                System.out.println(element);
            }
            if(dogList.size()>4){
                return;
                //atunci cand folosim "return;" intr-o metoda cu tipul returnat void, se opreste executia metodei
            }
        }
    }

