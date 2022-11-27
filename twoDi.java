import java.util.Scanner;

public class twoDi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int size = sc.nextInt();
        int[][] mat, mat2;
        mat = new int[size][size];
        mat2 = new int[size][size];
        System.out.println("Enter The value in First Matrix:->");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("store the value in [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter The value in Second Matrix:->");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("store the value in [" + i + "][" + j + "]: ");
                mat2[i][j] = sc.nextInt();
            }

        }

        System.out.println("First Matrix:=>");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((mat[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("Second Matrix:=>");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((mat2[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("The Sum Of Two Dimensional Matrix Is:->");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((mat[i][j] + mat2[i][j]) + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
