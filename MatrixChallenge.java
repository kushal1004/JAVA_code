
import java.util.*;

class subMatrix {
    public String matrixopt(String[] str) {
        int n = str.length; // row value
        int m = str[0].length(); // column value
/* 

// Time complexity = O(n*m)
//Space complexity = O(m)


 int[] prev = new int[m];
        int[] curr = new int[m];
        int maxSide = 0;

        for (int i = 0; i < n; i++) {
            Arrays.fill(curr, 0); // reset current array
            for (int j = 0; j < m; j++) {
                if (str[i].charAt(j) == '1') {
                    if (i == 0 || j == 0) {
                        curr[j] = 1;
                    } else {
                        curr[j] = Math.min(prev[j - 1], Math.min(prev[j], curr[j - 1])) + 1;
                    }
                    maxSide = Math.max(maxSide, curr[j]);
                }
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
*/

// Time complexity = O(n*m)
//Space complexity = O(n*m)

        int[][] dp = new int[n][m];
        int maxSide = 0;
         
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(str[i].charAt(j) == '1'){
                    if(i==0||j==0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1])) + 1;
                    }
                    maxSide = Math.max(maxSide,dp[i][j]);
                }
            }
        }
        
        return String.valueOf(maxSide * maxSide);
    }
}

public class MatrixChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strArr = new String[n];
        System.out.println("Enter the matrix rows (each row as string of 0/1):");
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.nextLine();
        }
        subMatrix matrix = new subMatrix();
        System.out.println(matrix.matrixopt(strArr));
        sc.close();
    }
}