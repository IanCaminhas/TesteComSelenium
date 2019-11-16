package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGloboEsporteTest {

	private WebDriver driver;

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
	public void testaTituloGloboEsporte() throws InterruptedException {
		// abrir pagina no navegador
		this.driver.get("https://globoesporte.globo.com/");
		assertTrue("Titulo da pagina difere do esperado", driver.getTitle().contentEquals("globoesporte.com"));
		Thread.sleep(5000);

	}

}
