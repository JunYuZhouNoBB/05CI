/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

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
		assertEquals(appObj.factors(2),2);
	}
	@Test
	public void test2(){
		App appObj = new App();
		assertEquals(appObj.two(2,11),5);
	}
}
