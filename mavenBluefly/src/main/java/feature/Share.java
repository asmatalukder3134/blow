package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Share {
	ChromeDriver dr;
	Share(ChromeDriver dr){
		this.dr=dr;
	}
    public static void click(ChromeDriver dr,By by) {
    	dr.findElement(by).click();
    }
    
    public static  void mouceHover(ChromeDriver dr,WebElement e) {
    	Actions ac=new Actions(dr);
    	ac.moveToElement(e);
    }
    
   public static void dropDown(ChromeDriver dr,By by,String text) {
	   Select s=new Select(dr.findElement(by));
	   s.selectByVisibleText(text);
   }
    
    public  static String clickGetText( ChromeDriver dr, By by) {
    String s=	dr.findElement(by).getText();
    	return s;
    }
    
    
}
