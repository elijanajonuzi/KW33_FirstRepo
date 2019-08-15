package ch.noseryoung.blj;

import static org.junit.Assert.*;

public class CubeTest {

  @org.junit.Test
  public void isTherePrimeSquare() {
      Cube cube = new Cube();

    assertTrue(cube.isTherePrimeSquare(0,0,0));

  }
}