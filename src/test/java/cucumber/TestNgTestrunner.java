package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import pages.BaseClass;

public class TestNgTestrunner extends BaseClass{
	
	
	@CucumberOptions(features="src/test/java/cucumber",glue="advantageonlineshop.stepDefination",
			monochrome=true, tags = "@Regression", plugin= {"html:target/cucumber.html"})
			public class TestNGTestRunner extends AbstractTestNGCucumberTests{
			}
}
