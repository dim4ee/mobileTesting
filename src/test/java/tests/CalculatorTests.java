package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {




    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(url,caps);

        System.out.println(driver.getDeviceTime());

        Assertions.assertEquals("android",driver.getPlatformName());

        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();

        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();

        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();

        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();


//        driver.findElement(By.id("com.google.android.calculator:id/formula"));


        Thread.sleep(4000);

        driver.closeApp();


    }
}
