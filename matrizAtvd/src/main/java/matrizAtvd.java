import java.util.Scanner;

public class matrizAtvd {

    public static void exibeMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrizA = new int[3][4];
        int[][] matrizB = new int[3][4];
        int[][] matrizC = new int[3][4];
        int numero;

        Scanner input = new Scanner(System.in);

        System.out.println("Preencha a matriz A com valores inteiros.");

        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                System.out.println("Informe um número: ");
                numero = input.nextInt();
                matrizA[i][j] = numero;
            }
        }
        System.out.println("A matriz A foi preenchida com sucesso!");

////////////////////////////////////////////////////////////////////////

        System.out.println("Preencha a matriz B com valores inteiros.");

        for (int i = 0; i < matrizB.length; i++){
            for (int j = 0; j < matrizB[i].length; j++){
                System.out.println("Informe um número: ");
                numero = input.nextInt();
                matrizB[i][j] = numero;
            }
        }

/////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < matrizC.length; i++){
            for (int j = 0; j < matrizC[i].length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz A:");
        exibeMatriz(matrizA);

        System.out.println("\nMatriz B:");
        exibeMatriz(matrizB);

        System.out.println("\nMatriz C:");
        exibeMatriz(matrizC);
    }
}
