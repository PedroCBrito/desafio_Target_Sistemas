import java.util.Scanner;

public class Exer_4 {
    public static void main(String[] args) {

        double velocidadeCarro = 110d, velocidadeCaminhao = 80d,
            distanciaEntreCidades = 100d, distanciaEncontro =0d,
            tempoPedagioCaminhaoHoras = 0.17 ;

        //contado o pedagio podemos considerar que como se a velocidade media do caminhao fosse menor,
        //portando:
        velocidadeCaminhao = distanciaEntreCidades/((distanciaEntreCidades/velocidadeCaminhao)+tempoPedagioCaminhaoHoras);

        //Igualando as distancia para que seja no momento que se encontrem, organizamos a equacao
        //temos que :
        distanciaEncontro = (velocidadeCarro * 100)/(velocidadeCarro+velocidadeCaminhao);

        System.out.printf("A distancia que os veiculos estaram de Ribeirão Preto é %.2fKm", distanciaEncontro);

    }
}
