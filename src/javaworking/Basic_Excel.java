package javaworking;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Basic_Excel {
	public static void main(String[] args) throws Exception{
		FileInputStream f=new FileInputStream("D:\\s_workspace\\java_practice\\src\\javaworking\\Emprec.xls");
		Workbook w1=Workbook.getWorkbook(f);
		Sheet s1=w1.getSheet(0);
		System.out.println(s1.getName());
		int i=0;
		while(i<=3){
		String Ename=s1.getCell(0,i).getContents();
		String EID=s1.getCell(1,i).getContents();
		String ESal=s1.getCell(2,i).getContents();
		System.out.println(Ename+"||"+EID+"||"+ESal);
//		System.out.println(Ename);
//		System.out.println(EID);
//		System.out.println(ESal);
		i++;
	}
	}
}
