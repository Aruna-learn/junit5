package junitmaven5.vcom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class Repetion {
//    @RepeatedTest(5)
//	@Test
//	void test1() {
//		
//		System.out.println("Aruna reddy");
//		
//	}
    
//    @RepeatedTest(value=3)
//	@Test
//	void test2() {
//		
//		System.out.println("Aruna reddy");
//		
//	}
//    @RepeatedTest(value=3,name=RepeatedTest.LONG_DISPLAY_NAME)
//	@Test
//	void test3() {
//		
//		System.out.println("Aruna reddy");
//		
//	}
//    @RepeatedTest(value=4, name=RepeatedTest.SHORT_DISPLAY_NAME)
//	@Test
//	void test4() {
//		
//		System.out.println("Aruna reddy");
//		
//	}
//    @RepeatedTest(2)
//	@Test
//	void test5(RepetitionInfo repetioninfo) {
//		
//		System.out.println("Aruna reddy");
//		System.out.println(repetioninfo.getCurrentRepetition());
//		System.out.println(repetioninfo.getTotalRepetitions());
//		System.out.println(repetioninfo.getFailureCount());
//	}
	
    @RepeatedTest(value=2, name="{display name}-repetion-{current repetion/{Totalrepetion}")
	@Test
	void test5() {
    	System.out.println("sdlfje");
		
		
	}

}
