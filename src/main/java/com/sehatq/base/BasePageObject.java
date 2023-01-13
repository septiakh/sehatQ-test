package com.sehatq.base;

import com.sehatq.webdriverpool.WebdriverInitializer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.sehatq.locators.EditProfilLocators.INPUT_TB;

public class BasePageObject {

  public ChromeDriver getDriver() {
    return WebdriverInitializer.getDriver();
  }

  public void clickOn(By element){
    new WebDriverWait(getDriver(), 30).until(ExpectedConditions.elementToBeClickable(element)).click();
  }

  public void clickAction(By element){
    WebElement el = (WebElement) element;
    Actions action = new Actions(getDriver());
    action.moveToElement(el).click().perform();
  }

  public void input(By element, String keyword){
    clear(element);
    getDriver().findElement(element).sendKeys(keyword);
  }

  public boolean isDisplayed(By element){
    try {
      return getDriver().findElement(element).isDisplayed();
    } catch (Exception e){
      return false;
    }
  }

  public String getText(By element){
    return getDriver().findElement(element).getText();
  }

  public void selectDropDownByValue(By element, String keyword){
    Select select = new Select(getDriver().findElement(element));
    select.selectByValue(keyword);
  }

  public void selectDropDownByText(By element, String keyword){
    Select select = new Select(getDriver().findElement(element));
    select.selectByVisibleText(keyword);
  }

  public void waitUntilVisible(By element){
    WebDriverWait wait = new WebDriverWait(getDriver(),30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(element));
  }

  public void waitUntilInVisible(By element){
    try {
      WebDriverWait wait = new WebDriverWait(getDriver(),30);
      wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    } catch (Exception e){

    }

  }

  public void waitABit(Integer timeout){
    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  public void clear(By by){
    WebElement element = getDriver().findElement(by);
    element.sendKeys(Keys.chord(Keys.COMMAND,"a"));
    element.sendKeys(Keys.DELETE);
  }
}
