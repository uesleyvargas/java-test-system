package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utils.AcoesSelenium;

public class EnderecoPage extends AcoesSelenium {
	
	private WebDriver driver;
	
	public EnderecoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static final By inputEndereco1 = By.xpath("//button[@class='css-4aqgp4']");
	public static final By inputEndereco2 = By.xpath("//input[@class='css-1ukbpq9']");
	public static final By inputEndereco3 = By.xpath("//input[@class='css-88gr7m']");
	public static final By retornoEndereco = By.xpath("//div[text()='Avenida Getúlio Vargas, 751']");
	public static final By inputNaoComplemento = By.xpath("//input[@class='css-1b4252z']");
	public static final By btnVerProdutos = By.xpath("//button[@class='css-1idxe26']");
	
	public void endereco() {
		click(driver, inputEndereco1, 10);
		click(driver, inputEndereco2, 20);
		enviarDados(driver,inputEndereco3, "Avenida Getulio Vargas 751 uberlândia", 10);
		click(driver, retornoEndereco, 10);
		click(driver, inputNaoComplemento, 10);
		click(driver, btnVerProdutos, 10);
	}

}
