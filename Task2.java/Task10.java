package StepLesson;

public class Task10 {
	public static void main(String args[]) {
		final int height = 180;
		final int weight = 92;
		int idealweight = (height - 110);
		int e = weight - idealweight;
		if (e < 0)
			System.out.println("���������� ������� " + -e + "��");
		else if (e > 0)
			System.out.println("���������� �������� " + e + " ��");
		else {
			System.out.println("�� ��������");
		}
		
		
		
	}

}
