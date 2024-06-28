package junitmaven5.vcom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import add.Shapes;

class ShapesTest {

	@Test
	void test() {
		Shapes s=new Shapes();
		assertEquals(576, s.computeSquareArea(24));
		
	}
	
	@Test
	void test1() {
		Shapes s=new Shapes();
assertEquals(78.5, s.computeCircleArea(5),"Area of Cirlce");//Area of circle is failure trace message
	}
	}


