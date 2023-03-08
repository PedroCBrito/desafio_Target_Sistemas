public class Exer_3 {
    public static void main(String[] args) {
        int i =0;

//  a) 1, 3, 5, 7, ___
        i =1;
        System.out.printf("a)");
        while (i < 10){
            System.out.printf(i+" ");
            i+=2;
        }


System.out.println("");

//  b) 2, 4, 8, 16, 32, 64, ____
        int num1 = 2;
        System.out.printf("b)");
        for(i=0; i<6;i++){
            num1 = num1 * 2;
            System.out.printf(num1 + " ");
        }


System.out.println("");

//  c) 0, 1, 4, 9, 16, 25, 36, ____

    int num2 = 0, aux=1;
    System.out.printf("c)");
    for(i=0;i<7;i++){
        num2 += aux;
        aux +=2;
        System.out.printf(num2 + " ");
    }

System.out.println("");

//  d) 4, 16, 36, 64, ____
        int num3 = 0;
        aux=4;
        System.out.printf("d)");
        for(i=0;i<5;i++){
            num3 += aux;
            aux +=8;
            System.out.printf(num3 + " ");
        }




System.out.println("");

//  e) 1, 1, 2, 3, 5, 8, ____
        int proximo, anterior = 1, atual = 1;
        System.out.printf("e)");
        for (i = 1; i <= 7; i++) {
            System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo ;
        }


System.out.println("");
//  f) 2,10, 12, 16, 17, 18, 19, ____

    //Este desafio não foi implementado em codigo pois a logica esta relacionada
//   a forma como e escrito o numero por extenso
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, 200");


    }

}
