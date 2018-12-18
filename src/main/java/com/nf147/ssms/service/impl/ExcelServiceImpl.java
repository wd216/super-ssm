package com.nf147.ssms.service.impl;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

@Service
public class ExcelServiceImpl {
    public ByteArrayOutputStream exportExcel() throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook(); // 创建新的 excel 文档
        HSSFSheet sheet1 = workbook.createSheet("第一页。。。"); // 创建第一个工作表
        HSSFSheet sheet2 = workbook.createSheet("第2页。。。");
        HSSFSheet sheet3 = workbook.createSheet("第III页。。。");
        HSSFSheet sheet4 = workbook.createSheet("第si页。。。");

        HSSFRow row = sheet1.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("hello, hello");

        HSSFRow row22 = sheet2.createRow(2);
        HSSFCell cell1 = row22.createCell(3);
        cell1.setCellValue("我是谁？我从哪里来，我到哪里呢");

        // 样式对象
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setDataFormat(workbook.getCreationHelper().createDataFormat().getFormat("yyyy-MM-dd"));
        cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
        cellStyle.setFillBackgroundColor(IndexedColors.YELLOW.getIndex());
        cellStyle.setShrinkToFit(true);

        HSSFRow row1 = sheet3.createRow(1);
        HSSFCell cell2 = row1.createCell(0);
        cell2.setCellStyle(cellStyle);
        cell2.setCellValue(new Date());

        row1.createCell(1).setCellValue(22323);
        row1.createCell(2).setCellValue(444444);
        row1.createCell(3).setCellValue(true);
        row1.createCell(4).setCellFormula("$B$2*$C$2");

        // 进行某些操作

        // 将其保存
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        workbook.write(stream);
        return stream;
    }

    public void testFetchFromExcel() throws IOException {
        Workbook workbook = readExcelFromFileName("D:\\mydemo.xlsx");

        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(1);
        double value = row.getCell(1).getNumericCellValue();
        System.out.println(value);
    }

    public Workbook readExcelFromFileName(String fileName) throws IOException {
        FileInputStream fis;
        Workbook workbook;
        try {
            fis = new FileInputStream(new File(fileName));
            workbook = new HSSFWorkbook(fis);
            fis.close();
        } catch (OfficeXmlFileException e) {
            fis = new FileInputStream(new File(fileName));
            workbook = new XSSFWorkbook(fis);
            fis.close();
        }
        return workbook;
    }
}