package org.FOMIX.WebDashboard.Utils;

import org.FOMIX.WebDashboard.POM.PageObjectManager;

import java.io.IOException;

public class TextContextSetup {
    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public TextContextSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
    }
}
