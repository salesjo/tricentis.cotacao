package runnes;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps", 
		tags = "@tag", 
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber-report.html" },
		snippets = SnippetType.CAMELCASE)

public class Executa extends DriversFactory {
	
	
	public static void iniciarTeste() {
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://sampleapp.tricentis.com/101/index.php");
	}
	public static void abrirNavegador() {
		
		String site ="http://sampleapp.tricentis.com/101/index.php" ;
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.get(site);
	}

	public static void fecharNavegador() {
		driver.quit();
	}
}
