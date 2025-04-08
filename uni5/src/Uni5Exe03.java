/* 
 * Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:

 */
public class Uni5Exe03 {
    public static void main(String[] args) {
        double somatoria = 0;

        for(double i = 1; i<= 100;i++){
            somatoria += 1/i;
        }
        System.out.println("Somatoria: "+somatoria);
    }
  
}
