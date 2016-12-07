package wizard_management;

public abstract class MythicalBeast {
  
  String name;
  Boolean mythical;

  public MythicalBeast(String name){
    this.name = name;
    this.mythical = true;
  }

  public String getName(){
    return this.name;
  }
}