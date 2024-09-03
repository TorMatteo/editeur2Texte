package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{

    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscule;1;2");
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
        this.document.majuscules(debut, fin);
        super.executer();
    }
}
