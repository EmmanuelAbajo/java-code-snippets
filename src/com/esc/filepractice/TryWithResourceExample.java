package com.esc.filepractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourceExample {

	public static void main(String... args) {

		// Objects that implements the auto closable interface are resources
		// e.g buffered reader and string writer
		// try with resources auto closes open resources
		try (
				BufferedReader reader = new BufferedReader(new StringReader("Hello world"));
				StringWriter writer = new StringWriter();
				) {
			writer.write(reader.readLine());
			System.out.println(writer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
