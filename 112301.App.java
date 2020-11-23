import java.util.Scanner;

public class Java201123_1 {
    public static void main(String[] args) {
        System.out.println("请输入一个位数：");
        while (true){
            Scanner scanner=new Scanner(System.in);
            int num1=scanner.nextInt();
            int x=(int)(Math.random()*100%100);
            int y=(int)(Math.random()*100%100);
            if (num1==1){
                System.out.println(""+x);
            }else {
                System.out.println(""+y);
            }
        }
    }
}
