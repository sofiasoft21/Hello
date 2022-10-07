package Test;

import com.sun.jdi.VoidType;
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

public class CrearOT {

    public static void main(String[] args) throws InterruptedException {


        // System Property for Chrome Driver

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sofil\\Desktop\\SeleniumTest\\Engie\\src\\main\\resources\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Instantiate a ChromeDriver class.

        // Launch Website
        driver.get("https://kitchencenterqa.onfield.cl/admin/index.php?route=common/login");
        //https://kitchencenterqa.onfield.cl/admin/index.php?route=common/login
        //https://onfielddev.onfield.cl/admin/index.php
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 1020));
        driver.findElement(By.id("input-username")).sendKeys("sofia.blanco");
        //sofia.blanco
        driver.findElement(By.id("input-password")).sendKeys("Sofia.1234");
        driver.findElement(By.cssSelector(".btn")).click();

        System.out.println("Permitio ingresar al aplicativo");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("button-menu")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.linkText("Órdenes de trabajo")).click();
            driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
            driver.findElement(By.linkText("Lista de Órdenes de trabajo")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        System.out.println("Permitio seleccionar");
        System.out.println(driver.getCurrentUrl());

        {
            WebElement element = driver.findElement(By.cssSelector(".pull-right > .btn-primary"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }


        driver.findElement(By.cssSelector(".pull-right > .btn-primary")).
                click();
        driver.findElement(By.id("sucursal")).click();
        System.out.println("Permitio seleccionar Sucursal");

        {
            String numbers = "123456789";


            int length = 1;


            String values = numbers;

            Random randomGenerator = new Random();
            System.out.println("3");

            StringBuilder sa = new StringBuilder();
            StringBuilder sb = new StringBuilder();
            StringBuilder sc = new StringBuilder();
            StringBuilder sd = new StringBuilder();
            StringBuilder se = new StringBuilder();
            StringBuilder sf = new StringBuilder();
            StringBuilder sg = new StringBuilder();
            StringBuilder sh = new StringBuilder();

            for (int i = 0; i < length; i++) {


                int index = randomGenerator.nextInt(values.length());
                int index1 = randomGenerator.nextInt(values.length());
                int index2 = randomGenerator.nextInt(values.length());
                int index3 = randomGenerator.nextInt(values.length());
                int index4 = randomGenerator.nextInt(values.length());
                int index5 = randomGenerator.nextInt(values.length());
                int index6 = randomGenerator.nextInt(values.length());
                int index7 = randomGenerator.nextInt(values.length());

                System.out.println("Si esta validando la longitud");

                char randomChar = values.charAt(index);
                char randomChar1 = values.charAt(index1);
                char randomChar2 = values.charAt(index2);
                char randomChar3 = values.charAt(index3);
                char randomChar4 = values.charAt(index4);
                char randomChar5 = values.charAt(index5);
                char randomChar6 = values.charAt(index6);
                char randomChar7 = values.charAt(index7);


                sa.append(randomChar);
                sb.append(randomChar1);
                sc.append(randomChar2);
                sd.append(randomChar3);
                se.append(randomChar4);
                sf.append(randomChar5);
                sg.append(randomChar6);
                sh.append(randomChar7);

                String sa2 = sa.toString();
                String sb2 = sb.toString();
                String sc2 = sc.toString();
                String sd2 = sd.toString();
                String se2 = se.toString();
                String sf2 = sf.toString();
                String sg2 = sg.toString();
                String sh2 = sh.toString();

                System.out.println(sa2 + sb2 + sc2 + sd2 + se2 + sf2 + sg2 + sh2);
                String letras;
                letras = sa2 + sb2 + sc2 + sd2 + se2 + sf2 + sg2 + sh2;

                int sh3 = Integer.parseInt(sh2);
                int sh4 = sh3 * 2;

                int sg3 = Integer.parseInt(sg2);
                int sg4 = sg3 * 3;

                int sf3 = Integer.parseInt(sf2);
                int sf4 = sf3 * 4;

                int se3 = Integer.parseInt(se2);
                int se4 = se3 * 5;

                int sd3 = Integer.parseInt(sd2);
                int sd4 = sd3 * 6;

                int sc3 = Integer.parseInt(sc2);
                int sc4 = sc3 * 7;

                int sb3 = Integer.parseInt(sb2);
                int sb4 = sb3 * 2;

                int sa3 = Integer.parseInt(sa2);
                int sa4 = sa3 * 3;

                System.out.println("este es el resultado" + sh4 + sg4 + sf4 + se4 + sd4 + sc4 + sb4 + sa4);

                int abecedario = sh4 + sg4 + sf4 + se4 + sd4 + sc4 + sb4 + sa4;

                System.out.println("este es el resultado de la suma anterior = " + abecedario);

                int abecedario1 = abecedario / 11;

                System.out.println("este es el resultado de la division anterior = " + abecedario1);

                int abecedario2 = abecedario1 * 11;

                System.out.println("este es el resultado de la multi anterior = " + abecedario2);

                int abecedario3 = abecedario - abecedario2;

                System.out.println("este es el resultado de la resta anterior = " + abecedario3);

                int abecedario4 = 11 - abecedario3;

                System.out.println("el resultado de 4 es =" + abecedario4);

                String abecedario5 = Integer.toString(abecedario4);
                String abecedario6;

                if (abecedario4 == 11) {

                    abecedario6 = "0";

                } else if (abecedario4 == 10) {

                    abecedario6 = "K";
                } else {

                    abecedario6 = abecedario5;
                }


                System.out.println("este es el resultado del validador anterior = " + abecedario6);

                String s = "-" + abecedario6;
                String letras1 = letras + s;
                String letras2 = letras + abecedario6 + "C";

                System.out.println("El rut es" + letras1);

                driver.findElement(By.id("sucursal")).sendKeys(letras1);
                driver.findElement(By.id("valor3")).click();
                driver.findElement(By.id("container")).click();
                driver.findElement(By.id("valor3")).click();
                driver.findElement(By.id("valor3")).sendKeys(letras2);
                System.out.println("Si ingreso el codigo SAP correctamente = " + letras2);
                driver.findElement(By.id("valor2")).click();
                driver.findElement(By.id("valor2")).sendKeys("3103574286");
                //3103574286
                //976495010
                //3102801470
                //3167777005
                driver.findElement(By.id("valor1")).click();
                driver.findElement(By.id("valor1")).sendKeys("sofia.blanco@assertsoft.com");
                //sofia.blanco@assertsoft.com
                //fabrizio.sanchirico@assertsoft.com
                //leidy.aley@assertsoft.com
                //julian.chilito@assertsoft.com
                driver.findElement(By.id("valor4")).click();
                driver.findElement(By.id("valor4")).sendKeys("4");
                driver.findElement(By.id("nombre")).click();
                driver.findElement(By.id("nombre")).sendKeys("Caso de prueba " + abecedario);


                driver.findElement(By.id("direccion")).sendKeys("Chacabuco 857, Copiapó, Atacama, Chile");

                //WebElement element = driver.findElement(By.cssSelector(".pull-right > .btn-primary"));
                //Actions builder = new Actions(driver);
                //builder.moveToElement(element).perform();


                WebElement element1 = driver.findElement(By.xpath("//input[@name=\"direccion2\"]"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element1).perform();
                System.out.println("3");
                driver.findElement(By.id("direccion2")).sendKeys("CASA1");
                System.out.println("4");

                driver.findElement(By.cssSelector(".row:nth-child(11) > .col-sm-12")).click();
                driver.findElement(By.id("direccion_error")).click();
                driver.findElement(By.id("direccion_error")).click();
                driver.findElement(By.cssSelector("#direccion_error > .control-label")).click();
                driver.findElement(By.cssSelector(".col-md-6:nth-child(1) .col-sm-12:nth-child(1)")).click();
                driver.findElement(By.id("direccion_error")).click();
                driver.findElement(By.id("direccion_error")).click();
                driver.findElement(By.id("direccion_error")).click();

                WebElement dropdown;
                //{
                //Select selectlist = new Select(driver.findElement(By.id("id_zona")));
                //  selectlist.selectByVisibleText("RUTA 02");
                // System.out.println("5");

                //}

                JavascriptExecutor js = (JavascriptExecutor) driver;
                //js.executeScript("window.scrollTo(0,1601)");
                js.executeScript("window.scrollTo(0,50)");

                driver.findElement(By.id("region")).click();
                {
                    Select selectlist = new Select(driver.findElement(By.id("region")));
                    selectlist.selectByVisibleText("Atacama");
                    System.out.println("Si escogio Region");


                    //dropdown = driver.findElement(By.id("region"));
                    //dropdown.findElement(By.xpath("//option[. = 'Antofagasta']")).click();
                }
                driver.findElement(By.id("comuna")).click();
                {
                    dropdown = driver.findElement(By.id("comuna"));
                    dropdown.findElement(By.xpath("//option[. = 'Copiapó']")).click();
                    System.out.println("Si escogio Comuna");
                }
                js.executeScript("window.scrollTo(0,1601)");
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

                //driver.findElement(By.id("pedido_origen_orden_trabajo")).click();
                {
                    Select selectlist = new Select(driver.findElement(By.id("pedido_origen_orden_trabajo")));
                    selectlist.selectByVisibleText("Correo");
                    System.out.println("Si escogio Correo");


                    //dropdown = driver.findElement(By.id("pedido_origen_orden_trabajo"));
                    //dropdown.findElement(By.xpath("//option[. = 'Correo']")).click();
                }
                dropdown = driver.findElement(By.id("pedido_tipo_pedido"));
                {
                    Select selectlist1 = new Select(driver.findElement(By.id("pedido_tipo_pedido")));
                    selectlist1.selectByVisibleText("Visita técnica");
                    selectlist1.selectByValue("1");
                    System.out.println("Si escogio VT");


                    driver.findElement(By.id("select2-pedido_sintoma-container")).click();
                    driver.findElement(By.id("pedido_tipo_garantia")).click();
                    {
                        WebElement dropdown1 = driver.findElement(By.id("pedido_tipo_garantia"));
                        dropdown1.findElement(By.xpath("//option[. = 'Sin garantía']")).click();
                    }
                    driver.findElement(By.id("pedido_centro_costo")).click();
                    {
                        WebElement dropdown2 = driver.findElement(By.id("pedido_centro_costo"));
                        dropdown2.findElement(By.xpath("//option[. = 'Pos Venta (SAT)']")).click();
                    }
                    driver.findElement(By.id("pedido_nota")).click();
                    driver.findElement(By.id("pedido_nota")).sendKeys("Nota");
                    driver.findElement(By.id("form")).click();
                    //driver.findElement(By.cssSelector(".guardar")).click();
                    //driver.close();
                }


            }


        }

    }
}






