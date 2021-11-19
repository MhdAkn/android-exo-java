abstract class Animal {
    // declaration et portee des attributs
    protected String couleur;
    protected int poids;

    // Methodes de la classe mère
    protected void manger() {
        System.out.println("Je mange de la viande.");
    }

    protected void boire() {
        System.out.println("Je bois de l'eau !");
    }

    abstract void deplacement();// comme il seront redefinir

    abstract void crier();// comme il seront redefinir

    public String toString() {
        String str = "Je suis un objet de la " + this.getClass() + ", j'ai une couleur " + this.couleur + ", je pèse "
                + this.poids + " Kg";
        return str;
    }
}