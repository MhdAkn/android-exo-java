

//Classe test
public class Test {
//Methode principal
    public static void main(String[] args) {
        // Demande de choix de l'animal
        System.out.println("--------------POUR UNCHIEN DE CATEGORIE CHIEN----------------------");
        // Les méthodes d'un chien
        Chien c = new Chien("Gris bleuté", 20);
        c.boire();
        c.manger();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());

        System.out.println("-------------------**-----------------------");
        // Les méthodes de l'interface
        c.faireCalin();
        c.faireLeBeau();
        c.faireLechouille();

        System.out.println("-------------------**-----------------------");
        // Utilisons le polymorphisme de notre interface
        Grimace r = new Chien();
        r.faireLeBeau();
        r.faireCalin();
        r.faireLechouille();



        System.out.println("----------------POUR UN TIGRE CATEGORIE FELIN----------------------");
        // Les méthodes d'un tigre
        Tigre t = new Tigre("Blanc tacheté de noir", 50);
        t.boire();
        t.manger();
        t.deplacement();
        t.crier();
        System.out.println(t.toString());

        System.out.println("-------------------**-----------------------");
        // Les méthodes de l'interface
        t.faireLeBeau();
        t.faireLeclown();

        System.out.println("-------------------**-----------------------");
        // Utilisons le polymorphisme de notre interface
        Grimaces f = new Tigre();
        f.faireLeBeau();
        f.faireLeclown();
    }
}
