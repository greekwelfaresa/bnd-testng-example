package testng.test;

import org.testng.annotations.Test;

public class TestNGTests {

  @Test
  public void test1() {
	  
	  throw new AssertionError("Failed!");
	  
  }

  @Test
  public void test2() {}
}