package pac2;

import java.util.Scanner;

public class App2 {

	public static long fbnq(long shu) {
		if (shu==0 || shu==1) {
			return shu;
		}else {
			return fbnq(shu-1)+fbnq(shu-2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入：");
		Scanner scanner=new Scanner(System.in);
		int shu=scanner.nextInt();
		if (shu<40 && shu>1) {
			System.out.printf("斐波那契数列 of %d 是: %d\n",shu,fbnq(shu));
		}
	}

}
