package feature;


import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
ChromeDriver dr;
public void common() {
	boots b=new boots(dr);
String s= b.clickOnStuart();
 jacket j= new jacket(dr);
 String x=j.clickBadgley();
 s.compareTo(x);

}

}
