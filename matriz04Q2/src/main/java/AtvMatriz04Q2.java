import java.util.Scanner;

public class AtvMatriz04Q2 {

        public static int somarAcimaDiagonal(int[][] matNumeros){
            int soma = 0;
            for (int i = 0; i < matNumeros.length; i++){
                for (int j = 0; j < matNumeros[i].length; j++){
                   if(i>j){
                       soma = soma + matNumeros[i][j];
                   }
                }
            }
            return soma;
        }

        public static void main(String[] args){
            int[][] numeros = new int[4][4];
            int numero;
            int resultado;

            Scanner input = new Scanner(System.in);
            System.out.println("Preencha a matriz A com valores inteiros: ");

            for (int i = 0; i < numeros.length; i++){
                for (int j = 0; j < numeros[i].length; j++){
                    System.out.println("Informe um número: ");
                    numero = input.nextInt();
                    numeros[i][j] = numero;
                }
            }

            resultado = somarAcimaDiagonal(numeros);
            System.out.println("A soma dos elementos abaixo da diagonal principal desta matriz, é: " + resultado);
        }
    }