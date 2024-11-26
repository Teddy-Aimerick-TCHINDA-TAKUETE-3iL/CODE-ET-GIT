public class StockManager {

    /** 
     * Fonction ajoutAuStock qui ajoute une nouvelle quantite au stock d'un produit;
     * @param produit : parametre donnant le nom du produit en question;
     * @param quantite : parametre donnant la quantite de produit a ajouter;
     * @param stock : parametre donnant la quantite actuel du produit;
    */
    public void ajoutAuStock(String produit, int quantite, int stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /** 
     * Fonction retraitDuStock qui retire une certaine quantite au stock d'un produit si cela est possible;
     * @param produit : parametre donnant le nom du produit en question;
     * @param quantite : parametre donnant la quantite de produit a retirer;
     * @param stock : parametre donnant la quantite actuel du produit;
    */
    public void retraitDuStock(String produit, int quantite, int stock){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }

    /** 
     * Fonction gererStock qui permet de gerer le stock d'un produit;
     * @param produit : parametre donnant le nom du produit en question;
     * @param quantite : parametre donnant la quantite de produit a retirer;
     * @param stock : parametre donnant la quantite actuel du produit;
    */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {

        switch(typeOperation)
        {
            case "ajout" : 
                            ajoutAuStock(produit,quantite,stock);
                            break;
            case "retrait" :
                                retraitDuStock(produit,quantite,stock);
                                break;
            default :
                        System.out.println("Opération inconnue.");
        }
    }
}
