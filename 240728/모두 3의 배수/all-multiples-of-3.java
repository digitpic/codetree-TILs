import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.nextInt() % 3 == 0 && sc.nextInt() % 3 == 0 && sc.nextInt() % 3 == 0 && sc.nextInt() % 3 == 0 && sc.nextInt() % 3 == 0) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
        
    }
}