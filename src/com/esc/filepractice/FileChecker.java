package com.esc.filepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileChecker {
	
	public static boolean isEmpty(String directory) {
		File file = new File(directory);
		if (file.isDirectory()) {
		    String[] list = file.list();
		    if (list == null || list.length == 0) {
		        return true;
		    } 
		}
		return false;
	}
	
	public static boolean isFileEmpty(String file) {
		BufferedReader reader = null;
		FileReader fReader = null;
		boolean state = false;
		
		try {
			fReader = new FileReader(file);
			reader = new BufferedReader(fReader);
			if (reader.readLine() == null) {
			    state =  true;
			}	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	
			if (fReader != null) {
				try {
					fReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return state;
		
	}

	public static void getFileDetails(String fileName) {
		try {
			Path file = Paths.get(fileName);
			BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
	        System.out.println("creationTime: " + attr.creationTime());
	        System.out.println("Last modifiedTime: " + attr.lastModifiedTime());
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(isEmpty("tmp/logs"));
		getFileDetails("tmp/logs/document.txt");
		System.out.println(isFileEmpty("tmp/logs/document.txt"));
	}

}
