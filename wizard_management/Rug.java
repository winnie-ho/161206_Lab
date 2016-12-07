package wizard_management;

public class Rug extends Carpet implements Defendable, Wearable {

  public Rug(String colour){
    super(colour);
  }

  public String defend(){
    return "Rug beats enemies senseless!";
  }

  public String wearing(){
    return "Stiffened Treadaire cape overheats Wizard";
  }

}