package com.esc.filepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderImpl {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			File file = new File("tmp/logs/document.txt");
			reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine()) != null) {
					System.out.println(line);
			} 
		} catch (IOException | NullPointerException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}
}
