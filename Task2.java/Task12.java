package StepLesson;

import java.util.Scanner;

public class Task12 {	
	public static void main(String[] args) {
		int puples;
		int pie;
		double milk;
		double lightweightPer�ent;
		double lightweightPuples;
		
		try (Scanner scanner = new Scanner(System.in)){
			
			for (int i = 0; i < 3; i++) {
				
				System.out.println("������� ����������� ���������������:");
	        		puples = scanner.nextInt();
	        	System.out.println("������� ������� �����, ��� ������� ����� 30 ��.:");
	        		lightweightPer�ent = scanner.nextInt();	
	        		
	        		lightweightPuples = (puples * lightweightPer�ent) / 100;
	        		lightweightPuples = Math.ceil(lightweightPuples);
		
	        	System.out.println("����������� ��������, ��� ��� ������ 30 ��.: " + lightweightPuples + "�������");	
			
	        		pie = (int)(puples + lightweightPuples);
	        		milk = (lightweightPuples * 0.2) / 0.9;
		 
	        	System.out.println("����������� ��������: " + pie + " ��.");
	        	System.out.println("����������� ������� ������: " + Math.ceil(milk) + " ��");
	        	System.out.println("\n" + "***" + "\n");
				}
			}
		}
	}