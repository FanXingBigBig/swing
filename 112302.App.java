import java.util.Scanner;

public class Java201123_2 {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            int x=(int)(Math.random()*100%100);
            int y=(int)(Math.random()*100%100);
            Thread.sleep(100);
            System.out.println(x+","+y);
        }
    }
}
