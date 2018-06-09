package com.hjjc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args)throws Exception {
		Date d = new SimpleDateFormat("yyyy-MM-dd").parse("2018-04-09");
		System.out.println(d.getTime());
		
		Date dd = new Date(1523877944168L);
		System.out.println(dd);
		System.out.println(System.currentTimeMillis());
	}
}
