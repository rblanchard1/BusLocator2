package com.randyblanchard.buslocator2.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time2 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date rightNow = new Date();
		String rightNowString = format.format(rightNow);
		
		Date currentStop = format.parse(rightNowString);
		Date nextStop = format.parse("13:30:00");
		System.out.println(currentStop.getTime() + ", " + nextStop.getTime());
		System.out.println((nextStop.getTime() - currentStop.getTime())/1000/60);
	}
}

//String time1 = "12:00:00";
//String time2 = "12:01:00";
//
//SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//Date date1 = format.parse(time1);
//Date date2 = format.parse(time2);
//long difference = date2.getTime() - date1.getTime();
//System.out.println(difference/1000);