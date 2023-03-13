import java.util.Scanner;

public class matrizAtvd {

    public static void main(String[] args) {
        double media, nota1, nota2;
        double[][] matrizMedias = new double[20][3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matrizMedias.length; i++) {
            System.out.println("Informe a primeira nota deste aluno: ");
            nota1 = input.nextDouble();
            System.out.println("Informe a segunda nota deste aluno: ");
            nota2 = input.nextDouble();

            media = ((nota1 * 2) + (nota2 * 3)) / 5;

            System.out.println("O aluno obteve média " + media);
            for (int j = 0; j < matrizMedias[i].length; j++) {
                matrizMedias[i][0] = nota1;
                matrizMedias[i][1] = nota2;
                matrizMedias[i][2] = media;
            }
        }

        System.out.print("\nAV1  | AV2  | Média\n");

        for (int i = 0; i < matrizMedias.length; i++) {
            for (int j = 0; j < matrizMedias[i].length; j++) {
                System.out.print("[" + matrizMedias[i][j] + "] ");
            }
            System.out.println();
        }
    }
}