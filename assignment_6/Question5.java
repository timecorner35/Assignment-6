package assignment_6;

public class Question5 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=7; i++) {
			for(int one = 1; one<=7-i;one++) {
			System.out.print("1");
			}	
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
	}

}
