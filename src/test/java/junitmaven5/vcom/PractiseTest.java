package junitmaven5.vcom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)//if @order() is not working we use this
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)// based on alphanumeric
@TestMethodOrder(MethodOrderer.Random.class)
class PractiseTest {
     @Order(4)
	@Test
	void test() {
		assertEquals(6, 6);
		System.out.println("test 1");
	}
      
	@Order(1)
	@DisplayName("ajodsfosf")
	@Test
	void test1() {
		assertEquals(7, 7);
		System.out.println("test 2");

	}
	
	
	//@Disabled
	
	//@EnabledOnOs(OS.MAC)//skipped because it is not MAC
    @Order(5)

	@Test
	void test2() {
		assertEquals(7, 7);
		System.out.println("test 3");

		
		
	}
	
	//@EnabledOnJre(JRE.JAVA_12)//test skipped because iam using java_16
    @RepeatedTest(6)
    //RepeatedTest(value=2)
    
	@Test
	void test23() {
		assertEquals(7, 7);
		System.out.println("test 4");

		
		
	}
	//@EnabledForJreRange(min=JRE.JAVA_10,max=JRE.JAVA_18)
    @Order(6)
	@Test
	void test234() {
		assertEquals(7, 7);
		System.out.println("test 5");

		
		
	}
	
	//@EnabledIfSystemProperty(named="user.dir",matches="C:\\Users\\hp\\Downloads\\Iam open to receive all the (2).zip")
	@Test
	void test235() {
		assertEquals(7, 7);
		System.out.println("test 6");

		
		
	}
	
}




