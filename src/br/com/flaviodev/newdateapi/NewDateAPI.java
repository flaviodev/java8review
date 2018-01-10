package br.com.flaviodev.newdateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class NewDateAPI {

	public static void main(String[] args) {
	
		// getting current date
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// setting a manual date
		LocalDate manualDate = LocalDate.of(2009,Month.JANUARY,12);
		
		// calculating years diff
		int years = today.getYear() - manualDate.getYear();
		System.out.println(years);
		
		// using period
		Period period = Period.between(manualDate, today);
		System.out.println(period);
		
		// plus days
		System.out.println(today.plusDays(30));
		
		// Formatting date
		System.out.println(today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		
		//Using Time
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a")));
		
		// Year Month
		YearMonth vacation = YearMonth.of(2018, 7);
		System.out.println(vacation.format(DateTimeFormatter.ofPattern("MMMM,yyyy")));
		
		// interval
		LocalTime time = LocalTime.of(14, 30);
		System.out.println(time.format(DateTimeFormatter.ofPattern("h:mm a")));
		
		// time zone
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);
		
		
		
	}
}
