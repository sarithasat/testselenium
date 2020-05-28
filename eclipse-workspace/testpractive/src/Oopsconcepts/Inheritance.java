package Oopsconcepts;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW Bmw1= new BMW();
		Bmw1.start();
		Bmw1.stop();
		Bmw1.safety();
		Bmw1.engine();
		
		Car c=new Car();
		c.start();
		c.stop();
		
		//top casting
		Car c1= new BMW();
		c1.start();
		c1.stop();
		//down casting
		
		BMW B2= (BMW)new Car();
		

	}

}
