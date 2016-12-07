package wizard_management;

public class Wand implements Defendable{
  
  private String material;

  public Wand(String material){
    this.material = material;
  }

  public String defend(){
    return "Hit me with your wizard stick!";
  }
}