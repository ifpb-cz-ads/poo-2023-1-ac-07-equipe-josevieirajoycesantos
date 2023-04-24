import java.util.Scanner;

public class CBBAtividadePratica6 {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner numero = new Scanner(System.in);
            System.out.println("Informe um número inteiro: ");
            int num2 = numero.nextInt();
            vetor[i] = num2;
        }
        int maior = vetor[0];
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + vetor[i]);
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        System.out.println(" O maior valor é: " + maior);
    }
}
