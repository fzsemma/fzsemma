package com.excel;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
public class excelDemo {

	public static void main(String[] args) throws FileNotFoundException {
		String filepath=" C:\\Users\\Fikerete\\Desktop\\Name.xlsx";
	//	String filelocation= System.getProperty("user.dir");
		System.out.println(filepath);

	FileInputStream fis= new FileInputStream(filepath);
	
	}
}

