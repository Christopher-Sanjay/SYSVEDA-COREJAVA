

class sports {

	  
	  String name;
	  public void play() {
	    System.out.println("I love to play basketball everyday ");
	  }
	}

	
	class basketball extends sports {

	 
	  public void display() {
	    System.out.println("My fav player is " + name);
	  }
	}

	public class inheritance {
	  public static void main(String[] args) {

	 
	    basketball bb = new basketball();

	 
	    bb.name = "lebron james";
	    bb.display();

	    bb.play();

	  }
	}