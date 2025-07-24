package br.com.testaut.ui;

import br.com.testaut.core.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginUiTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = DriverFactory.getDriver();
    }

    @Test
    void testLoginPageTitle() {
        driver.get("https://www.seusite.com/login");
        String title = driver.getTitle();
        assertTrue(title.contains("Login"));
    }

    @AfterAll
    public static void tearDown() {
        DriverFactory.quitDriver();
    }
}