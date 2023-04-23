package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CotacaoAutomobilePage;
import runnes.Executa;

public class CotacaoAutomobileTeste {
	
	CotacaoAutomobilePage page = new CotacaoAutomobilePage();
	
		@Given("que o usuario esteja na home")
		public void queOUsuarioEstejaNaHome() {
			 Executa.abrirNavegador();
		}

		@Given("escolhe o formulario")
		public void escolheOFormulario() {
			  page.menu();
		}
		@Given("preencher os dados do Insira os dados do veículo")
		public void preencherOsDadosDoInsiraOsDadosDoVeículo() {
			 page.dadosDoVeiculo();
		}
		@Given("preencho os dados do Insira os dados do seguro")
		public void preenchoOsDadosDoInsiraOsDadosDoSeguro() {
			 page.dadosDoSeguro();
		}
		@Given("preencho os dados do Insira os dados do produto")
		public void preenchoOsDadosDoInsiraOsDadosDoProduto() {
		    page.dadosDoProduto();
		}
		@When("prrencho os dados da Selecione a opção de preço")
		public void prrenchoOsDadosDaSelecioneAOpçãoDePreço() {
		    page.opcaoDePreco();
		}
		@Then("sistema informa Envio de email com sucesso!")
		public void sistemaInformaEnvioDeEmailComSucesso() {
			page.enviarCotacao();
		   page.validarTexto();
		}



	





}
