package com.esc;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Week {
	private String name;
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Week [name=" + name + ", value=" + value + "]";
	}
}

public class CalendarWeek {

	// TODO: get dates from first day of year to current day, interval by weeks
	private static Week fetchWeekRange(LocalDate date) {
		Week week = new Week();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd MMM");
		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
		String nearestMonday = formatter.format(date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)));
		String nearestSunday = formatter.format(date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));

		week.setName("Week " + (long) date.get(woy) + " - " + nearestMonday + " - " + nearestSunday);
		week.setValue("week " + (long) date.get(woy));

		return week;
	}

	public static List<LocalDate> datesListOfCalendarWeek(int year, long calendarWeek, int weekNumber) {
		LocalDate start = LocalDate.ofYearDay(year, 1).with(IsoFields.WEEK_OF_WEEK_BASED_YEAR, calendarWeek)
				.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

		return IntStream.range(0, weekNumber).mapToObj(start::plusWeeks).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		List<Week> weeks = new ArrayList<>();

		LocalDateTime date = LocalDateTime.now();
		TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();

		datesListOfCalendarWeek(Year.now().getValue(), 1, date.get(woy)).forEach((i) -> {
			weeks.add(fetchWeekRange(i));
		});

		// For the current year, Print out weeks of the year till current week with date intervals
		weeks.forEach(week -> System.out.println("Current week: " + week));
	

	}

}
