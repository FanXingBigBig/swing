package pac1;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年份");
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();//接收年份
		if(year>-3200 && year<3200) {
			if (year<0) {
				if (year%4==1 || year%400==1) {
					System.out.println(year+"是闰年");
				}else {
					System.out.println(year+"不是闰年");
				}
			}else {
				if (year%4==0 && year%400==0) {
					System.err.println(year+"是闰年");
				}else {
					System.out.println(year+"不是闰年");
				}
			}
		}else {
			System.err.println("只能输入-3200到3200内的数");
		}
	}

}
