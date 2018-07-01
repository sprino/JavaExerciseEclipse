package it.begear.corsi.corsosdet.uitest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.Objects;

public class CalculatorPage extends LoadableComponent<CalculatorPage> {

	private WebDriver driver;

	@FindBy(id="number1")
	private WebElement num1;
	@FindBy(id="number2")
	private WebElement num2;
	@FindBy(xpath="/html/body/div/button")
	private WebElement clearButton;
	@FindBy(id="res")
	private WebElement res;
	
	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void focusPage() {
		num1.click();
	}
	
	public String getNum1() throws Exception {
		Thread.sleep(2000);
		return num1.getText();
	}

	public void scrivi(String numero1, String numero2) {
		num1.clear();
		num1.sendKeys(numero1);
		num2.clear();
		num2.sendKeys(numero2);
	}
	
	public String getNum2() {
		return num2.getText();
	}
	public String getRes() {
		return res.getText();
	}
	
	public boolean isClearPresent() {
		return Objects.nonNull(clearButton);
	}

	
	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(Objects.nonNull(clearButton));
	}

	@Override
	protected void load() {
		PageFactory.initElements(driver, this);
	}
}
