abstract class MotorBike {
  abstract void fav();
}

class SportsBike extends MotorBike {
    
  
  public void fav() {
    System.out.println("Duke - 390");
  }
}

class MountainBike extends MotorBike {
    
  
  public void fav() {
    System.out.println("KTM Adventure");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    MountainBike m1 = new MountainBike();
    m1.fav();
    SportsBike s1 = new SportsBike();
    s1.fav();
  }
}