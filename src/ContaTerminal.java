import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //Atributos
    int numeroConta;
    String nomeCliente;
    double saldo;
    String agencia;

    //Métodos
    public void criarConta(){
        System.out.println("Bem vindo ao Banco. Insira seus dados abaixo \n");
        System.out.println("Insira seu nome: ");
        nomeCliente = scanner.next();
        System.out.println("\nInsira seu saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.println("\nConta criada com sucesso!");
        numeroConta = 202;
        agencia = "B34";
        System.out.printf("\nSeu nome é %s, número de conta %d, da agência %s e com saldo inicial de R$%.2f", nomeCliente, numeroConta, agencia, saldo);
    }

    public void menu(){
        int opcao = 5;
        while(opcao != 0){
            System.out.printf("\nMENU BANCO\n");
            System.out.printf("(1)Depositar");
            System.out.printf("\n(2)Sacar");
            System.out.printf("\n(3)Ver conta");
            System.out.printf("\n(0)Sair");

            System.out.printf("\nDigite sua opção: ");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.printf("\nOpção escolhida => (1) Depositar");
                depositar();
            }
            else if (opcao == 2){
                System.out.printf("\nOpção escolhida => (2) Sacar");
                sacar();
            }
            else if (opcao == 3){
                System.out.printf("\nOpção escolhida => (3) Ver conta");
                verConta();
            }
            else if (opcao == 0){
                System.out.printf("\nObrigado pela preferência e volte sempre!");
                break;
            }
        }
    }

    public void depositar(){
        System.out.printf("\nSeu valor atual no banco é de R$%.2f. Digite a quantia que deseja depositar: ", saldo);
        double deposito = scanner.nextDouble();
        saldo += deposito;
        System.out.printf("\nSeu saldo atual é de R$%.2f", saldo);
    }

    public void sacar(){
        System.out.printf("\nSeu valor atual no banco é de R$%.2f. Digite a quantia que deseja sacar: ", saldo);
        double saque = scanner.nextDouble();
        saldo -= saque;
        System.out.printf("\nSucesso!! Você acabou de sacar R$%.2f", saque);
        System.out.printf("\nSeu saldo atual é de R$%.2f", saldo);
    }

    public void verConta(){
        System.out.printf("\nSeu nome é %s, número de conta %d, da agência %s e com saldo atual de R$%.2f", nomeCliente, numeroConta, agencia, saldo);
    }
}

/*
**Revise sobre regras de declaração de variáveis**

        | Atributo | Tipo | Exemplo |
        | --- | --- | --- |
        | Numero | Inteiro | 1021 |
        | Agencia | Texto | 067-8 |
        | Nome Cliente | Texto | MARIO ANDRADE |
        | Saldo | Decimal | 237.48 |

        **Revise sobre terminal, main args e a classe Scanner**

        1. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
        - Programa: "Por favor, digite o número da Agência !"
        - Usuário: 1021 *(depois ENTER para o próximo campo)*

        **Revise sobre concatenação e classe String com método concat**

        1. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

        *"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.*/