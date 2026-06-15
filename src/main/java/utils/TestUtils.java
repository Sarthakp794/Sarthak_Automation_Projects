package utils;

public class TestUtils extends com.pages.Baseclass {
	
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static long EXPLICIT_WAIT = 20;
	public static long FLUENT_WAIT = 20;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
