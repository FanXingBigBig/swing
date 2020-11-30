package pac;

public class R extends App {
	static void r(){
        String boy_filePath="img/boy.png";
        String girl_filePath="img/girl.png";
        int arrary2d[][]={{1,2},{3,4},{5,6}};
        //System.out.println(arrary2d.length);//看他的行数
        for (int row = 0; row < arrary2d.length; row++) {//遍历他的行
            for (int column = 0; column < arrary2d[0].length; column++) { //他的列
                System.out.print(arrary2d[row][column]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(boy_filePath+"\n"+girl_filePath);
    }
}
