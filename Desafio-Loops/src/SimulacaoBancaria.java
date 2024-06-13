import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            exibirMenu();

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Foi depositado " + valorDepositado + ", saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser Sacado: ");
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado <= saldo){
                      saldo -= valorSacado;
                      System.out.println("Saldo atual: " + saldo);
                    } else {
                      System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    
    
     public static void exibirMenu() {
        System.out.println("\n----- Menu -----");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Encerrar");
        System.out.println("----------------");
        System.out.print("Escolha uma opção: ");
    }
}