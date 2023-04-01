import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        float temperaturaC, temperaturaF;
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println(" Digite a temperatura que voce quer converter de Celsius para Fahrenheit: ");
        temperaturaC = leitorScanner.nextFloat();
        temperaturaF = (temperaturaC-32)/1.8f;
        System.out.println("TemperaturaF = " + temperaturaF);
    }
}