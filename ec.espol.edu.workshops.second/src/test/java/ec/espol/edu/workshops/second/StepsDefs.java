package ec.espol.edu.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.*; 

public class StepsDefs {
	
private Boolean license;
private String married;
private int actualAnswer;
private int age;
private Boolean age_max;
private Boolean younger_customer;
private Boolean gender;


@Given("Do you meet the age requirement?") 
public Boolean Do_you_meet_the_age_requirement(int age) 
{
	if(age > 80) {
		return age_max = true;
	}else {
		return age_max = false;
	}
}

@When("your age is entered") 
//CarInsurance user4 = new CarInsurance("M",45,"Married", true);
public void your_age_is_entered() {
	//PremiumCalculation premiumCalc = new PremiumCalculation();
	CarInsurance car = new CarInsurance("M",89,"Married",true);
	actualAnswer = car.calculo(); 
}

@Then("show -1")
public void show_1() {
	assertEquals(-1, actualAnswer); 
}

@Given("the client is 46 years") 
public void the_client_is_46_years(int age) 
{
	this.age=46;
}

@And("status_married is married")
public void status_married_is_married(Boolean married) {
	this.married = "married";
}

@When("the insurance  is calculated") 
//CarInsurance user4 = new CarInsurance("M",45,"Married", true);
public void the_insurance_is_calculated() {
	//PremiumCalculation premiumCalc = new PremiumCalculation();
	CarInsurance car2 = new CarInsurance("F",age,married,true);
	actualAnswer = car2.calculo(); 
}
@Then("the value of the premium will be")
public void the_value_of_the_premium_will_be() {
	assertEquals(200, actualAnswer); 
}




@Given("the user inputs <data> in the license field") 
public void the_user_input_data_int_the_license_field(int age) 
{
	this.license=false;
}


@When("you enter the data in license") 
public void you_enter_the_data_in_license() {
	CarInsurance car3 = new CarInsurance("M",25,"not married",false);
	actualAnswer = car3.calculo(); 
}
@Then("Then they should show")
public void Then_they_should_show() {
	assertEquals(-1, actualAnswer); 
}



}


