public class FactureManager {

    /** 
     * Fonction reductionAlimentaire qui applique une reduction sur le montant d'une facture de produit alimentaire;
     * @param total : parametre correspondant au montant total de la facture sur laquel la reduction sera faite;
     * @return : retour d'un double correspondant au montant avec reduction;
    */
    public double reductionAlimentaire(double total){
        return total - total * 0.05; // Réduction de 5%
    }

    /** 
     * Fonction reductionElectronique qui applique une reduction sur le montant d'une facture de produit electronique;
     * @param total : parametre correspondant au montant total de la facture sur laquel la reduction sera faite;
     * @return : retour d'un double correspondant au montant avec reduction;
    */
    public double reductionElectronique(double total){
        return total - total * 0.1; // Réduction de 10%
    }

    /** 
     * Fonction reductionLuxe qui applique une reduction sur le montant d'une facture de produit luxe;
     * @param total : parametre correspondant au montant total de la facture sur laquel la reduction sera faite;
     * @return : retour d'un double correspondant au montant avec reduction;
    */
    public double reductionLuxe(double total){
        return total -= total * 0.15; // Réduction de 15%
    }

    /** 
     * Fonction reductionFinal qui applique une reduction sur le montal final d'une facture;
     * @param total : parametre correspondant au montant total de la facture sur laquel la reduction sera faite;
     * @return : retour d'un double correspondant au montant avec reduction;
    */
    public double reductionFinal(double total){
        if (total > 1000)
            return total - total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        return total;
    }

    /** 
     * Fonction calculerFacture qui renvoit le montant final d'une facture apres y avoir appliquer les differentes reductions;
     * @param typeProduit : parametre correspondant au type du produit en question;
     * @param quantite : parametre correspondant a la quantite total de produit acheter;
     * @param prixUnitaire : parametre correspondant au prix d'un article;
     * @return : retour d'un double correspondant au montant final de la facture;
    */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        switch(typeProduit)
        {
            case "Alimentaire" :
                                total = reductionAlimentaire(total);
                                break;
            case "Electronique" :
                                total = reductionElectronique(total);
                                break;
            case "Luxe" : 
                            total = reductionLuxe(total);
                            break;
        }

        // Reduction sur le total
        total = reductionFinal(total);

        return total;
    }
}
