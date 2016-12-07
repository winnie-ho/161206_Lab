package wizard_management;

public class Ogre extends MythicalBeast implements Defendable {
  
  public Ogre(String name){
    super(name);
  }

  public String defend(){
    return "Ogre smashes yer face in";
  }

}