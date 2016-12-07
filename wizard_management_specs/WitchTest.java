import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WitchTest {

  Witch witch;
  Dragon dragon;
  Mop mop;
  Rug rug;
  Cat cat;
  Wand wand;

  @Before
  public void before(){
    dragon = new Dragon("Fireballz");
    mop = new Mop("Dyson");
    rug = new Rug("Persian");
    cat = new Cat("Tiddles");
    wand = new Wand("The lost knees of Cohort 8");
    witch = new Witch("Sabrina", dragon, mop, rug, cat, wand);
  }

  @Test
  public void hasCat(){
    assertEquals("Tiddles", witch.getPetName());
  }

  @Test
  public void canChangeCat(){
    Cat cat2 = new Cat("Mephisto");
    witch.setPet(cat2);
    assertEquals("Mephisto", witch.getPetName());
  }

  @Test
  public void hasWand(){
    assertEquals("Hit me with your wizard stick!", witch.wandDefend());
  }

  @Test
  public void canChangePet(){
    Lizard lizard = new Lizard("Brian");
    witch.setPet(lizard);
    assertEquals("Brian", witch.getPetName());
  }
}