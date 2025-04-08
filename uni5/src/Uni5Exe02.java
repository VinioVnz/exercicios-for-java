/* 
 * Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

 */

public class Uni5Exe02 {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;
        for(int i = 1; i <= 100 ; i++){
            if(i % 2 ==0){
                pares+=i;
            }else{
                impares+=i;
            }
        }
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
    }
}
