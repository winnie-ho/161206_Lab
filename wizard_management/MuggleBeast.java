package wizard_management;

public abstract class MuggleBeast{
  String name;
  Boolean mythical;

  public MuggleBeast(String name){
    this.name = name;
    this.mythical = false;
  }

  public String getName(){
    return this.name;
  }
}