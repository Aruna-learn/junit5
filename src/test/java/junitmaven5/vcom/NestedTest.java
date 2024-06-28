package junitmaven5.vcom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
// here we are using nested for for positive and negative and zero in organized manner
class NestedTest {
	Calculator calc;
	
	@BeforeEach
	public void init() {
		calc=new Calculator();
	}
	
	@Nested
	class AddPositive{
		@Test
		void addSmallPositive() {
			int sum=calc.add(2, 5);
			System.out.println(sum);
		}
		
		@Test
		void addBigPositive() {
			int sum=calc.add(2000, 5555);
			System.out.println(sum);
		}
		
	}
	@Nested
	class AddNegative{
		@Test
		void addBigNegative() {
			int sum=calc.add(-2000, -5555);
			System.out.println(sum);
		}
		@Test
		void addSmallNegative() {
			int sum=calc.add(-20, -55);
			System.out.println(sum);
		}
		
		
	}
	@Nested
	class Addzero{

		@Test
		void addSmallNegativeZero() {
			int sum=calc.add(-0, -0);
			System.out.println(sum);
		}
		@Test
		void addBigNegativezero() {
			int sum=calc.add(-0000, -00000);
			System.out.println(sum);
		}
		
		
		
		
	}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


