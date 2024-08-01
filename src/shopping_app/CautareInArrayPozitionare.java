package shopping_app;
import java.util.ArrayList;
import java.util.List;

public class CautareInArrayPozitionare {
    public static void main(String[] args) {

       //  List<String> itemsList = new ArrayList<>();
          String itemsList [] = {"articol 10", "articol 30"};

        // Crearea unui al doilea array, raftul din magazin/depozit pe care cautam produsele
         String[] searchArrayRaft = {"articol 10", "articol 20", "articol 30"}; // Exemplu de array pentru căutare, raftul de la magazin/depozit



        // Căutarea elementelor din array-ul în al doilea array


            for (String art : itemsList) {
                boolean found = false;
                for (int i = 0; i < searchArrayRaft.length; i++) {

                    if (art == searchArrayRaft[i]) {
                        found = true;
                        System.out.println("Produsul " + art + " a fost găsit pe raft la poziția " + (i + 1) + ".");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Produsul " + art + " nu a fost găsit pe raftul" + searchArrayRaft);
                }
            }


        }
    }

