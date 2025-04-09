public class Uni5Exe11 {
    public static void main(String[] args) {
        int quantBiscoito = 1;
        int total = 1;
        for(int i = 1; i < 16; i++){
            
            quantBiscoito *= 3;
            total += quantBiscoito;

        }
        System.out.println("Quantidade de biscoitos: "+total);

    }
}
