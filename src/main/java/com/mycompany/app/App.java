package com.mycompany.app;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtreedec240\\Desktop\\selenium\\my-app\\driver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
    
       driver.get("https://techademy.in/mindtreeorchard/account/landing");
       driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("Stains.Abi@mindtree.com");
       driver.findElement(By.xpath("//*[@type='password']")).sendKeys("ba3456cb4b104fec");
       driver.findElement(By.xpath("//button[@class='mat-focus-indicator submit-button ng-tns-c335-3 mat-raised-button mat-button-base']")).click();
       Thread.sleep(20000L);
       driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger user-button mat-button mat-button-base']")).click();
       Thread.sleep(20000L);
       driver.findElement(By.xpath("(//button[@class='mat-focus-indicator mat-menu-item ng-tns-c207-5'])[3]")).click();
      
    
    }
}
