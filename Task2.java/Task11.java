package StepLesson;

import java.util.Scanner;

public class Task11 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������� ������ �������� �� ������ ����:");
		int sec = scanner.nextInt();
		int day = 86400;
		int hour = 3600;
		int minets = 60;
		int second;
		second = sec % minets;
		minets = sec % hour / minets;  
		hour = sec % day / hour;
		day = sec / day;
		System.out.println("�� ������ ���� �������� " + day + " ����, " + hour + " �����, " + minets + " �����, " + second + " ������");
		
		
	}

}
