package com.nf147.ssms.controller.demo;


import com.nf147.ssms.service.impl.ExcelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller("/excel")
public class ExcelController {
    @Autowired
    private ExcelServiceImpl excelServiceImpl;

    @GetMapping(value = "/download")
    ResponseEntity<byte[]> downloadFile() throws IOException {
        byte[] contents = excelServiceImpl.exportExcel().toByteArray();

        HttpHeaders headers = new HttpHeaders();
        headers.setCacheControl("no-cache, no-store, must-revalidate");
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentLength(contents.length);
        headers.setContentDispositionFormData("attachment", "xxx_" + new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + ".xls");

        return ResponseEntity.ok().headers(headers).body(contents);
    }
}
