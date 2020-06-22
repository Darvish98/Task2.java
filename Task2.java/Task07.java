package StepLesson;

public class Task07 {
	public static void main(String args[]) {		
		double percent = 13.5;
		double  dollar = 1000;
		int years = 2;
		double V1 = (dollar * percent ) / 100;
		double V2 = (V1 * years ) + dollar;
		System.out.println(V2);

}
}