package Test;

import com.sun.jdi.VoidType;
import dev.failsafe.internal.util.Assert;
import static org.junit.Assert.*;
import org.junit.Assert.*;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.*;
import org.w3c.dom.ls.LSOutput;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.Wait.*;

public class CrearOT_Beta {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sofil\\Desktop\\SeleniumTest\\Engie\\src\\main\\resources\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Instantiate a ChromeDriver class.

        // Launch Website
        driver.get("https://beta.onfield.io/signin");
        //https://kitchencenterqa.onfield.cl/admin/index.php?route=common/login
        //https://onfielddev.onfield.cl/admin/index.php

        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 1020));
        driver.findElement(By.xpath("//input[@id='signin_username']")).click();
        driver.findElement(By.xpath("//input[@id='signin_username']")).sendKeys("jhoyner.adm");
        driver.findElement(By.xpath("//input[@id='signin_password']")).click();
        driver.findElement(By.xpath("//input[@id='signin_password']")).sendKeys("JhoyneR.1234.");

        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Órdenes de trabajo")).click();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Lista de Órdenes de trabajo")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector(".ant-menu-submenu-active .ant-menu-title-content")).click();
        driver.findElement(By.cssSelector(".ant-menu-title-content:nth-child(1)")).click();
        driver.switchTo().frame(0);
        {
            WebElement element = driver.findElement(By.cssSelector(".pull-right > .btn-primary"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }


        System.out.println("Passeable");


        String ActualTittle = driver.getTitle();
        System.out.println(ActualTittle);
        String ExpectedTittle = "Lista de Ordenes de Servicio";

        assertEquals(ExpectedTittle,ActualTittle);



    }
}

