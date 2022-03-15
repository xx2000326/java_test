package number1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println("请输入长");
        Scanner c = new Scanner(System.in);
        double height = c.nextDouble();
        System.out.println("请输入宽");
        double width = c.nextDouble();

        Rectangle rectangle = new Rectangle();

        System.out.println("周长为"+rectangle.zc(height,width));
        System.out.println("面积为"+rectangle.mj(height,width));
    }
}
