package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step1 {
	ChromeDriver dr;
	public Step1(ChromeDriver dr){
		this.dr=dr;
	}
	public void moverToWoman() {
		Share.mouceHover(dr, dr.findElementByXPath(".//*[@id='vesitem-12015515428708041250430619']/a/span[1]"));
	}
	
	public boots clickBootsAndJacket() {
		Share.click(dr, By.xpath(".//*[@id='vesitem-12015515428708041250430619']/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[1]/a"));
		return new boots(dr);
	}
	
	public jacket clickOnJacket() {
		Share.click(dr, By.xpath(".//*[@id='vesitem-1201551542957206945156002']/div/div/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/div[2]/a/span"));
	return new jacket(dr);
	
	
	}
	
	
	
	
	
}
