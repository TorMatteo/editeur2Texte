package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }

    /**
     * Recupere le texte
     * @return string
     */
    public String getTexte() {
        return texte;
    }


    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajouter du texte
     * @param texte String
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplace une partie du texte
     * @param debut int
     * @param fin int
     * @param remplacement String
     */
    public void remplacer(int debut, int fin, String remplacement){
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Mets en majuscules une partie du texte
     * @param debut int
     * @param fin int
     */
    public void majuscules(int debut, int fin) {
        String texteMaj = texte.substring(debut, fin+1);
        texteMaj = texteMaj.toUpperCase();
        remplacer(debut, fin, texteMaj);
    }

    /**
     * Va effacer une partie du texte
     * @param debut int
     * @param fin int
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Supprime tout le texte
     */
    public void clear(){
        texte = "";
    }

    /**
     * Afficher le texte
     * @return String
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
