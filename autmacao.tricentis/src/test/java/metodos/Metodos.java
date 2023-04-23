package metodos;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriversFactory;
import elementos.ElementoTeste;
public class Metodos extends DriversFactory{
	
	ElementoTeste el =new ElementoTeste();

	/**
	  * Informa o nome do menu que serÃ¡ escolhido 
	  * exemplo: Automobile
	  * @param menu
	  */
	 public void acessarMenutexto(String menu) {
	  By opcao = By.xpath("//div[@class='main-navigation']//ul[@class='menu']//li//a[text()='Automobile']");
	  clicar(opcao);
	   By menuInicial = By.xpath("//div[@class='main-navegation']//a[text()='"+menu+"']");
	 }

	 public void acessarMenuposicao(String posicao) {
	  By opcao = By.xpath("//div[@class='main-navigation']//ul[@class='menu']//li[" + posicao + "]");
	  clicar(opcao);
	 }

	 public void clicar(By elemento) {
	  driver.findElement(elemento).click();
	 }

	 public void submit(By elemento) {
	  driver.findElement(elemento).submit();
	 }

	 public void escrever(By elemento, String texto) {
	  driver.findElement(elemento).sendKeys(texto);
	 }

	 public void aguardarElemento(By elemento, int second) {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	 }

	 public void tirarPrint(String nomeEvidencia) {
	  try {
	   TakesScreenshot scrShot = (TakesScreenshot) driver;
	   File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
	   File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
	   FileUtils.copyFile(scrFile, destFile);

	  } catch (IOException e) {
	   System.err.println("*****************  ERRO AO TIRAR EVIDENCIA  *********************");
	   e.printStackTrace();
	  }

	 }
	  public void scroll(int n1, int n2) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
	 // js.executeScript("scrollBy(0,400)","");
	  }
	  public void pausa(int tempo) {
		  try {
		   Thread.sleep(tempo);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
		 }
	public void validar(By elemento,String texto) {
		String textoEsperado = driver.findElement(elemento).getText();
		assertTrue(textoEsperado.contains("Sending e-mail success!"));
	}
}
