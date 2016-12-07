package wizard_management;

public class Wizard {
  String name;
  Flyable ride;
  Defendable weapon;
  Wearable thread;

  public Wizard(String name, Flyable ride, Defendable weapon, Wearable thread) {
    this.name = name;
    this.ride = ride;
    this.weapon = weapon;
    this.thread = thread;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  public Defendable getWeapon(){
    return this.weapon;
  }

  public String defend(){
    return this.weapon.defend();
  }

  public String wearing(){
    return this.thread.wearing();
  }

}