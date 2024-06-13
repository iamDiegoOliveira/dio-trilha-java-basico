import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner leitorEntradas = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o salário bruto do funcionário: ");

        double salarioBruto = leitorEntradas.nextDouble();

        System.out.println("Digite o adicional dos benefícios: ");

        double adicionalBeneficios = leitorEntradas.nextDouble();


        
        //iniciando variáveis
        double valorImposto = 0;
        double salarioLiquido = 0;

        if (salarioBruto > 0 && salarioBruto <= 1100.00) {

            valorImposto = 0.05 * salarioBruto;

             salarioLiquido = (salarioBruto - valorImposto) + adicionalBeneficios;
             System.out.println("5% de impostos adicionados");

        } else if (salarioBruto > 1100.01 && salarioBruto <= 2500.00) {

            valorImposto = 0.10 * salarioBruto;
 
             salarioLiquido = (salarioBruto - valorImposto) + adicionalBeneficios;
             System.out.println("10% de impostos adicionados");

         } else {

            valorImposto = 0.15 * salarioBruto;
 
             salarioLiquido = (salarioBruto - valorImposto) + adicionalBeneficios;
             System.out.println("15% de impostos adicionados");

         }

         System.out.println("Devido ao valor do seu salário, o imposto cobrado foi de $" + valorImposto + " reais. ");
         
         System.out.println("Foi calculado o salário do funcionário, o salário bruto é de $" + salarioBruto + " reais, o valor do imposto é de $" + valorImposto + " reais, o valor do benefício é de $" + adicionalBeneficios +" reais, o total do Salário Líquido é de $" + salarioLiquido + " reais.");



    }

    
}
