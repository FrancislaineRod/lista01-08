import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        
        float valor_hora=0.0f,horas_trabalhadas=0.0f,total=0.0f;

        System.out.print("Digite o valor que ganha por hora de trabalho: ");
        valor_hora = console.nextFloat();
        
        System.out.print("Digite as horas trabalhadas no mês: ");
        horas_trabalhadas = console.nextFloat();

        console.close();

        total = valor_hora*horas_trabalhadas;

        System.out.println("O valor total do salário a receber no mês é de "+total);
        
    }
}
