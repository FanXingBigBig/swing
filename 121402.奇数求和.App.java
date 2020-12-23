package pac3;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 1;
		long sum = 0;
		while (i <= 2147483647){
	        if (i % 2 == 1){
	            sum = sum + i;
	        }
	        i++;
	    }
	    System.out.println("奇数和为"+sum);
	}

}
