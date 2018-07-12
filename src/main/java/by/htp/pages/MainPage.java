package by.htp.pages;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage {


	private WebElement profile;
	
	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	
	@Override
	public void openPage() throws OperationNotSupportedException {
		throw new OperationNotSupportedException("Not allowed");
		
	}

	public String getAuthorizedName() {

		profile = driver.findElement(By.xpath("//*[@id='user-panel']/li[1]/b/a"));
		String authorizedName = profile.getText();

		return authorizedName;
	}


	
}
