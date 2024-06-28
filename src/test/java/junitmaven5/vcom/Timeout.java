package junitmaven5.vcom;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

  public class Timeout {
     
//	@Test
//	@org.junit.jupiter.api.Timeout(9)
//	void test() throws InterruptedException {
//		Thread.sleep(6000);
//		System.out.println("sdisduhweirweiupr");
//	}
//
//	
//	@Test
//	@org.junit.jupiter.api.Timeout(9)
//	void tes1t() throws InterruptedException {
//		TimeUnit.MILLISECONDS.sleep(80000);
//		System.out.println("sdisduhweirweiupr");
//	}

	
	// wecan use lambda with private methods also and asserttimeout
	@Test
	public void testtime() {
		Assertions.assertTimeout(Duration.ofMillis(6), ()->delayseconds(5));
		
	}
	
	public void delayseconds(int seconds) throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(seconds);
	}
	
	
	
}
