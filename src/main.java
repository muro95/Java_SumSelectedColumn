import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = input.nextInt();
        System.out.println("Enter the number of column; ");
        int column = input.nextInt();
        System.out.println("Enter the column you want to calculate: ");
        int selected = input.nextInt();
        int[][] array = createArray(row, column);
        display(array);
        int result = sum(array, selected);
        System.out.println("Sum for column " + selected + " is " + result);
    }

    static int sum(int[][] arr, int num) {
        int total = 0;
        for (int i = 0; i < arr[num].length; i++) {

            total += arr[i][num];

        }
        return total;
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] createArray(int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
}
