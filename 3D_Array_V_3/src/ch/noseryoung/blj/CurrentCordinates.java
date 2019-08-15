package ch.noseryoung.blj;

public class CurrentCordinates {
  private int x;
  private int y;
  private int z;

  public int plusOne(int a){
    if(a<=18){
      a=a+1;
      return a;
    }else{
      return a;
    }

  }



  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }
}
