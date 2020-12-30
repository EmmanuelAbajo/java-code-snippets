package com.esc.filepractice;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample {
	
	void deleteFiles() {
		Path path = Paths.get("doc.txt");
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Filter out directories
		FilenameFilter filter = (file, fileName) -> {
			return fileName.contains(".");
		};
		
		String[] files = new File(".").list(filter);
		for (String name: files) {
			System.out.println(name);
		}

	}

}
