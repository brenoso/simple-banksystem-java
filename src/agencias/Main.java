package agencias;

import java.util.Scanner; // importação da biblioteca de leitura de dados do teclado


public class Main {
    public static void main(String[] args) {
        
    Conta conta1; // declaração da variável conta1 do tipo Conta (classe Conta)
    conta1 = new Conta (); // instanciação do objeto conta1
    
    Cliente cliente1 = new Cliente(); // criação da variável cliente1 do tipo de classe Cliente
    conta1.titular = cliente1; // atribuição da variavel cliente1 para o atributo titular do objeto conta1.
   


    Scanner teclado = new Scanner(System.in); // declaração de objeto para entrada de dados.

        System.out.println("Digite o nome do proprietário da conta: ");
        conta1.titular.nome = teclado.nextLine();
        
        System.out.println("Digite o sobrenome do proprietário da conta: ");
        conta1.titular.sobrenome = teclado.nextLine();
        
        System.out.println("Digite o cpf do proprietário da conta: ");
        conta1.titular.cpf = teclado.nextLine();
              
        System.out.println("Digite um numero para conta: ");
        conta1.numero = teclado.nextInt();
        
        System.out.println("Digite um saldo inicial para conta: ");
        conta1.saldo = teclado.nextDouble();
               
        System.out.println("Digite o limite da conta: ");
        conta1.limite= teclado.nextDouble();
        
        System.out.format("\nA conta de %s foi criada com sucesso!",conta1.titular.nome);
        System.out.println("\n\nDados: ");
        System.out.println("Titular : "+conta1.titular.nome +" " +conta1.titular.sobrenome);
        System.out.println("CPF: "+conta1.titular.cpf);
        System.out.println("Saldo: "+conta1.saldo);
        System.out.println("Limite: "+conta1.limite);
        System.out.println("Numero da conta: "+conta1.numero);
        
        System.out.println("\nDigite um valor para saque:");
        conta1.saca(teclado.nextDouble()); // método conta1.saca(double) tendo como passagem por referencia o método teclado.nextDouble().

        System.out.println("Digite um valor para depósito: ");
        conta1.deposita(teclado.nextDouble()); // deposito de 200 reais.

    }

}
