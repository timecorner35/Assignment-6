package assignment_6;

public class Question1 {

	public static void main(String[] args) {
		
		for (int i = 1;i<=13;i++) {
			for(int j = 1;j<=i&&i<=7;j++) {
				System.out.print(j+" ");
			}
			for (int k = 1;i>7&&(k+i)<=14;k++) {
				System.out.print(k+" ");
			}	
			System.out.println();
		}

	}

}
