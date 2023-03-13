import java.util.Scanner;

public class matrizAtvd {

    public static void preencheGabarito(char[] vet){
        char respGabarito;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o gabarito para esta questão: ");
            respGabarito = input.next().toLowerCase().trim().charAt(0);

            vet[i] = respGabarito;
        }
    }

    public static void preencheResultados(String[] alunos, char[][] resp){
        char respGabarito;
        String nome;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < resp.length; i++) {
            System.out.print("\nInforme o seu nome: ");
            nome =  input.nextLine();
            alunos[i] = nome;

            for (int j = 0; j < resp[i].length; j++) {
                System.out.print("Informe a sua resposta: ");
                respGabarito = input.nextLine().trim().toLowerCase().charAt(0);
                resp[i][j] = respGabarito;
            }
        }
    }

    public static void calculaAcertos(char[][] resp, char[] gabarito, int[] acertos){
        int qtdAcertos;

        for (int i = 0; i < resp.length; i++) {
            qtdAcertos = 0;
            for (int j = 0; j < resp[i].length; j++) {
                if (gabarito[i] == resp[i][j]) {
                    qtdAcertos++;
                }
                acertos[i] = qtdAcertos;
            }
        }
    }

    public static void exibeAprovados(int[] vet, String[] alunos){
            for (int i = 0; i < vet.length; i++) {
                if(vet[i] >= 70) {
                    System.out.println(alunos[i] + " = [" + vet[i] + "]");
                }
            }
    }

    public static void main(String[] args){
        char[] gabarito = new char[100];
        String[] nomesAlunos = new String[50];
        char[][] respostas = new char[50][100];
        int[] acertos = new int[50];

        preencheGabarito(gabarito);
        preencheResultados(nomesAlunos, respostas);
        calculaAcertos(respostas, gabarito, acertos);
        exibeAprovados(acertos, nomesAlunos);
    }
}

