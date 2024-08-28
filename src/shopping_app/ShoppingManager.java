package shopping_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingManager {

    List<String> itemsList = new ArrayList<>();

    // Proprietati:
    // Constructori:
    // Metode: public void start


    public void start() {
        System.out.println("Shopping List App");
        System.out.println("------------------");

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {

            showMenu();

            String option = scanner.next();
            scanner.nextLine();

            switch (option) {

                case "1":
                    System.out.println("Introduceti un item");
                    String item = scanner.nextLine();
                    addItem(item);
                    break;

                case "2":
                    System.out.println("Introduceti item-ul pe care doriti sa il modificati: ");
                    String oldItem = scanner.nextLine();
                    System.out.println("Introduceti noul item: ");
                    String newItem = scanner.nextLine();
                    updateItem(oldItem, newItem);
                    break;

                case "3":
                    System.out.println("Introduceti un item pentru stergere");

                    String itemForDelete = scanner.nextLine();
                    deleteItem(itemForDelete);
                    break;

                case "4":
                    showItemsList();
                    break;

                case "5":
                    itemsList.clear();
                    break;

                case "6":
                    Scanner scanner1 = new Scanner(System.in);

                    // Citire si parcurgere primul array de stringuri
                    System.out.print("Introduceti numarul de elemente pentru primul array = lista cumparaturi: ");
                    int n1 = scanner1.nextInt();
                    scanner1.nextLine(); // consuma newline
                    String[] array1 = new String[n1];

                    System.out.println("Introduceti elementele pentru primul array = lista cumparaturi:");
                    for (int i = 0; i < n1; i++) {
                        System.out.print("Elementul " + (i + 1) + ": ");
                        array1[i] = scanner1.nextLine();
                    }

                    // Citire si parcurgere al doilea array de stringuri
                    System.out.print("Introduceti numarul de elemente pentru al doilea array = raft: ");
                    int n2 = scanner1.nextInt();
                    scanner1.nextLine(); // consuma newline
                    String[] array2 = new String[n2];

                    System.out.println("Introduceti elementele pentru al doilea array = raft:");
                    for (int i = 0; i < n2; i++) {
                        System.out.print("Elementul " + (i + 1) + ": ");
                        array2[i] = scanner1.nextLine();
                    }

                    // Cautarea elementelor din primul array in al doilea array
                    System.out.println("\nRezultatul cautarii:");
                    for (int i = 0; i < n1; i++) {
                        boolean found = false;
                        for (int j = 0; j < n2; j++) {
                            if (array1[i].equals(array2[j])) {
                                System.out.println("Elementul \"" + array1[i] + "\" din primul array=lista cumparaturi " + " de pe pozitia " + (i + 1) + " din lista " + " a fost gasit in al doilea array = raft la pozitia: " + (j + 1));
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Elementul \"" + array1[i] + "\" din primul array=lista cumparaturi nu a fost gasit in al doilea array=raft.");
                        }
                    }

                case "7":
                    Scanner scanner2 = new Scanner(System.in);

                    // Introducerea numărului de elemente din array=lista cumparaturi
                    System.out.print("Introduceți numărul de elemente din array: ");
                    int n = scanner2.nextInt();
                    scanner2.nextLine(); // Consumă newline-ul rămas

                    String[] array = new String[n];

                    // Introducerea elementelor array-ului = lista cumparaturi
                    System.out.println("Introduceți elementele array-ului:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        array[i] = scanner2.nextLine();
                    }
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

                case "8":
                    isRunning = false;
                    break;

                default:
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Optiunea nu exista! Prin optiunea selectata ai ales sa iesi din program! In caz ca nu doreai acest lucru, da din nou re-Run |> si introdu doar o valoare numerica de tip intreg in intervalul 1->7!");


            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }}
    private void showMenu() {
                System.out.println("1. Introducere element");
                System.out.println("2. Modificare element");
                System.out.println("3. Stergere element");
                System.out.println("4. Afisare lista");
                System.out.println("5. Golire lista");
                System.out.println("6. Cautare elemente din lista de cumparaturi pe raft");
                System.out.println("7. Sortare ascendenta si descendenta a listei de cumparaturi in ordine crescatoare/descrescatoare sau alfabetica de la A->Z si invers");
                System.out.println("8. Oprire");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Introdu mai jos o optiune numerica din lista de mai sus:");
                System.out.println("|");
                System.out.println("V");
            }

            public void addItem (String item){
                boolean isPresent = isPresentInList(item);

                if (isPresent == true) {
                    System.out.println("Elementul exista in lista");
                } else {
                    itemsList.add(item);
                }
            }

            public boolean isPresentInList (String item){
                boolean isPresent = false;
                for (int i = 0; i < itemsList.size(); i++) {

                    String element = itemsList.get(i);

                    if (item.equalsIgnoreCase(element)) {
                        isPresent = true;
                    }
                }
                return isPresent;
            }


            public void showItemsList () {
                for (String element : itemsList) {
                    System.out.println(element);
                }
                //       for (int i = 0; i < itemsList.size(); i++) {
                // colorat cu mov = variabila globala
                // colorat cu alb = variabila locala
                // cu this. putem apela orice se afla in clasa
                //      String element = itemsList.get(i);
                //           System.out.println(element);
            }


            public void updateItem (String oldItem, String newItem){
                // varianta 1
                // deleteItem(oldItem);

                // addItem(newItem);

                //varianta 2
                boolean isPresent = isPresentInList(oldItem);
                if (isPresent == false) {
                    System.out.println("-----------------------------");
                    System.out.println("Elementul nu se afla in lista");
                } else {
                    for (int i = 0; i < itemsList.size(); i++) {
                        String element = itemsList.get(i);

                        if (oldItem.equalsIgnoreCase(element)) {
                            // metoda set ne ajuta sa modificam un element de pe o pozitie anume (index)
                            itemsList.set(i, newItem);
                        }
                    }
                }
            }

            public void deleteItem (String item){
                boolean isPresent = isPresentInList(item);
                if (isPresent == true) {
                    itemsList.remove(item);
                } else {
                    System.out.println("-------------------------");
                    System.out.println("Elementul nu a fost gasit!");
                }
            }

            public void bubbleSort (String[]array,boolean ascending){
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



