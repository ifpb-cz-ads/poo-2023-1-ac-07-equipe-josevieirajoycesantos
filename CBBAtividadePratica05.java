package Colaborativa;

public class CBBAtividadePratica05 {
    public static void main(String[] args) {
        String dias[ ] = {"Segunda", "Terça","Quarta", "Quinta", "Sexta",
        "Sábado", "Domingo"};
        int i=0;

        System.out.println("Usando for:"); // for
        for (i=0; i<dias.length; i++) {
            System.out.println(dias[i]);
        }

        i=0;

        System.out.println(" ");
        System.out.println("Usando while:"); // while
        while(i< dias.length){

            System.out.println(dias[i]);
            i++;
        }

        i=0;
        System.out.println(" ");
        System.out.println("Usando dowhile:"); // dowhile
        do {
            System.out.println(dias[i]);
            i++;
        } while (i< dias.length);
    }
}


