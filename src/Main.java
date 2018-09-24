import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println ("請輸入身高(cm):");
        System.out.println("請輸入體重(kg):");
        float a = scn .nextFloat();
        float b = scn .nextFloat();
        double c = a/2.54;
        double d = b/0.454f;
        System.out.println(c+"吋");
        System.out.println(d+"英鎊");


    }
}
