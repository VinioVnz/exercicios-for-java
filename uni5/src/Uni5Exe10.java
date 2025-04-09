public class Uni5Exe10 {
    public static void main(String[] args) {
        int encontrados = 0;

        for (int n = 1; encontrados < 10; n++) {
            long quadrado = (long) n * n;
            String str = "" + quadrado;
            int len = str.length();
            boolean ehKaprekar = false;

            for (int i = 1; i < len; i++) {
                String esq = str.substring(0, i);
                String dir = str.substring(i);

                
                int numEsq = 0;
                for (int j = 0; j < esq.length(); j++) {
                    numEsq = numEsq * 10 + (esq.charAt(j) - '0');
                }

                int numDir = 0;
                for (int j = 0; j < dir.length(); j++) {
                    numDir = numDir * 10 + (dir.charAt(j) - '0');
                }

                if (numDir != 0 && numEsq + numDir == n) {
                    ehKaprekar = true;
                    break;
                }
            }

            if (n == 1 || ehKaprekar) {
                System.out.println(quadrado);
                encontrados++;
            }
        }
    }
}
