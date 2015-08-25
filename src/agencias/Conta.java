package agencias;

public class Conta {

       int numero;
       String nome;
       double saldo;
       double limite;
       
       void saca (double quantidade) { // método para sacar determinada qntdade.
                     
           if(quantidade > this.saldo)
           {
               System.out.println("Quantidade indisponível para saque.");
           }
           else this.saldo-= quantidade;

       }

       void deposita (double quantidade){ // método para depositar uma qntdade.
       this.saldo+= quantidade;
       if (this.saldo > this.limite)
       {
           System.out.println("Impossível depositar. Limite estourado.");
           this.saldo-=quantidade;
       }

      
       
      
       }
               
}


