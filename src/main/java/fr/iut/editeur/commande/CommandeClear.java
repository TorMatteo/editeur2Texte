package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Va effacer tout le texte
 */
public class CommandeClear extends CommandeDocument{
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Va appeler la fonction clear de la classe Document puis executer la fonction de la classe qu'elle extends
     */
    @Override
    public void executer(){
        if(parameters.length < 1) {
            System.err.println("Format attendu : clear");
            return;
        }
        this.document.clear();
        super.executer();
    }
}
