package com.telran.pages.alertsWindows;

import com.telran.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> frames;

    public FramesPage returnListOfFrames() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("Number of Frames are " + numberOfFrames);
        System.out.println("Number of Frames are " + frames.size());
        return this;
    }

    public FramesPage switchToFrameByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(id = "frame1")
    WebElement frame1;
    @FindBy(id="sampleHeading")
    WebElement text;


    public FramesPage switchToFrameById() {
        driver.switchTo().frame(frame1);
        String frameText = this.text.getText();
        System.out.println("Text of the Frame1 is :" + frameText);
        driver.switchTo().defaultContent();
        return this;
    }
}
