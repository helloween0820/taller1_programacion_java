import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[] num = new int[4];

        for (int i = 0; i< num.length; i++){
            System.out.println("Ingresar un numero: ");
            num[i]= sc.nextInt();

        }

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));



    }
}