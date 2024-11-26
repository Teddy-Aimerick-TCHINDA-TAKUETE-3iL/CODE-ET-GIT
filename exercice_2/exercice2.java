public class GestionnaireNotes {

    /** 
     * Fonction afficherNotes qui affiche les notes d'un etudiant;
     * @param nomEtudiant : parametre donnant le nom de l'etudiant;
     * @param notes : parametre donnant le tableau des notes de l'etudiant;
    */
    public void afficherNotes(String nomEtudiant, int[] notes){
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /** 
     * Fonction calcilerMoyenne qui calcule et retourne la moyenne des notes d'un etudiant;
     * @param notes : parametre donnant le tableau des notes de l'etudiant;
     * @return : retourne un double corespondand a la moyenne des note de l'etudiant;
    */
    public double calculerMoyenne(int[] notes){
        int moyenne = 0;
        for (int note : notes) {
            moyenne += (double) note / notes.length;
        }
        return moyenne;
    }

    /** 
     * Fonction afficherNotes qui affiche les notes d'un etudiant;
     * @param moyenne : parametre correspondant a la moyenne de l'etudiant;
    */
    public void afficherMoyenne(double moyenne){
        System.out.println("Moyenne : " + moyenne);
    }

    /** 
     * Fonction afficherNotesEtMoyenne qui affiche les notes et la moyenne d'un etudiant;
     * @param nomEtudiant : parametre donnant le nom de l'etudiant;
     * @param notes : parametre donnant le tableau des notes de l'etudiant;
    */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        afficherNotes(nomEtudiant,notes);

        // Affichage de la moyenne
        afficherMoyenne(calculerMoyenne(notes));
    }
}
