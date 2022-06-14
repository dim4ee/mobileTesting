package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorActionsTest {

    AppiumDriver<MobileElement> driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

         driver = new AndroidDriver<>(url,caps);

    }

    @DisplayName("Calculator Addition Test")
    @Test
    public void test1(){

        MobileElement fourBtn = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        MobileElement plus = driver.findElement(MobileBy.AccessibilityId("plus"));
        MobileElement fiveBtn = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        MobileElement equal = driver.findElement(MobileBy.AccessibilityId("equals"));

        fourBtn.click();
        plus.click();
        fiveBtn.click();
        equal.click();

        String expectedResult = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();

        Assertions.assertEquals("9",expectedResult);
    }

    @DisplayName("Calculator division test")
    @Test
    public void test2(){

        MobileElement oneBtn = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        oneBtn.click();

        MobileElement fiveBtn = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        fiveBtn.click();

        MobileElement divideBtn = driver.findElement(MobileBy.AccessibilityId("divide"));
        divideBtn.click();

        fiveBtn.click();

        MobileElement equal = driver.findElement(MobileBy.AccessibilityId("equals"));
        equal.click();

        MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));

        Assertions.assertEquals("3",result.getText());


    }

    @AfterEach
    public void tearDown(){
        driver.closeApp();
    }
}
