package testng.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelFile {

    @DataProvider(name = "test-data")
    public Object[][] dataSetup() throws IOException {
        Object[][] arrObj = getDataFromExcel("D:\\DataProvider.xlsx", "testCase1");
        return arrObj;
    }

    public String[][] getDataFromExcel(String filePath, String sheetName) throws IOException {
        FileInputStream fs = new FileInputStream(filePath); //Access the file
        XSSFWorkbook wb = new XSSFWorkbook(fs);              //Accessing the xlsx file
        XSSFSheet sheet = wb.getSheet(sheetName);           //Sheet Name accessing
        XSSFRow row = sheet.getRow(0);              //Accesing the row
        int noOfROw = sheet.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();

        Cell cell;

        String[][] data = new String[noOfROw - 1][noOfColumn];

        for (int i = 1; i < noOfROw; i++) {
            for (int j = 0; j < noOfColumn; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "test-data")
    public void verifySearchFlipkart(String courseName, String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        Thread.sleep(3000);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
