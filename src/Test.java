import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap canh 1:");
        double s1 = sc.nextDouble();

        System.out.println("nhap canh2:");
        double s2 = sc.nextDouble();

        System.out.println("nhap canh 3");
        double s3 = sc.nextDouble();

        sc.nextLine();
        System.out.println("nhap mau");
        String color = sc.nextLine();

        Triagle triagle = new Triagle(s1,s2,s3);
        triagle.setColor(color);

        System.out.println("\n--- RESULT ---");
        System.out.println(triagle);
        System.out.println("Area: " + triagle.getArea());
        System.out.println("Perimeter: " + triagle.getPerimeter());

}
}
