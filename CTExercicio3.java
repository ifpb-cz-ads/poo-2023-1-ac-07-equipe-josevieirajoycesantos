import java.util.Scanner;

public class CTExercicio3 {
    public static void main(String[] args) {
        int[] alunos = new int[10];
        int media = 0, notasAbaixo = 0, notasAcima = 0;
        for (int i = 0; i < 10; i++) {
            Scanner notas = new Scanner(System.in);
            System.out.println("Insira uma nota valida para um aluno: ");
            alunos[i] = notas.nextInt();
            media = alunos[i] + media;
        }
        media = media / 10;
        System.out.println("A media dos alunos foi: " + media);
        for (int i = 0; i < 10; i++) {
            if (alunos[i] > media) {
                notasAcima++;
            } else {
                notasAbaixo++;
            }
        }
        System.out.println("A quantidade de notas abaixo foi: " + notasAbaixo + " Já a quatidade de Notas acima foi: "
                + notasAcima);
    }
}
