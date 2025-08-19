import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Sorteando o número */
        Random random = new Random();
        int sorteado = random.nextInt(100 + 1);
        /*Inicializador do "range" */
        int contador = (int) 1;
        
        System.out.println("|==Aqui será o jogo da advinhação==|");
        /*Classe de entrada do usuario */
        Scanner teclado = new Scanner(System.in);

        while(true){

            System.out.println("Coloque o seu número de 1 a 100");
            int opcao = teclado.nextInt();

            int range = Math.abs(opcao - sorteado);
            if(range <= 10){
                System.out.println("MUITO PERTO");
            }
            if(range > 10 && range <= 15){
                System.out.println("Ta perto");
            }
             if(range > 15 && range <= 30){
                System.out.println("Ta longe");
            }
             if(range > 30 && range <= 49){
                System.out.println("ta bem longe");

            }
             if(range > 50){
                System.out.println("MUITO LONGE");
            }
            
            if(opcao == sorteado){

                System.out.println("Voce acertou!");
                System.exit(0);
            }
         }    
        }

    }

