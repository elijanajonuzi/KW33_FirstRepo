package ch.noseryoung.blj;

import java.util.Random;


public class Cube {
  private int[][][] cubeField = new int[20][20][20];

  protected void findCube() {
    addRandomNumberInCube(1, 9);
   isTherePrimeNumber();
  }


  protected boolean isTherePrimeNumber() {
    boolean canIStop = false;
    do {
      for (int z = 0; z < cubeField.length; z++) {
        for (int y = 0; y < cubeField.length; y++) {
          for (int x = 0; x < cubeField.length; x++)
            if (isPrimeNumber(cubeField[x][y][z])) {
              if (isTherePrimeSquare(x, y, z)) {
                if (isTherePrimeSquare(x, y, z + 1)) {
                  if (isPrimeNumber(cubeField[x][y][z + 1]))
                    printOutCoordinates(x, y, z);
                  return true;
                }
              }

            }
        }

      }
    } while (!canIStop);

    return false;
  }


  protected boolean isTherePrimeSquare(int x, int y, int z) {

    if (canIAddOne(x, y, z)) {
      if (isPrimeNumber(cubeField[x + 1][y + 1][z]) && isPrimeNumber(cubeField[x + 1][y][z]) && isPrimeNumber(cubeField[x][y + 1][z])) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }


  private boolean canIAddOne(int x, int y, int z) {
    if (x == 19 && y == 19 && z == 19) {
      return false;
    } else if (x <= 18 && y <= 18 && z <= 18) {
      return true;
    }
    return false;
  }


  protected void addRandomNumberInCube(int from, int to) {
    Random random = new Random();
    for (int z = 0; z < cubeField.length; z++) {
      for (int x = 0; x < cubeField.length; x++) {
        for (int y = 0; y < cubeField.length; y++) {
          cubeField[z][x][y] = random.nextInt(to) + from;
        }
      }

    }

  }


  protected boolean isPrimeNumber(int numberToCheck) {
    if (numberToCheck == 1) {
      return false;
    }
    if (numberToCheck % 2 == 0) return false;
    for (int i = 3; i * i <= numberToCheck; i += 2) {
      if (numberToCheck % i == 0)
        return false;
    }
    return true;
  }


  private void printOutCoordinates(int x, int y, int z) {
    System.out.println("Coordinate 1. nummer: x: " + x + " y: " + y + " z: " + z + " Inhalt: " + cubeField[x][y][z]);
    System.out.println("Coordinate 2. nummer: x: " + (x + 1) + " y: " + y + " z: " + z + " Inhalt: " + cubeField[x + 1][y][z]);
    System.out.println("Coordinate 3. nummer: x: " + x + " y: " + (y + 1) + " z: " + z + " Inhalt: " + cubeField[x][y + 1][z]);
    System.out.println("Coordinate 4. nummer: x: " + (x + 1) + " y: " + (y + 1) + " z: " + z + " Inhalt: " + cubeField[x + 1][y + 1][z]);
    System.out.println("Coordinate 5. nummer: x: " + x + " y: " + y + " z: " + (z + 1) + " Inhalt: " + cubeField[x][y][z + 1]);
    System.out.println("Coordinate 6. nummer: x: " + (x + 1) + " y: " + y + " z: " + (z + 1) + " Inhalt: " + cubeField[x + 1][y][z + 1]);
    System.out.println("Coordinate 7. nummer: x: " + x + " y: " + (y + 1) + " z: " + (z + 1) + " Inhalt: " + cubeField[x][y + 1][z + 1]);
    System.out.println("Coordinate 8. nummer: x: " + (x + 1) + " y: " + (y + 1) + " z: " + (z + 1) + " Inhalt: " + cubeField[x + 1][y + 1][z + 1]);
  }

  public int[][][] getCubeField() {
    return cubeField;
  }

  public void setCubeField(int[][][] cubeField) {
    this.cubeField = cubeField;
  }


}
