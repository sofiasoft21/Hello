package Test1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CrearOS {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sofil\\Desktop\\SeleniumTest\\Engie\\src\\main\\resources\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Instantiate a ChromeDriver class.

        // Launch Website
        driver.get("https://engieqa.onfield.cl/admin/index.php?route=common/login");
        //https://kitchencenterqa.onfield.cl/admin/index.php?route=common/login
        //https://onfielddev.onfield.cl/admin/index.php
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 1020));
        driver.findElement(By.id("input-username")).sendKeys("sofia.blanco23");
        //sofia.blanco
        driver.findElement(By.id("input-password")).sendKeys("Sofia.1234");
        driver.findElement(By.cssSelector(".btn")).click();

        System.out.println("Permitio ingresar al aplicativo");

        {
            WebElement element = driver.findElement(By.cssSelector(".nav_logo"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        System.out.println("Paso 1");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        System.out.println("Paso 2");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".fa-indent")).click();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        System.out.println("Paso 3");

        driver.findElement(By.linkText("Órdenes de servicio")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("Paso 4");
        driver.findElement(By.linkText("Lista de Órdenes de servicio")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Paso 5");
        driver.findElement(By.cssSelector(".fa-plus")).click();
        System.out.println("Paso 6");
        driver.findElement(By.id("sucursal")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Paso 7");

        ////Suma de valores para id

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


                String NoOS = Integer.toString(abecedario);


                driver.findElement(By.id("sucursal")).sendKeys(NoOS);
                System.out.println("Paso 7.1");
                driver.findElement(By.id("nombre")).click();
                System.out.println("Paso 8");
                driver.findElement(By.id("nombre")).sendKeys("POSTE " + NoOS + " EDIFICIO PRINCIPAL");
                System.out.println("Paso 8.1");


                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0,50)");

                driver.findElement(By.id("direccion")).click();
                driver.findElement(By.id("direccion")).sendKeys("Carrera 1, Curicó, Chile");
                driver.findElement(By.cssSelector("#direccion_error > .control-label")).click();
                driver.findElement(By.cssSelector("#direccion2_error > .control-label")).click();
                driver.findElement(By.cssSelector("#direccion2_error > .control-label")).click();
                {
                    WebElement element = driver.findElement(By.cssSelector("#direccion2_error > .control-label"));
                    Actions builder = new Actions(driver);
                    builder.doubleClick(element).perform();
                }
                driver.findElement(By.id("region")).click();
                {
                    WebElement dropdown = driver.findElement(By.id("region"));
                    Select selectlist = new Select(driver.findElement(By.id("region")));
                    selectlist.selectByVisibleText("Maule");
                }
                driver.findElement(By.id("comuna")).click();
                {
                    WebElement dropdown = driver.findElement(By.id("comuna"));
                    dropdown.findElement(By.xpath("//option[. = 'Curicó']")).click();
                }

                js.executeScript("window.scrollTo(0,1601)");
                driver.findElement(By.id("pedido_id_cliente")).click();
                {
                    WebElement dropdown = driver.findElement(By.id("pedido_id_cliente"));
                    Select selectlist = new Select(driver.findElement(By.id("pedido_id_cliente")));
                    selectlist.selectByVisibleText("Municipalidad de Santiago");


                }
                driver.findElement(By.id("pedido_origen_orden_trabajo")).click();
                {
                    WebElement dropdown = driver.findElement(By.id("pedido_origen_orden_trabajo"));
                    Select selectlist = new Select(driver.findElement(By.id("pedido_origen_orden_trabajo")));
                    selectlist.selectByVisibleText("Llamado 800");
                }
                driver.findElement(By.id("pedido_tipo_pedido")).click();
                {
                    WebElement dropdown = driver.findElement(By.id("pedido_tipo_pedido"));
                    dropdown.findElement(By.xpath("//option[. = '24 Horas']")).click();
                }

                System.out.println("parte click 1");

                driver.findElement(By.xpath("//label[contains(text(),'Nombre contacto')]"));


                driver.findElement(By.id("pedido_valor2")).click();
                driver.findElement(By.id("pedido_valor2")).sendKeys("SOFIA");
                driver.findElement(By.id("pedido_valor3_error")).click();
                driver.findElement(By.id("pedido_valor3")).click();
                driver.findElement(By.id("pedido_valor3")).sendKeys("sofia.blanco@assertsoft.com");
                driver.findElement(By.id("pedido_valor4_error")).click();
                driver.findElement(By.id("pedido_valor4")).click();
                driver.findElement(By.id("pedido_valor4")).sendKeys("3103574286");
                driver.findElement(By.cssSelector("#pedido_valor5_error > .control-label")).click();
                driver.findElement(By.id("pedido_valor5")).click();
                driver.findElement(By.id("pedido_valor5")).sendKeys("0001");
                driver.findElement(By.cssSelector("#pedido_valor6_error > .control-label")).click();
                driver.findElement(By.id("pedido_valor6")).click();
                {
                    WebElement dropdown = driver.findElement(By.id("pedido_valor6"));
                    dropdown.findElement(By.xpath("//option[. = 'Alta']")).click();
                }
                driver.findElement(By.id("pedido_valor7")).click();
                driver.findElement(By.id("pedido_valor7")).sendKeys("12");
                driver.findElement(By.id("pedido_nota")).click();
                driver.findElement(By.id("pedido_nota")).sendKeys("Nota OK");


            }
        }
    }
}