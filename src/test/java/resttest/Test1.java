package resttest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {

  @BeforeTest
  void beforeTest(){
    System.out.println("beforeTest-method");
  }

  @AfterTest
  void afterTest(){
    System.out.println("afterTest-method");
  }

  @Test(groups="resttester")
  void firstTest(){
    Assert.assertEquals("faktiskt resultat","förväntat resultat","Fick inte förväntat svar.");

  }

  @Test(dependsOnMethods = "firstTest")
      void secondTest(){
    Assert.assertFalse(false);
  }

  @Test
  void thirdTest(){
    Assert.assertTrue(true);
  }

  @Test
  void fourthTest(){
    Assert.assertNotEquals("error","success","dom var lika!?");
  }

}
