package Selenium;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity13_2a {


    public void writeExcel() {

        XSSFWorkbook myWrkbuk = new XSSFWorkbook();

        XSSFSheet sheet1 = myWrkbuk.createSheet("Sheet1");
        List<String[]> data = new ArrayList<String[]>();
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};

        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);

        int rownum=0;
        for(String[] rowData:data) {

            Row row=sheet1.createRow(rownum++);

            int cellnum =0;
            for(String cellData:rowData){






        }
    }}}