import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = (int)c - 1;
        char result = (char)n;

        System.out.println(result);
    }
}