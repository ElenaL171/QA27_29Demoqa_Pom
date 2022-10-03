package com.telran.tests;

import com.telran.data.BookData;
import com.telran.pages.BookStorePage;
import com.telran.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBookTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).selectBookStoreApp();
        new BookStorePage(driver).clickOnLoginButton();
    }
    @Test
    public void searchBookPositiveTestForRegisterUser(){
        new BookStorePage(driver).typeInSearchBookInput(BookData.BOOK_NAME);
        Assert.assertTrue(new BookStorePage(driver).takeNameOfBook().contains(BookData.BOOK_NAME));
    }
}
