package by.htp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

	private final String BASE_URL = "http://quizful.net";

	@FindBy(linkText = "войти")
	private WebElement authorizationField;

	@FindBy(id = "login")
	private WebElement inputLogin;

	@FindBy(name = "loginForm.password")
	private WebElement inputPassword;

	@FindBy(name = "ok")
	private WebElement enterButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

	public void login(String username, String password) {

		// authorizationField = driver.findElement(By.linkText("войти"));
		authorizationField.click();

		// inputLogin = driver.findElement(By.id("login"));
		inputLogin.sendKeys(username);

		// inputPassword = driver.findElement(By.name("loginForm.password"));
		inputPassword.sendKeys(password);
		// enterButton = driver.findElement(By.name("ok"));
		enterButton.click();

	}

}
