package pages;

import elementos.ElementoTeste;
import metodos.Metodos;

public class CotacaoAutomobilePage {
	Metodos metodos = new Metodos();
	ElementoTeste el = new ElementoTeste();

	public void menu() {
		metodos.acessarMenutexto("Truck");
		metodos.tirarPrint("CT01 - enviarCotacaoAutomobile");
	}

	public void dadosDoVeiculo() {

		// Insira os dados do veiculo
		metodos.escrever(el.getMake(), "BMW");
		metodos.escrever(el.getEnginePerformance(), "2");
		metodos.escrever(el.getDateOfManufacture(), "06/22/2022");
		metodos.escrever(el.getNumberOfSeats(), "5");
		metodos.escrever(el.getFuelType(), "Diesel");
		metodos.escrever(el.getListPrice(), "5000");
		metodos.escrever(el.getLicensePlateNumber(), "ert3456");
		metodos.escrever(el.getAnnualMileage(), "300");
		metodos.clicar(el.getNext());
		metodos.tirarPrint("CT02 - dadosDoVeiculo");
	}
		public void dadosDoSeguro() { 
		metodos.escrever(el.getFirstName(), "Sandra");
		metodos.escrever(el.getLastName(), "Sales");
		metodos.escrever(el.getDateOfBirth(), "08/23/1980");
		metodos.clicar(el.getGender());
		metodos.escrever(el.getStreetAddress(), "Rua 07");
		metodos.escrever(el.getCountry(), "Brazil");
		metodos.escrever(el.getZipCode(), "080433");
		metodos.escrever(el.getCity(), "Osasco");
		metodos.escrever(el.getOccupation(), "empregador");
		metodos.clicar(el.getHobbies());
		metodos.clicar(el.getNext1());
		metodos.tirarPrint("CT03 - dadosDoSeguro");
		}
		public void dadosDoProduto() {
		metodos.escrever(el.getStartDate(), "07/13/2023");
		metodos.escrever(el.getInsuranceSum(), "5.000.000.00");
		metodos.escrever(el.getMeritRating(), "Super Bonus");
		metodos.escrever(el.getDamageInsurance(), "No Coverage");
		metodos.clicar(el.getOptionalProducts());
		metodos.escrever(el.getCourtesyCar(), "Yes");
		metodos.clicar(el.getNext2());
		metodos.tirarPrint("CT04 - dadosDoProduto");
		}
		public void opcaoDePreco() {
		metodos.scroll(0, 400);
		metodos.clicar(el.getSelectOption());
		metodos.pausa(2000);
		metodos.clicar(el.getNext3());
		metodos.tirarPrint("CT05 - selectPriceOption");
	}

	public void enviarCotacao() {
		// enviar cotação
		metodos.escrever(el.getEmail(), "test@gjhgg.com");
		metodos.escrever(el.getPhone(), "1123451234");
		metodos.escrever(el.getUsername(), "SAND");
		metodos.escrever(el.getPassword(), "Sa1234");
		metodos.escrever(el.getConfirmPassword(), "Sa1234");
	   metodos.clicar(el.getSend());
		metodos.tirarPrint("CT06 - fim do teste");
	}

	public void validarTexto() {
		metodos.pausa(9000);
	
	    metodos.validar(el.getMsg(), "");
		metodos.tirarPrint("CT07 - fim do teste");
		
	
	}

}
