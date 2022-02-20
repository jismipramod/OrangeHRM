package com.orangehrm.qa.constants;

public class Constants {
	public static final String username="Admin";
	public static final String password="admin123";
	public static final String pagetitle="OrangeHRM";
	public static  final String configpath=System.getProperty("user.dir")+"\\Configuration\\config.properties";
	public static final String adduserurl="https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser";
	public static String screenShot_path=System.getProperty("user.dir")+"/Screenshots/";
	
	public static String fileimportdata_path=System.getProperty("user.dir")+"/POMOrangeHRMProject/src/test/resources/ExcelTestData/AddUserData.xlsx";
	
	
	public static String dataprovider_filepath3=System.getProperty("user.dir")+"//src/test//resources//ExcelTestData//OrangeTestData.xlsx//";
	
	public static final String adduser="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
	
	public static final String addemployeeurl="https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee";
	
	public static final String uploadfile=System.getProperty("user.dir")+"/src/test/resources/ExcelTestData/importData.csv";

	public static final String testdata="//src//test//resources//ExcelTestData//OrangeTestData.xlsx";	
	
	public static final String dataprovider_filepath=System.getProperty("user.dir")+testdata;
	
	public static final String dataimporturl="https://opensource-demo.orangehrmlive.com/index.php/admin/pimCsvImport1";
}