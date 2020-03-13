package com.randyblanchard.buslocator2.controllers;

public class Time {

	 int seconds;
	    int minutes;
	    int hours;

	    public Time(int hours, int minutes, int seconds) {
	        this.hours = hours;
	        this.minutes = minutes;
	        this.seconds = seconds;
	    }

	    public static void main(String[] args) {
	        Time start = new Time(8, 45, 00),
	                stop = new Time(8, 12, 00),
	                diff;

	        diff = difference(start, stop);

	        System.out.printf("Your bus will arrive in: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
	        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
	        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
	    }

	    public static Time difference(Time start, Time stop)
	    {
	        Time diff = new Time(0, 0, 0);

	        if(stop.seconds > start.seconds){
	            --start.minutes;
	            start.seconds += 60;
	        }

	        diff.seconds = start.seconds - stop.seconds;
	        if(stop.minutes > start.minutes){
	            --start.hours;
	            start.minutes += 60;
	        }

	        diff.minutes = start.minutes - stop.minutes;
	        diff.hours = start.hours - stop.hours;

	        return(diff);
	    }
	}
