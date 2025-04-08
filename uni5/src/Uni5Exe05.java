import java.util.Scanner;

public class Uni5Exe05 {
    /* 
     * Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o numero de n: ");
        int n = input.nextInt();
        input.close();
        double num1 = 8;
        double num2 = num1 + 2;
        if(n > 2 ) {
            for(int i = 1;i <= n; i++){
                System.out.println(num1);
                System.out.println(num2);
                
                num1 = num1 * 2;
                num2 = num1 + 2;
            }
        }else{
            System.out.println("n não aceito");
        }


    }
}
