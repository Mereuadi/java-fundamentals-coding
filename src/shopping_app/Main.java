package shopping_app;

/**
 * Modificatori de acces
 * 1. private - elementele private sunt accesibile DOAR in interiorul clasei
 * 2. default - elementele default (fara modificator de acces) sunt vizibile la nivel de pachet, sunt vizibile de toate clasele din pachet
 * 3. protected - elementele protected sunt vizibile la nivel de pachet ca si default, dar in relatii de mostenire elementele din clasa
 * parinte sunt visibile de clasele copil aflate in alte pachete
 * Ex:  - avem pachetul A care contine clasa Animal, toate elementele au modificatorul de acces protected
 *      - avem pachetul B care contine clasa Caine (copilul clasei Animal), aceasta poate vedea toate elementele din parinte
 * 4. public - elementele public sunt vizibile peste tot (din alte pachete, proiecte, clase, etc)
 */

public class Main {

    public static void main(String[] args) {
        ShoppingManager shoppingManager = new ShoppingManager();
        shoppingManager.start();


    }
}












