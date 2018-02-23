/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
	@Test
	public void testSmallPrime(){
		App appObj = new App();
		assertEquals(appObj.isPrime(17),true);
	}
	
	@Test
	public void testSmallNoPrime(){
		App appObj = new App();
		assertEquals(appObj.isPrime(33),false);
	}
	@Test
	public void testLargePrime(){
		App appObj = new App();
		assertEquals(appObj.isPrime(32416189049L),true);
	}
	@Test
	public void testLargeNoPrime(){
		App appObj = new App();
		assertEquals(appObj.isPrime(32416189051L),false);
	}
	@Test
	public void test1(){
		App appObj = new App();
		List<Integer> list = Arrays.asList(2,2,3);
		assertEquals(appObj.first(12),list);
	}
	@Test
	public void test2(){
		App appObj = new App();
		assertEquals(appObj.two(2,11),5);
	}
	@Test
	public void test3(){
		App appObj = new App();
		assertEquals(appObj.three(new int[]{2,3,5,7,9,11}),5);
	}
}
