package com.javafile.Taskjava.polar;

import java.io.File;

import com.javafile.Taskjava.FileHelper.FileHelper;
import com.javafile.Taskjava.prog.ApplicationContext;


public class Polar extends FileHelper implements Runnable{
	public void run() {
		while(true)
		{
			File f=new File("C:\\Users\\vijayj\\inputfiles");
			File list[]=f.listFiles();
			for(File f1:list) {
				if(!isValid()&& !isOnTime() && !isDuplicate()) {
					f1.delete();
					
				}
				else
				{
					//Make netry into the map
					//Move file o folder
				}
				
			}
		}
	}
		
		
			public boolean isValid() {
				ApplicationContext context=new ApplicationContext();
				return true;
			}
			public boolean isOnTime() {
				ApplicationContext context=new ApplicationContext();
				return true;
			}
			public boolean isDuplicate() {
				ApplicationContext context=new ApplicationContext();
				return true;
			}

}
