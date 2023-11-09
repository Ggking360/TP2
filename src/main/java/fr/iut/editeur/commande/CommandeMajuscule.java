package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {

    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }
    @Override
    public void executer() {
        if(parameters.length < 1) {
            System.err.println("Format attendu : majuscules;depart;fin");
            return;
        }
        int fin = Integer.parseInt(parameters[2]);
        int depart = Integer.parseInt(parameters[1]);
        this.document.majuscules(depart,fin);
        super.executer();
    }
}
