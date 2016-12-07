import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Mop mop;
  Rug rug;


  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    mop = new Mop("Dyson");
    rug = new Rug("Persian");
    wizard = new Wizard("Toby", broomstick, mop, rug);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick broomstick = (Broomstick)wizard.getRide();
    assertEquals("Nimbus", broomstick.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon ("Tilly");
    Ogre ogre = new Ogre ("Tyson");
    Wizard wizard = new Wizard ("Dumbledore", dragon, ogre, rug);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canSetRide(){
    Dragon dragon = new Dragon ("Erik");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void hasWeapon(){
    Mop mop = (Mop)wizard.getWeapon();
    assertEquals("Dyson", mop.getBrand());
  }

  @Test
  public void canDefend(){
    assertEquals("Mop polishes your enemies off", wizard.defend());
  }

  @Test
  public void hasClothes(){
    assertEquals("Stiffened Treadaire cape overheats Wizard", wizard.wearing());
  }
}