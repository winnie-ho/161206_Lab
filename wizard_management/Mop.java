package wizard_management;

public class Mop extends CleaningImplement implements Defendable {
  
  public Mop(String brand){
    super(brand);
  }

  public String defend(){
    return "Mop polishes your enemies off";
  }
}