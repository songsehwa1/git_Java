import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner s = new Scanner(System.in);	
			
			System.out.println("입력 : ");
			int i = s.nextInt();
						
			System.out.println("첫 번째 숫자 : ");
			int j = s.nextInt();
					
			System.out.println("두 번째 숫자 : ");
			int k = s.nextInt();
			
			switch (i) {
			case 1 : System.out.println(j + "+" + k + "=" + (j + k));
				break;
			
			case 2 : System.out.println(j + "-" + k + "=" + (j - k));
				break;
			
			case 3 : System.out.println(j + "*" + k + "=" + (j * k));
				break;
			
			case 4 : System.out.println(j + "/" + k + "=" + (j / k));
				break;
			
			default: System.out.println("asdf");
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
