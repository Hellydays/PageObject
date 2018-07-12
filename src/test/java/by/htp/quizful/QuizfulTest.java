package by.htp.quizful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.htp.pages.LoginPage;
import by.htp.pages.MainPage;

public class QuizfulTest {

	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "c:\\Driver\\chromedriver.exe";

	private WebDriver driver;
	private String login = "Anna_o";
	private String password = "7753191";

	@BeforeTest
	public void initDriver() {
		System.setProperty(CHROME, CHROME_PATH);
		driver = new ChromeDriver();
	}

	@Test
	public void authorizationTest() {

		LoginPage page = new LoginPage(driver);
		page.openPage();
		page.login(login, password);

		MainPage main = new MainPage(driver);
		String actualUserName = main.getAuthorizedName();
		Assert.assertEquals(actualUserName, login);

	}

}
