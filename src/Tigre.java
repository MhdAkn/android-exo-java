public class Tigre extends Felin implements Grimaces {
     //constructeur  par defaut d'un tigre
    public Tigre(){
  
    }
    //constructeur  par defaut d'un tigre

    public Tigre(String couleur, int poids){
      this.couleur = couleur;
      this.poids = poids;
    }
  
    void crier() {
      System.out.println("Je grogne très fort !");
    } 
    public void faireLeBeau() {
      System.out.println("Je fais le beau!");
    }
  
    public void faireLeclown() {
      System.out.println("Je fais le clown :)...");
    } 
  }