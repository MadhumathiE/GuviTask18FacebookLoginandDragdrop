package facebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement sourceElement=driver.findElement(By.id("draggable"));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(sourceElement, targetElement).build().perform();
		
		String backgroundColor=targetElement.getCssValue("background-color");
		if(backgroundColor.equals("rgb(255,250,144)"))
		{
			System.out.println("Drag and drop operation successfull");
		}
		else 
		{
			System.out.println("Drag and drop operation failed");
		
		}
		String targetText=targetElement.getText();
		if(targetText.equals("Dropped!"))
				
				{
					System.out.println("Text changed to Dropped!");
				}
				else {
					System.out.println("Text not changed to Dropped!");
					
				}
	}
					
}				
				
				
		