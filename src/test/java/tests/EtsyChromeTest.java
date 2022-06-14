package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EtsyChromeTest extends WebTestBase {


    @DisplayName("Etsy chrome test")
    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.etsy.com/");

//        Thread.sleep(3000);
//
//        WebElement searchField = driver.findElement(By.name("search_query"));
//        searchField.sendKeys("Wooden Spoon"+ Keys.ENTER);
//        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'results,')]")).getText());

        String email = "areatha@uspeakw.com";
        String password = "Cybertek2020";

        Thread.sleep(2000);

        WebElement signIn = driver.findElement(By.xpath("//a[@class = 'wt-btn wt-btn--small wt-btn--transparent wt-btn--icon wt-btn--transparent-flush-right']"));
        signIn.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@id = 'join_neu_email_field']"));

        emailInput.sendKeys(email);

        WebElement submit = driver.findElement(By.xpath("//button[@type= 'submit']"));

        submit.click();

        Thread.sleep(2000);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id = 'join_neu_password_field']"));

        passwordInput.sendKeys(password+ Keys.ENTER);







    }



}
