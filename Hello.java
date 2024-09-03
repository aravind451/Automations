package com.frame;
import java.util.*;
import java.text.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Hello {
    public String mergeAlternately(String word1, String word2) {
    	StringBuilder s=new StringBuilder();
       int n= word1.length();
       int n2= word2.length();
       for(int i=0;i<n;i++) {
   s.append(word1.charAt(i));
    s.append(word2.charAt(i));
       }
	return s.toString();

    }
    public static void main(String[] args) {
		Hello so=new Hello();
		System.out.println(so.mergeAlternately("araara", "jkji"));
	}
}