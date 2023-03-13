import java.util.Scanner;

public class AtvMatriz04 {

    public static void somarLinhas(int[][] matNumeros, int[]matSomaLinha){
        int soma;
        for (int i = 0; i < matSomaLinha.length; i++){
            soma = 0;
            for (int j = 0; j < matNumeros[i].length; j++){
                soma = soma + matNumeros[i][j];
                matSomaLinha[i] = soma;
            }
        }
    }

    public static void somarColunas(int[][] matNumeros, int[]matSomaColuna){
        int soma;
        for(int j = 0; j < matNumeros[0].length; j++) {
            soma = 0;
            for (int i = 0; i < matNumeros.length; i++) {
                soma = soma + matNumeros[i][j];
                matSomaColuna[j] = soma;
            }
        }
    }

    public static int somaSomaLinhas(int[] matSomaLinha){
        int soma = 0;

        for (int i = 0; i < matSomaLinha.length; i++){
            soma = soma + matSomaLinha[i];
        }

        return soma;
    }

    public static void main(String[] args){
        int[][] numeros = new int[4][5];
        int numero;
        int resultado;
        int[] somaLinha = new int[4];
        int[] somaColuna = new int[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Preencha a matriz com valores inteiros: ");

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println("Informe um número: ");
                numero = input.nextInt();
                numeros[i][j] = numero;
            }
        }

        somarLinhas(numeros, somaLinha);
        System.out.println("\nVetor soma linhas: ");
        for(int i = 0; i < somaLinha.length; i++) {
            System.out.println("[" + i + "] = " + somaLinha[i]);
        }

        System.out.println("---------------------------");

        somarColunas(numeros, somaColuna);
        System.out.println("Vetor soma colunas: ");
        for(int i = 0; i < somaColuna.length; i++) {
            System.out.println("[" + i + "] = " + somaColuna[i]);
        }

        resultado = somaSomaLinhas(somaLinha);
        System.out.println("Resultado da soma resultante de linhas: " + resultado);
    }
}

