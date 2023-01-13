package com.sehatq.webdriverpool;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverInitializer {
  public static AtomicReference<HashMap<String, ChromeDriver>> webDriverPool = new AtomicReference<>(
      new HashMap<>());

  public void initialize() {
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito", "--start-maximized");

    ChromeDriver driver = new ChromeDriver(options);
//    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    webDriverPool.updateAndGet(dv -> {
      dv.put(Thread.currentThread().getName(), driver);
      return dv;
    });
  }

  public void quit() {
    webDriverPool.updateAndGet(dv -> {
      ChromeDriver driver = dv.get(Thread.currentThread().getName());
      dv.remove(Thread.currentThread().getName());
      driver.quit();
      return dv;
    });
  }

  public static ChromeDriver getDriver() {
    return webDriverPool.get().get(Thread.currentThread().getName());
  }
}
