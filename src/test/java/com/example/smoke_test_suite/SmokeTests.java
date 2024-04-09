package com.example.smoke_test_suite;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class SmokeTests extends page_objects {



    ChromeDriver driver = new ChromeDriver();

    String s = RandomStringUtils.randomAlphanumeric(5);

    @BeforeEach
    public void setup() {


//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);

        driver.get("https://wix.com");

        Cookie ck = new Cookie.Builder("wixSession2", "JWT.eyJraWQiOiJrdU42YlJQRCIsImFsZyI6IlJTMjU2In0.eyJkYXRhIjoie1widXNlckd1aWRcIjpcImVmMGEyYzFmLWIxYWUtNDEyNS1iNGMxLWRkZTlhMjg1MDc5NFwiLFwidXNlck5hbWVcIjpudWxsLFwiY29sb3JzXCI6e30sXCJ1Y2RcIjpcIjIwMjEtMDYtMTRUMjI6MDY6NTYuMDAwKzAwOjAwXCIsXCJ3eHNcIjp0cnVlLFwiZXd4ZFwiOnRydWUsXCJhb3JcIjp0cnVlLFwiYWNpXCI6XCJlZjBhMmMxZi1iMWFlLTQxMjUtYjRjMS1kZGU5YTI4NTA3OTRcIixcInJtYlwiOnRydWUsXCJsdmxkXCI6XCIyMDI0LTA0LTA4VDE2OjAwOjA3Ljg2OCswMDowMFwiLFwibGF0aFwiOlwiMjAyNC0wNC0wOFQxNjowMDowNy43NjQrMDA6MDBcIixcInd4ZXhwXCI6XCIyMDI0LTA0LTIzVDE2OjAwOjA3Ljg2OCswMDowMFwiLFwicGFjXCI6dHJ1ZSxcInNpZFwiOlwiZWQ4Y2FmZWEtYmM1Mi00ODJiLTk4YjctM2ZjZThmZjVlNjM0XCJ9IiwiaWF0IjoxNzEyNTkyMDA3LCJleHAiOjE3MTM4ODgwMDd9.AllX0ZtLIEQSyKGqnqqU1ta3FTBNEnbFzfz39FrSNmxfnp_5lteqKo2j0t4jCCMlyK3Faz8R4N4nOwf1a272eLcKloHQlasU2c-LVDGzetzUUE69mjKOsTAo_7E6_KFA1AIwirbqNBdUrK0s8id97rfKzOgGlnGrSl3EzX0cnwnbTwS-g5Y_stgp_9nt8dS12bq5ZOtIpo-Sg1z40Hg2HVwZOvY7X6zO0yFLE4yvJ0QDCfjROghJmWIYju5iSefXSAhQ_ApT7wP964sTlbV2BvsjQ66YAvbRHhMa2l5cin0FL-ghC9cRPuFOerybEz3tPzKLKl6MrFckOoPPMSbutg")
                .domain(".wix.com")
                .isHttpOnly(true)
                .isSecure(true)
                .path("/")
                .build();
        driver.manage().addCookie(ck);



    }

    @AfterEach
    public void teardown() {

        driver.close();

    }

    @Test
    @Order(1)
    public void publishProduct() throws InterruptedException {


        driver.get(wixURL7);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        ///Click on the search icon
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 1");

        bddFunctions.clickwait(driver, By.xpath("//td[.='Test Data 1']"));
        //Select Variant Test Data
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
        //Save Button
        w.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='wix-header']//a[.='Publish Product']")))).click();
        //Accept and Publish
        bddFunctions.clickwait(driver, By.id("btn-import-start"));
        bddFunctions.isdisplayed(driver, By.id("wix_ebay_published"));
        bddFunctions.clickwait(driver, By.id("count_published"));
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 1");


    }

    @Test
    @Order(2)
    public void publishMultiProduct() throws InterruptedException {


        driver.get(wixURL7);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        ///Click on the search icon
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 2");

        bddFunctions.clickwait(driver, By.xpath("//td[.='Test Data 2']"));
        //Select Variant Test Data
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
        //Save Button
        w.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='wix-header']//a[.='Publish Product']")))).click();
        //Accept and Publish
        bddFunctions.clickwait(driver, By.id("btn-import-start"));
        bddFunctions.isdisplayed(driver, By.id("wix_ebay_published"));
        bddFunctions.clickwait(driver, By.id("count_published"));
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 1");

    }

    @Test
    @Order(3)
    public void publishMultiManagedProduct() throws InterruptedException {


        driver.get(wixURL7);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        ///Click on the search icon
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 3 Managed");

        bddFunctions.clickwait(driver, By.xpath("//td[.='Test Data 3 Managed']"));
        //Select Variant Test Data
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
        //Save Button
                    w.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='wix-header']//a[.='Publish Product']")))).click();
        //Accept and Publish
        bddFunctions.clickwait(driver, By.id("btn-import-start"));
        bddFunctions.isdisplayed(driver, By.id("wix_ebay_published"));
        bddFunctions.clickwait(driver, By.id("count_published"));
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 1");


    }
    @Test
    @Order(4)
    public void publishMultiImage() throws InterruptedException {


        driver.get(wixURL7);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        ///Click on the search icon
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 4 Multi Image");

        bddFunctions.clickwait(driver, By.xpath("//td[.='Test Data 4 Multi Image']"));
        //Select Variant Test Data
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
        //Save Button
        w.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='wix-header']//a[.='Publish Product']")))).click();
        //Accept and Publish
        bddFunctions.clickwait(driver, By.id("btn-import-start"));
        bddFunctions.isdisplayed(driver, By.id("wix_ebay_published"));
        bddFunctions.clickwait(driver, By.id("count_published"));
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 4 Multi Image");


    }
    @Test
    @Order(8)
    public void unpublish() throws InterruptedException {

        driver.get(wixURL7);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        bddFunctions.clickwait(driver, By.id("count_published")
        );
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        bddFunctions.clickwait(driver,By.xpath("//th[@class='td_checkbox sorter-false header']//span[@class='checkmark']"));
        bddFunctions.clickwait(driver, By.id("bulk-unpublish"));
        bddFunctions.clickwait(driver, By.id("btn-unpublish"));
        Thread.sleep(10000);

    }
    @Test
    @Order(5)
    public void bbpublishAmazonProduct() throws InterruptedException {

        driver.navigate().to(wixURL10);
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        bddFunctions.clickwait(driver, By.id("count_ready"));
        bddFunctions.clickwait(driver, By.xpath("//button[@id='search_toggle']/i[@class='fal fa-search']"));
//        Thread.sleep(10000);
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 1");
//        Thread.sleep(10000);
        boolean search_result = driver.findElement(By.xpath("//span[.='No products matched this filter.']")).isDisplayed();
        Assertions.assertFalse(search_result, "No search Results");
        bddFunctions.clickwait(driver, By.xpath("//td[.='Test Data 1']"));
//        Thread.sleep(10000);
        bddFunctions.clickwait(driver, By.id("single_wix_find"));
//        Thread.sleep(1000);
        bddFunctions.sendKeys(driver, By.id("chooseproductsearch"), "B01HN2R4RE" +
                "");
        Thread.sleep(1000);
        bddFunctions.clickwait(driver, By.xpath("//td[@class='product-details']/div[@class='title']"));
        bddFunctions.clickwait(driver, By.id("select-product"));
        bddFunctions.clickwait(driver, By.id("btn_save2"));
        bddFunctions.clickwait(driver, By.id("btn-import-start"));
        bddFunctions.isdisplayed(driver, By.xpath("//span[.='Your product is being published. It may take up to 15 minutes.']"));

    }

    @Test
    @Order(6)
    public void publishMultiAmazonProduct() throws InterruptedException {

        driver.navigate().to(wixURL10);
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        bddFunctions.clickwait(driver, By.id("count_ready"));
        bddFunctions.clickwait(driver, By.xpath("//button[@id='search_toggle']/i[@class='fal fa-search']"));
        Thread.sleep(10000);
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 2");
        Thread.sleep(10000);
        boolean search_result = driver.findElement(By.xpath("//span[.='No products matched this filter.']")).isDisplayed();
        Assertions.assertFalse(search_result, "No search Results");
        bddFunctions.clickwait(driver, By.xpath("//td[.='Test Data 2']"));
        bddFunctions.clickwait(driver, By.xpath("//tbody[@id='variantstable']/tr[1]/td[@class='variantquant']"));
        bddFunctions.clickwait(driver, By.xpath("//tbody[@id='variantstable']/tr[1]//i[@class='fal fa-chevron-right']"));
        Thread.sleep(8000);
        driver.switchTo().frame(1);
        bddFunctions.clickwait(driver, By.cssSelector("[data-i18n='product:matchCard.unmatched.button']"));
        Thread.sleep(1000);
        bddFunctions.sendKeys(driver, By.id("chooseproductsearch"), "B01HN2R4RE");
        Thread.sleep(1000);
        bddFunctions.clickwait(driver, By.xpath("//td[@class='product-details']/div[@class='title']"));
        bddFunctions.clickwait(driver, By.id("select-product"));
        bddFunctions.clickwait(driver, By.xpath("//div[@class='wix-header']//a[.='Save & Publish']"));
        Thread.sleep(10000);
        driver.switchTo().parentFrame();
        bddFunctions.clickwait(driver, By.xpath("//div[@class='wix-header']//a[.='Publish']"));
        bddFunctions.clickwait(driver, By.id("btn-import-start"));
        Thread.sleep(1000);
        bddFunctions.isdisplayed(driver, By.xpath("//span[.='Your product is being published. It may take up to 15 minutes.']"));
    }

    @Test
    @Order(7)
    public void publishAmazonMultiManagedProduct() throws InterruptedException {

        driver.navigate().to(wixURL10);
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        bddFunctions.clickwait(driver, By.id("count_ready"));
        bddFunctions.clickwait(driver, By.xpath("//button[@id='search_toggle']/i[@class='fal fa-search']"));
        Thread.sleep(10000);
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data 3 Managed");
        Thread.sleep(10000);
        boolean search_result = driver.findElement(By.xpath("//span[.='No products matched this filter.']")).isDisplayed();
        Assertions.assertFalse(search_result, "No search Results");
        bddFunctions.clickwait(driver, By.xpath("//td[.='Test Data 3 Managed']"));
        bddFunctions.clickwait(driver, By.xpath("//tbody[@id='variantstable']/tr[1]/td[@class='variantquant']"));
        bddFunctions.clickwait(driver, By.xpath("//tbody[@id='variantstable']/tr[1]//i[@class='fal fa-chevron-right']"));
        Thread.sleep(8000);
        driver.switchTo().frame(1);
        bddFunctions.clickwait(driver, By.cssSelector("[data-i18n='product:matchCard.unmatched.button']"));
        Thread.sleep(1000);
        bddFunctions.sendKeys(driver, By.id("chooseproductsearch"), "B01HN2R4RE");
        Thread.sleep(1000);
        bddFunctions.clickwait(driver, By.xpath("//td[@class='product-details']/div[@class='title']"));
        bddFunctions.clickwait(driver, By.id("select-product"));
        bddFunctions.clickwait(driver, By.xpath("//div[@class='wix-header']//a[.='Save & Publish']"));
        Thread.sleep(10000);
        driver.switchTo().parentFrame();
        bddFunctions.clickwait(driver, By.xpath("//div[@class='wix-header']//a[.='Publish']"));
        bddFunctions.clickwait(driver, By.id("btn-import-start"));
        Thread.sleep(1000);
        bddFunctions.isdisplayed(driver, By.xpath("//span[.='Your product is being published. It may take up to 15 minutes.']"));
    }

    @Test
    @Order(9)
    public void unpublishAmazon() throws InterruptedException {

        driver.navigate().to(wixURL10);
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        bddFunctions.clickwait(driver, By.id("count_published"));
        bddFunctions.clickwait(driver, By.xpath("//button[@id='search_toggle']/i[@class='fal fa-search']"));
        bddFunctions.sendKeys(driver, By.id("productsearch"), "Test Data");
        bddFunctions.clickwait(driver, By.xpath("//th[@class='td_checkbox sorter-false header']//span[@class='checkmark']"));
        bddFunctions.clickwait(driver, By.id("bulk-unpublish"));
        bddFunctions.clickwait(driver, By.id("btn-unpublish"));


    }

    @Test
    @Order(10)
    public void CreateProductAmazon() throws InterruptedException, IOException {

        String name = "Test Data";
        String sku = "";
        String name2 = name + s;
        String sku2 = sku + s;
        PageFactory.initElements(driver, this);
        createProductAPI.createproductwithimage(sku2, name2, "src/test/java/com/example/jsonFiles/single_variant.json");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to(wixURL10);
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        bddFunctions.clickwait(driver, By.id("count_ready"));
        bddFunctions.clickwait(driver, By.xpath("//button[@id='search_toggle']/i[@class='fal fa-search']"));
        bddFunctions.sendKeys(driver, By.id("productsearch"), name2);
        System.out.println(name2);
        Thread.sleep(10000);
        boolean search_result = driver.findElement(By.xpath("//span[.='No products matched this filter.']")).isDisplayed();
        Assertions.assertFalse(search_result, "No search Results");
    }

    @Test
    @Order(11)
    public void CreateProductEbay() throws InterruptedException, IOException {
        String name = "Test Data";
        String sku = "";
        String name2 = name + s;
        String sku2 = sku + s;
        createProductAPI_ebay.createproductwithimage(sku2, name2, "src/test/java/com/example/jsonFiles/single_variant.json");
        System.out.println("Product Created" + name2);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        driver.get(wixURL7);
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        ///Click on the search icon
        bddFunctions.clickwait(driver, By.id("search_toggle"));
        ////Enter search criteria
        bddFunctions.sendKeys(driver, By.id("productsearch"), name2);
        System.out.println(name2);
        Thread.sleep(10000);
        boolean search_result = driver.findElement(By.xpath("//span[.='No products matched this filter.']")).isDisplayed();
        Assertions.assertFalse(search_result, "No search Results");

    }

}

