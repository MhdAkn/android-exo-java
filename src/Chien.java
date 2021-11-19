public class Chien extends Canin implements Grimace {

    public Chien(){
  
    }
    public Chien(String couleur, int poids){
      this.couleur = couleur;
      this.poids = poids;
    }                
  //Methode crier
    void crier() {
      System.out.println("J'aboie sans raison !");
    }        
  //Methode faireCalin
  public void faireCalin() {
      System.out.println("Je te fais un GROS CÂLIN");               
    }
  //Methode faireLeBeau
  public void faireLeBeau() {
      System.out.println("Je fais le beau !");
    }
  //Methode faireLechouille
  public void faireLechouille() {
      System.out.println("Je fais de grosses léchouilles...");
    } 
  }