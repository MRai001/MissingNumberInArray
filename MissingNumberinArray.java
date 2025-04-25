package day7;

public class MissingNumberinArray {

	public static void main(String[] args) {
		int sum1 =0;
		int sum2 =0;
		int [] a1 = {1,4,5,3};
		int [] a2 = {1,2,3,4,5};
		for (int i=0;i < a1.length; i++) {
			sum1 = sum1 +a1[i];
		}
		for (int i=0;i < a2.length; i++) {	
		sum2 = sum2 + a2[i];
				
		}	
		System.out.println(sum1);
		System.out.println(sum2);
				System.out.println("Missing number ="+ (sum2-sum1));

	}

}
