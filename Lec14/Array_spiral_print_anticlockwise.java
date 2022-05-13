package Lec14;
import java.util.*;
public class Array_spiral_print_anticlockwise {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] arr = new int[r][c];

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
printSpiral(arr);
}
public static void printSpiral(int[][] arr) {
    int minr = 0;
    int maxr = arr.length - 1;
    int minc = 0;
    int maxc = arr[0].length - 1;
    int total = arr.length * arr[0].length;
    int count = 0;

    while (count < total) {
    for (int i = minr; i <= maxr && count < total; i++) {
        System.out.print(arr[i][minc] + ", ");
        count++;
    }
    minr++;
        for (int i = minc; i <= maxc && count < total; i++) {
            System.out.print(arr[maxr][i] + ", ");
            count++;
        }
        maxc--;
        for (int i = maxr; i >= minr && count < total; i--) {
            System.out.print(arr[i][maxc] + ", ");
            count++;

        }
        maxr--;
        for (int i = maxc; i >= minc && count < total; i--) {
            System.out.print(arr[minr][i] + ", ");
            count++;
        }
        minc++;
}
    System.out.print("END");
}
}
