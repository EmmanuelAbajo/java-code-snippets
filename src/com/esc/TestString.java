package com.esc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestString {

	static String printQuery(String packageName) {
		return "{ call mobile4_report_pkg." + packageName + "(?,?,?,?) }";
	}

	public static void main(String[] args) {
		System.out.println(printQuery("base_package"));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String today = dtf.format(now);
		
		System.out.println(today);
		System.out.println(LocalDateTime.now());

	}

}
