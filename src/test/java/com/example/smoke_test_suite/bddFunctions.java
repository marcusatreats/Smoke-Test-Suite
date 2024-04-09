package com.example.smoke_test_suite;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class bddFunctions extends page_objects {

    public static void clickwait(WebDriver driver, By by) {
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(30))).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).click();
            System.out.println("WebElement" + by.toString() + " Clickable ----> PASS");
        } catch (StaleElementReferenceException | NotFoundException s) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            driver.findElement(by).click();
        } catch (ElementNotInteractableException e) {
            driver.navigate().refresh();
            driver.findElement(by).click();
        } catch (TimeoutException t) {
            System.out.println("Element identified by " + by.toString() + " was not clickable after 30 seconds");
            Assertions.fail("Element " + by + " was not clickable");
        }
    }
    public static void sendKeys(WebDriver driver, By by, String testData) {
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(30))).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).sendKeys(testData);
            System.out.println("WebElement" + by.toString() + " Clickable and keys " + testData + " were sent ----> PASS");
        } catch (StaleElementReferenceException s) {
            driver.findElement(by).sendKeys(testData);
        } catch (TimeoutException t) {
            System.out.println("Element identified by " + by.toString() + " was not clickable after 30 seconds");
            Assertions.fail("Element " + by + " was not clickable");
        }
    }


    public static boolean isdisplayed(WebDriver driver, By by) throws InterruptedException {
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(30))).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).isDisplayed();
            System.out.println("WebElement" + by.toString() + " is displayed ----> PASS");
        } catch (StaleElementReferenceException s) {
            driver.findElement(by).isDisplayed();
        } catch (ElementNotInteractableException e) {
            driver.navigate().refresh();
            driver.findElement(by).isDisplayed();
        } catch (TimeoutException t) {
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            if (driver.findElement(by).isDisplayed()) {
                System.out.println("WebElement" + by.toString() + " is displayed ----> PASS");
            } else
            System.out.println("Element identified by " + by.toString() + " was not displayed after 30 seconds");
            Assertions.fail("Element " + by + " was not displayed");
        }
        return false;
    }
}
