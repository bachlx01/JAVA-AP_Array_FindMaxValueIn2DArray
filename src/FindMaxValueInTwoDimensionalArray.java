import java.util.Scanner;

public class FindMaxValueInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We will create a two-dimensional array, that' size is W x H");
        System.out.print("Enter H: ");
        int h = input.nextInt();
        System.out.print("Enter W: ");
        int w = input.nextInt();

        int myArray[][] = new int[h][];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new int[w];
        }

        int max = myArray[0][0];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.printf("Enter value for index [%d][%d]: ", i, j);
                myArray[i][j] = input.nextInt();
                if (max < myArray[i][j]){
                    max = myArray[i][j];
                }
            }
        }
        System.out.println("max value is: " + max);

    }
}
