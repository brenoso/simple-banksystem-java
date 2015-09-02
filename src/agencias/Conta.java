package agencias;

import java.util.Scanner; // importação da biblioteca de leitura de dados do teclado


public class Conta {
    
Scanner teclado = new Scanner(System.in); // declaração de objeto para entrada de dados.


       int numero;
       double saldo;
       double limite;
       Cliente titular = new Cliente(); // declaração de titular do tipo de classe Cliente.
       
       void saca () { // método para sacar determinada qntdade.
         
           System.out.println("\nDigite um valor para saque:");
           double quantidade= teclado.nextDouble();
           
           if(quantidade > this.saldo)
           {
               System.out.println("Quantidade indisponível para saque.");
           }
           else
           { 
               System.out.println("Saque realizado com sucesso!");
               this.saldo-= quantidade;
               System.out.println("Novo Saldo:"+this.saldo);
           }
       }

       void deposita (){ // método para depositar uma qntdade.
       
       System.out.println("Digite um valor para depósito: ");
       double quantidade =teclado.nextDouble();
       
       this.saldo+= quantidade;
 
       if (this.saldo > this.limite)
       {
           System.out.println("Impossível depositar. Limite estourado.");
           this.saldo-=quantidade;
       }
       else
       {
           System.out.println("Deposito Realizado com Sucesso!");
           System.out.println("Novo Saldo:"+this.saldo);
       }
       }
               
       void transferePara (Conta destino, double quantidade){
           
       this.saldo-= quantidade;
       destino.saldo+=quantidade;
       }
       
       void extrato(){
       
        System.out.println("\n\n        Dados     ");
        System.out.println("Titular : "+this.titular.nome +" " +this.titular.sobrenome);
        System.out.println("CPF: "+this.titular.cpf);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println("Numero da conta: "+this.numero);
       
       }
       
       void cadastro (){
         
        System.out.println("Digite o nome do proprietário da conta: ");
        this.titular.nome = teclado.nextLine();
        
        System.out.println("Digite o sobrenome do proprietário da conta: ");
        this.titular.sobrenome = teclado.nextLine();
        
        System.out.println("Digite o cpf do proprietário da conta: ");
        this.titular.cpf = teclado.nextLine();
              
        System.out.println("Digite um numero para conta: ");
        this.numero = teclado.nextInt();
        
        System.out.println("Digite um saldo inicial para conta: ");
        this.saldo = teclado.nextDouble();
               
        System.out.println("Digite o limite da conta: ");
        this.limite= teclado.nextDouble();
        
        System.out.format("\nA conta de %s foi criada com sucesso!",this.titular.nome);
        
       }
}