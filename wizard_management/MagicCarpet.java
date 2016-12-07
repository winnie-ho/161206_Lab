package wizard_management;

public class MagicCarpet extends Carpet implements Flyable {

  public MagicCarpet(String colour){
    super(colour);
  }

  public String fly(){
    return "Hovering up, straightening out, flying off!";
  }

}