package datadriven;

import utility.Datadriven;

public class Data6 {

	public static void main(String[] args) throws Exception {
		
		Datadriven excel= new Datadriven();
		excel.Datadriven("C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Workspace\\\\testcases\\\\src\\\\data\\\\Datadriven.xlsx");
		String data =excel.getdata("Sheet1",0,1);
		
		System.out.println(data);
		
	}
	
}
