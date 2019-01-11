package feature;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class boots {
	ChromeDriver dr;
	public boots(ChromeDriver dr){
		this.dr=dr;
	}
	public void addCart() {
		dr.findElement(By.xpath("html/body/div[2]/div[1]/header/div[3]/div[1]/div/a"));
	}
	public void buyStuart() {
		dr.findElement(By.xpath(".//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[1]/div/div[1]/a/span/span/img"));
	}
	public String clickOnStuart() {
	String s=	Share.clickGetText(dr, By.xpath(".//*[@id='product-price-']/span"));
	return s;
	}
	
	
	public void nevigateBack() {
		dr.navigate().back();
	}

}
