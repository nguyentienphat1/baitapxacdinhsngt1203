import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int gt=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        if (x==0){
         gt=1;
        }
        for (int i=1;i<=x;i++){
            gt=gt*i;
        }
        System.out.println("ket qua la:"+gt);
    }
}