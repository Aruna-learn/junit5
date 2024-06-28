package junitmaven5.vcom;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void test() {
		
		int[] expected= {2,6,0,5,6};
		int[] actual= {0,2,5,6,6};
		
		assertEquals(expected, actual);// gives reference variable only not check data
		//assertArrayEquals(expected, actual);// check the data in array
		
		Arrays.sort(actual);
	}

}
