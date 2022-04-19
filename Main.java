public class Main {
    public static void main(String[] args) {
        int m[][]= {{1,2},{3,4}}; 

        System.out.println("Matriz original:");
        printarMatriz(m);

        System.out.println("Rodar 90 graus");
        printarMatriz(rotacionarMatriz(m, 90));

        System.out.println("Rodar 180 graus");
        printarMatriz(rotacionarMatriz(m, 180));

        System.out.println("Rodar 270 graus");
        printarMatriz(rotacionarMatriz(m, 270));
        
        System.out.println("Rodar 360 graus");
        printarMatriz(rotacionarMatriz(m, 360));
    }

    public static void printarMatriz(int[][] matriz){
        int linha = matriz.length;
        int coluna = matriz[0].length;

        for (int i=0; i<linha; i++) {
            for (int j=0; j<coluna; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println();
    }
    

    public static int[][] rotacionarMatriz(int[][] matriz, int grau){
        int linha = matriz.length;
        int coluna = matriz[0].length;
        int[][] novaMatriz = null;

        for(int i=0; i<linha; i++){
            for(int j=0; j<coluna; j++){
                if (grau == 90) {
                    if(novaMatriz == null) novaMatriz = new int[coluna][linha];
                    novaMatriz[j][coluna-i-1] = matriz[i][j];
                }

                if (grau == 180) {
                    if(novaMatriz == null) novaMatriz = new int[linha][coluna];
                    novaMatriz[coluna-j-1][linha-i-1] = matriz[i][j];
                }

                if (grau == 270) {
                    if(novaMatriz == null) novaMatriz = new int[coluna][linha];
                    novaMatriz[linha-i-1][j] = matriz[i][j];
                }

                if (grau == 360) {
                    if(novaMatriz == null) novaMatriz = new int[coluna][linha];
                    novaMatriz[i][j] = matriz[i][j];
                }
            }
        }

        return novaMatriz;
    }
}