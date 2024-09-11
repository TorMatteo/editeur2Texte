package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Va effacer une partie du texte (voir tout les textes en fonction des paramètres)
 */
public class CommandeEffacer extends CommandeDocument{

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;1;2");
            return;
        }
        int debut;
        int fin;
        try {
            debut = Integer.parseInt(parameters[1]);
            fin = Integer.parseInt(parameters[2]);

        }catch (Exception e) {
            System.err.println("Format attendu : debut et fin sont des nombres");
            return;
        }
        this.document.effacer(debut, fin);
        super.executer();
    }
}
