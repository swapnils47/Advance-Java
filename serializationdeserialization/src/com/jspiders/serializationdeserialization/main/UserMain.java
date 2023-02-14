package com.jspiders.serializationdeserialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serializationdeserialization.object.User;

public class UserMain {

	public static void main(String[] args) {
		File file;
		FileInputStream fileInputStream;
		FileOutputStream fileOutputStream;
		 try {
		file=new File("Object.txt");
		if (file.exists()) {
			System.out.println("file already exists");
		} else {
				file.createNewFile();
				System.out.println("File created");
		}
		fileOutputStream=new FileOutputStream(file);
		fileInputStream=new FileInputStream(file);
		
		//Serialization
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		User user=new User(1, "Arjun", "arjun@gmail.com");
		objectOutputStream.writeObject(user);
		System.out.println("Object written to file");
		objectOutputStream.close();
		
	    //Deserialization
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		User output=(User) objectInputStream.readObject();
		System.out.println(output);
		objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		 }
}

