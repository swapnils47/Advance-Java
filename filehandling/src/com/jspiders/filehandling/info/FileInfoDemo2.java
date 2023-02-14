package com.jspiders.filehandling.info;

import java.io.File;

public class FileInfoDemo2 {

	public static void main(String[] args) {
		File file=new File("C:/WEJA1/Hello.txt");
		if (file.exists()) {
			System.out.println("File Name: "+file.getName());
			System.out.println("Absolute path: "+file.getAbsolutePath());
			System.out.println("File Length: "+file.length());
			if (file.canRead()) {
				System.out.println("File is Readable");
			}else {
				System.out.println("File is not readable");
			}
			if (file.canExecute()) {
				System.out.println("File is executable");
			} else {
				System.out.println("File is not executable");
			}
			if (file.canWrite()) {
				System.out.println("File is Writable");
			} else {
				System.out.println("File is not Writable");
			}
		} else {

			System.out.println("File does not exists");
		}
	}
}
