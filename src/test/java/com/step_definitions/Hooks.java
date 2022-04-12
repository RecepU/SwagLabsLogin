package com.step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = Driver.getDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // you can also add maximize screen here
    }

    @After
    public void tearDown(Scenario scenario) {
//        System.out.println("I am reporting the results");
        // I want to take screenshot when current scenario fails.
        // scenario.isFailed()  --> tells if the scenario failed or not
        if (scenario.isFailed()) {
            // this line is for taking screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // this line is adding the screenshot to the report
//            scenario.attach(screenshot, "image/png", "image");
            scenario.embed(screenshot,"image/png");
        }

//        System.out.println("Closing driver");
        Driver.closeDriver();
    }
}
