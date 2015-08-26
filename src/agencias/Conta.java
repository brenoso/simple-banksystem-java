package agencias;

public class Conta {

       int numero;
       double saldo;
       double limite;
       Cliente titular; // declaração de titular do tipo de classe Cliente.
       
       void saca (double quantidade) { // método para sacar determinada qntdade.
                     
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

       void deposita (double quantidade){ // método para depositar uma qntdade.
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
}


