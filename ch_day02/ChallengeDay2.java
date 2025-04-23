package ch_day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeDay2 {
    public static void main(String[] args) {
        // int [] myNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // displayArrays(orderEvenBeforeOdd(myNums));

        // int [] myNums = {1, 4, 8, 9};
        // displayArrays(addOnePlus(myNums));

        /* String [] checkPalindrome = {"true","false","false"};
        System.out.println("Input : " + Arrays.toString(checkPalindrome));
        System.out.println(isPalindrome(checkPalindrome)); */

        // displayMatrix(diagonal1(5,5));

        // displayMatrix(diagonal2(5,5));

        // displayMatrix(matrix1(7));

        displayMatrix(matrix2(8));
    }

    // To show array output
    public static void displayArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // To show matrix output
    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                System.out.printf("%4s", matrix[row][col]);
            }
            System.out.println();
        }
    }

    // Challenge 3-1
    public static int[] orderEvenBeforeOdd(int[] arr) {
        List listEven = new ArrayList<>();
        List listOdd = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 == 0) {
                listEven.add(j);
            } else {
                listOdd.add(j);
            }
        }
        int index =  0;
        for (Object i : listEven) {
            arr[index] = (int) i;
            index++;
        }
        for (Object i : listOdd) {
            arr[index] = (int) i;
            index++;
        }

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < left - 1; i++) {
            for (int j = 0; j < left - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = left; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Challenge 3-2
    public static boolean isPalindrome(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Challenge 3-3
    public static int[] addOnePlus(int[] arr) {
        int newArr = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + newArr;
            arr[i] = sum % 10;
            newArr = sum / 10;
        }

        if(newArr > 0) {
            int[] newArr2 = new int[arr.length + 1];
            newArr2[0] = newArr;
            System.arraycopy(arr, 0, newArr2, 1, arr.length);
            return newArr2;
        }

        return arr;
    }

    // Challenge Matrix-1
    public static int[][] diagonal1(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    matrix[row][col] = row + 1;
                } else if (row > col) {
                    matrix[row][col] = 20;
                } else {
                    matrix[row][col] = 10;
                }
            }
        }
        return matrix;
    }

    // Challenge Matrix-2
    public static int[][] diagonal2(int n, int m) {
        int[][] matrix = new int[n][m];
        int counter = n;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    matrix[row][col] = counter;
                    counter--;
                } else if (row > col) {
                    matrix[row][col] = 10;
                } else {
                    matrix[row][col] = 20;
                }
            }
        }
        return matrix;
    }

    // Challenge Matrix-3
    public static int[][] matrix1(int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0) {
                    matrix[row][col] = col;
                } else if (col == 0) {
                    matrix[row][col] = row;
                } else if (row == matrix.length - 1) {
                    matrix[row][col] = row + col;
                } else if (col == matrix[row].length - 1) {
                    matrix[row][col] = col + row;
                }
            }
        }
        return matrix;
    }

    // Challenge Matrix-4
    public static int[][] matrix2(int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < n - 1; col++) {
                matrix[row][col] = row + col;
                matrix[row][n - 1] += matrix[row][col];
                matrix[n - 1][row] += matrix[row][col];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            matrix[n - 1][n - 1] += matrix[n - 1][i];
        }
        return matrix;
    }
}
