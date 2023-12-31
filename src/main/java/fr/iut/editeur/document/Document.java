package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }


    /**
     * remplace le texte entre le start et le end
     * @param start debut du texte à remplacer
     * @param end fin du texte à remplacer
     * @param remplacement le nouveau texte
     */

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void effacer(int start, int end) {
        this.remplacer(start,end,"");
    }

    public void majuscules(int start, int end) {
        String text = texte.substring(start, end);
        text = text.toUpperCase();
        this.remplacer(start,end,text);
    }
    public void clear() {
        texte = "";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
