class india {
	int age  ;
	String name;
	char inital;
	india(int age ,String name ,char inital){
		this.age=age;
		this.name=name;
		this.inital=inital;
		System.out.println("My age is"+age);
		System.out.println("My name is "+name+"."+inital);
	}
	  
	  public void animal() {
	    System.out.println("National animal is Tiger");
	  }
	}

	/*class birds extends india {

	  
	  public void bird() {
	    System.out.println("national bird is Peacock");
	  }
	}

	class fruits  extends india {

	  
	  public void fruit() {
	    System.out.println("National fruit is Mango");
	  }
	}*/

	public class polymorphism {
	    	
			
			
		
	  public static void main(String[] args) {
	    
		  india id = new india(23,"Chris",'j');
		   /* india s2 = new india();
		    s2.animal();

		  
	    birds s1 = new birds();
	    s1.bird();

	   
	    fruits c1 = new fruits();
	    c1.fruit();?*/
	    
	  }
	}
