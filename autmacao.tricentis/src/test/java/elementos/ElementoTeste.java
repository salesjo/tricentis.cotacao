package elementos;

import org.openqa.selenium.By;

public class ElementoTeste {
	private By make = By.xpath("//select[@id='make']");
	 private By enginePerformance = By.xpath("//input[@id='engineperformance']");
	 private By dateOfManufacture = By.xpath("//input[@id='dateofmanufacture']");
	 private By numberOfSeats = By.xpath("//select[@id='numberofseats']");
	 private By fuelType = By.xpath("//select[@id='fuel']");
	 private By listPrice = By.xpath("//input[@id='listprice']");
	 private By licensePlateNumber = By.xpath("//input[@id='licenseplatenumber']");
	 private By annualMileage = By.xpath("//input[@id='annualmileage']");
	 private By next = By.xpath("//button[@id='nextenterinsurantdata']");
	 private By payload = By.xpath("//input[@id='payload']");
	 private By  totalweight = By.xpath("//input[@id=' totalweight']");
	
	
	

	 private By firstName = By.xpath("//input[@id='firstname']");
	 private By lastName = By.xpath("//input[@id='lastname']");
	 private By dateOfBirth = By.xpath("//input[@id='birthdate']");
	 private By gender = By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span");
	 private By streetAddress = By.xpath("//input[@id='streetaddress']");
	 private By country = By.xpath("//select[@id='country']");
	 private By zipCode = By.xpath("//input[@id='zipcode']");
	 private By city = By.xpath("//input[@id='city']");
	 private By occupation = By.xpath("//select[@id='occupation']");
	 private By hobbies = By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[5]/span");
	 private By next1 = By.xpath("//button[@id='nextenterproductdata']");
	 
	 
	 
	 private By startDate = By.xpath("//input[@name='Start Date']");
	 private By insuranceSum = By.xpath("//select[@id='insurancesum']");
	 private By meritRating = By.xpath("//select[@id='meritrating']");
	 private By damageInsurance = By.xpath("//select[@id='damageinsurance']");
	 private By optionalProducts = By.xpath("//form[@id='insurance-form']/div/section[3]/div[5]/p/label[2]/span");
	 private By courtesyCar = By.xpath("//select[@id='courtesycar']");
	 private By next2 = By.xpath("//button[@id='nextselectpriceoption']");

	 private By selectOption = By.xpath("//table[@id='priceTable']/tfoot/tr/th[2]/label[4]/span");
	 private By downloadQuote = By.xpath("//a[@id='downloadquote']/span/i");
	 private By next3 = By.xpath("//button[@id='nextsendquote']");
	 
	 //
	 private By email = By.xpath("//input[@id='email']");
	 private By phone= By.xpath("//input[@id='phone']");
	 private By username = By.xpath("//input[@id='username']");
	 private By password = By.xpath("//input[@id='password']");
	 private By confirmPassword = By.xpath("//input[@id='confirmpassword']");


	private By msg = By.xpath("//h2[text()='Sending e-mail success!']");
	
	
	
	public By getMsg() {
		return msg;
	}

	public By getEmail() {
	  return email;
	 }

	 public By getPhone() {
	  return phone;
	 }

	 public By getUsername() {
	  return username;
	 }

	 public By getPassword() {
	  return password;
	 }

	 public By getConfirmPassword() {
	  return confirmPassword;
	 }

	 public By getComments() {
	  return comments;
	 }

	 public By getSend() {
	  return send;
	 }

	 private By comments = By.xpath("//input[@id='Comments']");
	 private By send = By.xpath("//button[@id='sendemail']");
	 public By getDownloadQuote() {
	  return downloadQuote;
	 }

	 public By getNext3() {
	  return next3;
	 }

	 public By getSelectOption() {
	  return selectOption;
	 }

	 public By getStartDate() {
	  return startDate;
	 }

	 public By getInsuranceSum() {
	  return insuranceSum;
	 }

	 public By getMeritRating() {
	  return meritRating;
	 }

	 public By getDamageInsurance() {
	  return damageInsurance;
	 }

	 public By getOptionalProducts() {
	  return optionalProducts;
	 }

	 public By getCourtesyCar() {
	  return courtesyCar;
	 }

	 public By getNext2() {
	  return next2;
	 }

	 public By getNext() {
	  return next;
	 }

	 public By getFirstName() {
	  return firstName;
	 }

	 public By getLastName() {
	  return lastName;
	 }

	 public By getDateOfBirth() {
	  return dateOfBirth;
	 }

	 public By getGender() {
	  return gender;
	 }

	 public By getStreetAddress() {
	  return streetAddress;
	 }

	 public By getCountry() {
	  return country;
	 }

	 public By getZipCode() {
	  return zipCode;
	 }

	 public By getCity() {
	  return city;
	 }

	public By getMake() {
		return make;
	}

	public By getEnginePerformance() {
		return enginePerformance;
	}

	public By getDateOfManufacture() {
		return dateOfManufacture;
	}

	public By getNumberOfSeats() {
		return numberOfSeats;
	}

	public By getFuelType() {
		return fuelType;
	}

	public By getListPrice() {
		return listPrice;
	}

	public By getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public By getAnnualMileage() {
		return annualMileage;
	}

	public By getOccupation() {
		return occupation;
	}

	public By getHobbies() {
		return hobbies;
	}

	public By getNext1() {
		return next1;
	}


}