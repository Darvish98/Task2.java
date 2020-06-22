package StepLesson;

import java.util.Scanner;

public class Task11 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите сколько секунд осталось до нового года:");
		int sec = scanner.nextInt();
		int day = 86400;
		int hour = 3600;
		int minets = 60;
		int second;
		second = sec % minets;
		minets = sec % hour / minets;  
		hour = sec % day / hour;
		day = sec / day;
		System.out.println("До Нового Года осталось " + day + " дней, " + hour + " часов, " + minets + " минут, " + second + " секунд");
		
		
	}

}
