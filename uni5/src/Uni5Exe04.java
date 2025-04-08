/* 
 * Descreva um algoritmo para calcular o valor de S dado por:
 */
public class Uni5Exe04 {
    public static void main(String[] args) {
        double somatoria = 0;
        double deCima = 3;
        double deBaixo = 2;
        double apoio = 4;

        for (int i = 1; i <= 20; i++) {
            somatoria += deCima / deBaixo;
            deCima += 2;           
            deBaixo += apoio;
            apoio += 2;

        }
        System.out.println("Somatoria: "+somatoria);
    }
}
