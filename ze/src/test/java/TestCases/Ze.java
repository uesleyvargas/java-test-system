package TestCases;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import Utils.GerenciamentoDrivers;
import Page.EnderecoPage;


public class Ze {
	
	private WebDriver driver;
	GerenciamentoDrivers gerenciamentoDriver;
	EnderecoPage enderecoPage;
	
	
	@Before 
	public void setup() {
		gerenciamentoDriver = new GerenciamentoDrivers();
		driver = GerenciamentoDrivers.browser("chrome");
		enderecoPage = new EnderecoPage(driver);
		
		
		
	}
	
	String produto1 = "Bohemia 269ml";
	
	@Test
	public void ze() {
		driver.get("https://www.ze.delivery/");
		enderecoPage.endereco();
	}
	
	@After
	public void fim() {
		//driver.quit();
	}
	

}
