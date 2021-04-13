package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\programs\\Seleniumselectdropdown\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
	    WebElement fruitbox = driver.findElement(By.id("fruits"));
	    Select s=new Select(fruitbox);
	    boolean multiple = s.isMultiple();
	    System.out.println(multiple);
	    s.selectByVisibleText("Banana");
	    s.selectByValue("apple");
	    s.selectByIndex(2);
	    s.deselectAll();
	    System.out.println("To get all options.........");
	    List<WebElement> all = s.getOptions();
	    for(WebElement w:all){
	    	System.out.println(w.getText());
	    }
	    
	    System.out.println("To get selected options.................");
	    List<WebElement> sel = s.getAllSelectedOptions();
	    for(int i=0;i<sel.size();i++){
	    WebElement w = sel.get(i);
	    System.out.println(w.getAttribute("innerText"));
	    }
	    
	    System.out.println("To get first selected options.........");
	    WebElement f = s.getFirstSelectedOption();
	    System.out.println(f.getText());
	    
	    System.out.println("To get even options.................");
	    List<WebElement> sell = s.getAllSelectedOptions();
	    for(int i=0;i<sell.size();i=i+2){
	    WebElement w = sell.get(i);
	    System.out.println(w.getAttribute("innerText"));
	    }
	    Thread.sleep(300);
	    
	    s.selectByVisibleText("Banana");
	    s.selectByValue("apple");
	    s.selectByIndex(2);
	    s.deselectByVisibleText("Banana");
	       
	    
	}

}
