package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
import org.mockito.internal.matchers.Null;

/**
 * Va remplacer une partie du texte par un autre texte
 */
public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;texte");
            return;
        }
        String texte;
        if(parameters.length == 3){
            texte = "";
        }else {
            texte = parameters[3];
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
        this.document.remplacer(debut, fin, texte);
        super.executer();
    }
}
