package pages;

import Utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public CalculatorPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiplyBtn;

    @AndroidFindBy(accessibility = "equals")
    public MobileElement equalsBtn;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public MobileElement result;


    public void clickSingleDigit(int digit){
        MobileElement digitBtn = Driver.getDriver().findElement(By.id("com.google.android.calculator:id/digit_"+ digit));
        digitBtn.click();
    }
}
