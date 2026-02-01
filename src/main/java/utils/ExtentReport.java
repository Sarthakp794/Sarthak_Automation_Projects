package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static ExtentReports extent;
    public static ExtentTest test;

    public static ExtentReports getReportInstance() {

        if (extent == null) {
            ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/ExtentReport.html");

            reporter.config().setReportName("Automation Test Report");
            reporter.config().setDocumentTitle("Sleek Bill Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(reporter);

            extent.setSystemInfo("OS", "Windows 11");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Tester", "Sarthak Pawar");
        }
        return extent;
    }
	
}
