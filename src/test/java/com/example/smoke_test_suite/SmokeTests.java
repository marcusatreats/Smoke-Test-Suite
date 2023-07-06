package com.example.smoke_test_suite;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class SmokeTests extends page_objects {



    ChromeDriver driver = new ChromeDriver();



    @BeforeEach
    public void setup() {


//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);

        driver.get("https://wix.com");

        Cookie ck = new Cookie.Builder("wixSession2", "JWT.eyJraWQiOiJrdU42YlJQRCIsImFsZyI6IlJTMjU2In0.eyJkYXRhIjoie1widXNlckd1aWRcIjpcImVmMGEyYzFmLWIxYWUtNDEyNS1iNGMxLWRkZTlhMjg1MDc5NFwiLFwidXNlck5hbWVcIjpcIm1hcmtjMTM0XCIsXCJjb2xvcnNcIjp7fSxcInVjZFwiOlwiMjAyMS0wNi0xNFQyMjowNjo1Ni4wMDArMDAwMFwiLFwid3hzXCI6dHJ1ZSxcImV3eGRcIjp0cnVlLFwiYW9yXCI6dHJ1ZSxcImFjaVwiOlwiZWYwYTJjMWYtYjFhZS00MTI1LWI0YzEtZGRlOWEyODUwNzk0XCIsXCJybWJcIjp0cnVlLFwibHZsZFwiOlwiMjAyMy0wNy0wMVQxMzo0MTozMi4yOTMrMDAwMFwiLFwibGF0aFwiOlwiMjAyMy0wNi0yOVQxMzo0MToxMi4wNTQrMDAwMFwiLFwid3hleHBcIjpcIjIwMjMtMDctMTRUMTM6NDE6MTIuMTc1KzAwMDBcIixcInBhY1wiOnRydWV9IiwiaWF0IjoxNjg4MjE4ODkyLCJleHAiOjE2ODkzNDIwNzJ9.V4melX07MhHulRGzWxMLmQGtIjM9-Rz3RtWpwyNoucUtyYUqdhfYb2JJuqrsrUfok7njN_zffp_-TL4MQgMdKDCMopa3KOOmBbvIsP85GDUJaHKP33q8jJRC3btnkseDSi2UG46xS-me1O8niVe3F2ircFzotfbuE7a6uM4FU0zZykJUsycnBUa1k-igbTiZcasXGGpwVaQPw_IaPfU9kxd25w7chl1d2fptCwyqkQ8VhfndilHCMGhTFHL37d5tguX-8cMbSzf-wf2qs0Fj_avskRVeX9zwCiJZ2XIu43inaObEsR1X3PT52cbMDNZDTcWNi9O4rKidT0Y1Xl-efw")
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
    public void publishAmazonProduct() throws InterruptedException {

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
        bddFunctions.sendKeys(driver, By.id("chooseproductsearch"), "B01HN2R4RE");
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

}

