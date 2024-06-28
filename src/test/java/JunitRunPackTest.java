



@RunWith(JUnitPlatform.class)
@SelectPackages({"junit5maven5.com","practise")//we can run single package also without curlybraces
@SelectPackages(ArrayTest.class)// we can run from class level also
@SelectPackages({ArrayTest.class,NestedTest.java})// we can run from class level fro multiple classes

@IncludeTages("smoke")// it executes only smoke
public class JunitRunPackTest {
	

}
