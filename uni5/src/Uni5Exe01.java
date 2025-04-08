import java.util.Scanner;

public class Uni5Exe01 {
    /* 
     * Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 20; i++){
            System.out.println("Digite um número: ");
            int num = input.nextInt();
            if(num % 2 == 0){
                System.out.println("Par");
            }else {
                System.out.println("Impar");
            }
        }

        input.close();
    }
}
