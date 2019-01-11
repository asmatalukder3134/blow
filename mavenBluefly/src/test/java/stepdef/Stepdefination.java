package stepdef;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import feature.Home;
import feature.Step1;
import feature.boots;
import feature.jacket;

public class Stepdefination {
	boots b;
	jacket j;
	ChromeDriver dr;
	@Given("^openBrowser and get url$")
	public void openbrowser_and_get_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.bluefly.com/");
	    
	}

	@Given("^move on woman$")
	public void move_on_woman() throws Throwable {
		Step1 s=new Step1(dr);
	    s.moverToWoman();
	}

	@Given("^click boots and jackets$")
	public void click_boots_and_jackets() throws Throwable {
	    b= new boots(dr);
	    b.buyStuart();
	    j=new jacket(dr);
	    j.buyBadgley();
	   
	    
	}

	@Given("^add to cart$")
	public void add_to_cart() throws Throwable {
	    b.addCart();
	    j.addtoCart();
	}
	

	@Given("^garb this total price$")
	public void garb_this_total_price() throws Throwable {
	    b.clickOnStuart();
	    j.clickBadgley();
	}

	@Then("^click left arrow$")
	public void click_left_arrow() throws Throwable {
		b.nevigateBack();
		j.nevigateBack();
	    
	}

	@Then("^thorows the compair both price$")
	public void thorows_the_compair_both_price() throws Throwable {
		Home h=new Home();
	    h.common();
	}



}
