import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1;

        // index 기준
        for (int col = n-1; col >= 0; col--) {

            // 짝수
            if ( (col+1) % 2 == 0) {
                for (int row = n-1; row >= 0; row--, cnt++) {
                    arr[row][col] = cnt;
                }    
            }
            
            // 홀수
            else {
                for (int row = 0; row < n; row++, cnt++) {
                    arr[row][col] = cnt;
                }
            }

        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}