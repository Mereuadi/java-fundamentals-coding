package shopping_app;

/**
 * Modificatori de acces
 * 1. private - Elementele private sunt acesibile DOAR in interiorul Clasei
 * 2. default - Elementele default ( fara mofificator de acces ) sunt vizibile la nivel de pachet , adica sunt vizibile de toate clasele din pachet .
 * 3. protected - Elementele protected sunt vizibile la nivel de pachet ca si default , dar in relatii de mostenire elementele din clasa parinte
 * sunt vizibile de clasele copil aflate in alte pachete .
 * Exemplu :
 * - avem pachetul A care contine clasa Animal, toate elementele au moficatorul de acces protected
 * - avem pachetul B care contine clasa Caine ( copilil Clasei Animal ) acetate poate vedea toate elementele din parinte .
 * 4. public - Elementele public sunt vizibile peste tot.
 */

public class Main {


    public static void main(String[] args) {

        ShoppingManager shoppingManager = new ShoppingManager(); // apelare constructor
        shoppingManager.start();





    }
}
