import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
       
        Double temperaturaC, temperaturaF,mReal, mDolar, cotacao ;
        int opcaoMenu=0;
     
        do {
             System.out.println ("Bem vindo, o que você deseja fazer?");         
             System.out.println (" 1 - Converter temperatura para Fahrenheit: ");
             System.out.println (" 2 - Converter temperatura para Celsius: ");
             System.out.println (" 3 - Converter a moeda Dolar em Reais: ");
             System.out.println (" 4 - Converter a moeda Real em Dolares: ");
             System.out.println (" 5 - sair ");
             opcaoMenu = leitorScanner.nextInt();
         
             switch(opcaoMenu){
                case 1:{ 
                    System.out.println(" Digite a temperatura que voce quer converter de Celsius para Fahrenheit: ");
                    temperaturaC = leitorScanner.nextDouble();
                    temperaturaF = (temperaturaC-32)/1.8d;
                    System.out.println("temperaturaF = " + temperaturaF) ; 
                    break;
                }
                 case 2:{
                    System.out.println(" Digite a temperatura que voce quer converter de Fahrenheit para Celsius: ");
                    temperaturaF = leitorScanner.nextDouble();
                    temperaturaC = (temperaturaF * 1.8)+32 ;
                    System.out.println("TemperaturaC = " + temperaturaC);  
                    break;
                 }
                 case 3:{
                    System.out.println(" Digite quantos Dolares que voce quer converter em Reais: ");
                    mDolar = leitorScanner.nextDouble();
                    System.out.println("Digite qual é a cotação atual ");
                    cotacao = leitorScanner.nextDouble();
                    mReal = mDolar * cotacao;
                    System.out.println("R$ "  + mReal );  
                    break;
                }
                 case 4:{
                    System.out.println(" Digite qauntos Dolares que voce quer converter em Reais: ");
                    mReal = leitorScanner.nextDouble();
                    System.out.println("Digite qual é a cotação atual ");
                    cotacao = leitorScanner.nextDouble();
                    mDolar = mReal / cotacao;
                    System.out.println("$ " + mDolar  );  
                    break;
                }
               
            }
        }while (opcaoMenu != 5);
    }
}
