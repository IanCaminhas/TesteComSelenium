package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogleTest {

	private WebDriver driver;
	private WebElement searchBox;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.drive", "/usr/bin/chromedriver");
		driver = new ChromeDriver(); // abre o navegador
	}

	@After
	public void tear() throws Exception {
		this.driver.quit(); // fecha chrome apos execucao dos testes

	}

	@Test
	public void testaPesquisaGoogleComEditoraGlobo() throws InterruptedException {
		driver.get("https://www.google.com.br");

		searchBox = driver.findElement(By.cssSelector("[name='q']"));
		searchBox.sendKeys("Editora Globo");
		Thread.sleep(5000);
		searchBox.submit();

		driver.findElement(By.cssSelector("#search"));

		Assert.assertEquals(true, driver.getTitle().startsWith("Editora Globo"));

	}

}
