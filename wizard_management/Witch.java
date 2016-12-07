package wizard_management;

public class Witch {
  String name;
  Flyable ride;
  Defendable weapon;
  Wearable thread;
  Pet pet;
  Wand wand;

  public Witch(String name, Flyable ride, Defendable weapon, Wearable thread, Pet pet, Wand wand) {
    this.name = name;
    this.ride = ride;
    this.weapon = weapon;
    this.thread = thread;
    this.pet = pet;
    this.wand = wand;
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

  public String getPetName(){
    return this.pet.getName();
  }

  public void setPet(Pet pet){
    this.pet = pet;
  }

  public String wandDefend(){
    return this.wand.defend();
  }
}