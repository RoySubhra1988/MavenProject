package base;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;


    @Parameters({url})
    @BeforeMethod
    public void setUp(@Optional("https://www.amazon.com/") String url){
        System.setProperty("webdriver.gecko.driver", "/Users/subhra/WebAutomation/Generic/Browser-Driver/geckodriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }


}


