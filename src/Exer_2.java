import java.util.Scanner;

public class Exer_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Insira o numero para verificar se ele pertence a Fibonacci:");
        int desejado = scan.nextInt();
        int proximo=0, anterior = 0, atual = 1;
        while (atual<desejado){
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo ;
        }
        if (proximo == desejado) System.out.println("Pertence");
        else System.out.println("Não Pertence");

    }
}
