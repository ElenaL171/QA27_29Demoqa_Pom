package com.telran.tests.elements;

import com.telran.pages.elements.ButtonPage;
import com.telran.pages.HomePage;
import com.telran.pages.SidePanelPage;
import com.telran.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectElements();
        new SidePanelPage(driver).selectButtons();
    }
    @Test
    public void doubleClickTest(){
        new ButtonPage(driver).doubleClick();
    }
    @Test
    public void rightClick(){
        new ButtonPage(driver).rightClick();
    }
    @Test
    public void clickMe(){
        new ButtonPage(driver).clickMe();
    }
}
