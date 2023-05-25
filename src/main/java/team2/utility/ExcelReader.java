
package team2.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.DataProvider;
import java.io.IOException;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExcelReader {

    private final Logger LOG = LogManager.getLogger(ExcelReader.class.getName());

    XSSFWorkbook excelWBook;
    XSSFSheet excelWSheet;
    XSSFCell cell;
    String path;

    public ExcelReader(String path){
        this.path = path;
    }

    public String getDataFromCell(String sheet, int rowNum, int colNum){
        try {
            FileInputStream excelFile = new FileInputStream(path);
            excelWBook = new XSSFWorkbook(excelFile);
            excelWSheet = excelWBook.getSheet(sheet);
            cell = excelWSheet.getRow(rowNum).getCell(colNum);
            String cellValue = cell.getStringCellValue();
            excelFile.close();
            return cellValue;
        }catch (Exception e){
            LOG.info("no file found");
            return "";
        }
    }

    public List<String> getEntireColumnData(String sheet, int rowStart, int colNum){
        List<String> columnData = new ArrayList<>();
        try {
            File file = new File(path);
            FileInputStream excelFile = new FileInputStream(file);
            excelWBook = new XSSFWorkbook(excelFile);
            excelWSheet = excelWBook.getSheet(sheet);
            for (int i = rowStart; i <= excelWSheet.getLastRowNum(); i++){
                columnData.add(excelWSheet.getRow(i).getCell(colNum).getStringCellValue());
            }
//            int i = rowStart;
//            while (excelWSheet.getRow(i).getCell(colNum).getStringCellValue() != null){
//                columnData.add(excelWSheet.getRow(i).getCell(colNum).getStringCellValue());
//                i++;
//            }
            excelFile.close();
        }catch (Exception e){
            e.printStackTrace();
            LOG.info("no data found");
        }
        return columnData;
    }

    public List<String> getEntireColumnForGivenHeader(String sheet, String headerName){
        int i = 0;
        while (getDataFromCell(sheet, 0, i) != null){
            if(getDataFromCell(sheet, 0, i).equalsIgnoreCase(headerName)){
                getEntireColumnData(sheet, 1, i);
                break;
            }
            i++;
        }
        return getEntireColumnData(sheet, 1, i);
    }

    public String getValueForGivenHeaderAndKey(String sheet, String headerName, String key){
        String value = null;
        int i = 0;
        while (getDataFromCell(sheet, 0, i) != null){
            if(getDataFromCell(sheet, 0, i).equalsIgnoreCase(headerName)){
                for (int j = 0; j < getEntireColumnData(sheet, 1, i).size(); j++){
                    if(getEntireColumnData(sheet, 1, i).get(j).equalsIgnoreCase(key)){
                        value = getEntireColumnData(sheet, 1, i+1).get(j);
                    }
                }
                break;
            }
            i++;
        }
        return value;
    }

    public static void main(String[] args)  throws IOException{


        String currentDir = System.getProperty("user.dir");
        String path =currentDir+File.separator+"data"+File.separator+"scaledupit"+File.separator+ "scaledupit.xlsx";
        System.out.println(path);

       String name ="data";
        ExcelReader excelReader = new ExcelReader(path);
        String data = excelReader.getDataFromCell(name, 3, 1);
        System.out.println(data);
       // System.out.println(excelReader.getDataFromCell("sheet1", 2, 2));


//        String path = "/Users/faridaymmeli/IdeaProjects/team2project/data/scaledupit/scaleupit.xlsx";
//        ExcelReader excelReader = new ExcelReader(path);

//        System.out.println(excelReader.getValueForGivenHeaderAndKey("sheet1","ID","101"));
////        List<String> items = excelReader.getEntireColumnForGivenHeader("Sheet1", "id");
////        //String items = excelReader.getValueForGivenHeaderAndKey("Sheet1", "id", "id004");
////        System.out.println(items);
//    }
    }


    public List<String> getEntireColumnDataFromExcelSheet(String sheet, int rowStart, int colNum) {
        List<String> columnData = new ArrayList<>();
        try {
            File file = new File(path);
            FileInputStream excelFile = new FileInputStream(file);
            excelWBook = new XSSFWorkbook(excelFile);
            excelWSheet = excelWBook.getSheet(sheet);

            DataFormatter formatter = new DataFormatter();
            for (int i = rowStart; i < excelWSheet.getLastRowNum() + 1; i++) {
                Cell cell = excelWSheet.getRow(i).getCell(colNum);
                String cellValue = formatter.formatCellValue(cell);
                columnData.add(cellValue);
            }
            excelFile.close();
        } catch (Exception e) {
            e.printStackTrace();
            LOG.info("No data found");
        }
        return columnData;
    }


    //                     DATA PROVIDER

    @DataProvider(name = "userlogin")
    public static Object[][] getData() {
        String currentDir = System.getProperty("user.dir");
        String path = currentDir+File.separator+"data"+File.separator+"scaleupit"+File.separator+ "scaleupit.xlsx" ;
        System.out.println(path);
        ExcelReader excelReader = new ExcelReader(path);
        List<String> items1 = excelReader.getEntireColumnDataFromExcelSheet("testcases",4,4);
        List<String> items2 = excelReader.getEntireColumnDataFromExcelSheet("testcases",4,4);
        Object[][] data = new Object[2][];
        data[0] = items1.toArray();
        data[1] = items2.toArray();
        return data;
    }






//    public class DataProviderDemo {
//
//
//        String currentDir = System.getProperty("user.dir");
//        String path = currentDir+File.separator+"data"+File.separator+"scaleupit"+File.separator+ "scaleupit.xlsx" ;
//        String sheetName = "demo";
//
//        @Test(dataProvider = "excelData")
//        public void read(String username, String password) {
//            System.out.println(username + ":" + password);
//
//        }
//
//        @DataProvider(name="excelData")
//        public Object[][] readExcel() throws InvalidFormatException, IOException {
//            ExcelReader excelReader = new ExcelReader(path);
//            return ExcelReader.ExcelReader.(path,sheetname);
//
//        }
//
//    }
        }




