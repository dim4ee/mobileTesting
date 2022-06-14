package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CalculatorPage;

public class CalculatorPOMTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void test1(){
        calculatorPage.clickSingleDigit(3);
        calculatorPage.multiplyBtn.click();
        calculatorPage.clickSingleDigit(3);
        calculatorPage.equalsBtn.click();
        Assertions.assertEquals("9",calculatorPage.result.getText());
    }
}
