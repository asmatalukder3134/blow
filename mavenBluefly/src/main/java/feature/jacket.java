package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jacket {
	ChromeDriver dr;
	public jacket(ChromeDriver dr){
		this.dr=dr;
	}
	public void buyBadgley() {
		dr.findElement(By.xpath(".//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[4]/div/div[1]/a/span/span/img"));
	}
	public String clickBadgley() {
	String p=	Share.clickGetText(dr, By.xpath(".//*[@id='product-price-']/span"));
	return p;
	}
	
public void addtoCart() {
	dr.findElement(By.xpath("html/body/div[2]/div[1]/header/div[3]/div[1]/div/a"));
}
public void nevigateBack() {
	dr.navigate().back();
}

}
