import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a1 = sc.nextInt();
        String s1 = sc.next();
        int a2 = sc.nextInt();
        String s2 = sc.next();



        System.out.println( (a1 >= 19 || s1.equals("M")) && ( a2 >= 19 || s2.equals("M")) ? 1 : 0);
    }
}