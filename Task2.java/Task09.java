package StepLesson;

public class Task09 {
	static float[] num = { 3.14f, 5.0f, 2.5f, 10.0f };

		public static void main(String[] args) {
			for (int i = 0; i < num.length; i++) {
				if (num[i] % 1 == 0) {
					System.out.println("����� " + num[i] + " �� ����� ������������ �����");
					continue;
				}
				System.out.println("����� " + num[i] + " ����� ������������ �����");
			}
	}

}
