package com.telran.tests;

import com.telran.data.UserData;
import com.telran.pages.BookStorePage;
import com.telran.pages.HomePage;
import com.telran.pages.LoginPage;
import com.telran.pages.ProfilePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
 @BeforeTest
    public void ensurePrecondition() {
        new HomePage(driver).selectBookStoreApp();
        new BookStorePage(driver).clickOnLoginButton();
    }

    @Test
    public void LoginPositiveTest() {
     new LoginPage(driver).login(UserData.USER_NAME, UserData.USER_PASSWORD);
     new ProfilePage(driver).verifyUserName(UserData.USER_NAME);
    }
}