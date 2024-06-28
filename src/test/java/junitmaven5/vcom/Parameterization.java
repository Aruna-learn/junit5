package junitmaven5.vcom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class Parameterization {

//	@ParameterizedTest  @valuesource
//	@ValueSource(ints = {1,8,5,0})//1st will execute 1, 2nd time 8eecute, 3rd 5xecute, 4th o will execute// we can name also
//	
//	void testvalue(int args) {
//		System.out.println(args);
//		
//	}
//	
//	
//	@ParameterizedTest
//	@ValueSource(strings = {"aruna","koti" ,"jsdfhso"})
//	
//	void testvalue1(String fruits) {
//		System.out.println(fruits);
//		
//		
//		
//	}
//	
//
//}


//enumsource

//enum Fruits{
//	apple, banana, mango;
//}
//@ParameterizedTest
//@EnumSource(Fruits.class)
//void test1(Fruits fruit) {
//	System.out.println(fruit);
//	
//}

//Methodsourse

private static String[] fruits() {
	return new String[] {"apple", "banana", "mango"};
}
@ParameterizedTest
@MethodSource("fruits")
void test1(String fruit) {
	System.out.println(fruit);
	
}



}

