package com.jspiders.filehandling.delete;

import java.io.File;

public class DeleteFileDemo2 {

	public static void main(String[] args) {
		File file=new File("c:/WEJA1/Hello.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("File Deleted");
		}else {
			System.out.println("File does not exists.");
		}
	}
}
