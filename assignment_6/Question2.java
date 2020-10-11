package assignment_6;

public class Question2 {

	public static void main(String[] args) {
		
		for(int i = 1;i<=13;i++) {
			for(int j =1;j<=7&&i+j<=8;j++) {
				System.out.print(j+" ");
			}
			for(int k = 1;i-k>=6&&i>=8;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
