import java.util.Scanner;

public class Exer_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Insira a String que deseja inverter:");
        String str = scan.next(), strInvertida ="";

        for(int i = str.length(); i > 0; i--){
            strInvertida  += str.charAt(i-1);
        }

            System.out.println(strInvertida);





    }
}
