package JavaFromBeginning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoxTest {
	@Test
	//testing volume method
	public void volumeTest (){
		//creating object of class box
		Box myBox = new Box ();
		
		//testing volume of default constructor
		assertEquals (1, myBox.volume());
		
		//testing volume method that takes argument
		assertEquals(125,myBox.volume(5, 5, 5));
		
		// calling parameterized constructor
		Box myBox1 = new Box(10, 10, 10);
		
		Box myBox2 = new Box();

		assertEquals (1000, myBox1.volume(10, 10, 10));

		//setting height, width, depth
		myBox2.setDepth(50);
		myBox2.setHeight(50);
		myBox2.setWidth(50);
		
		//testing getter method 
		int volume = myBox2.getDepth() * myBox2.getHeight() * myBox2.getWidth();
		assertEquals (125000, volume);
	}
}