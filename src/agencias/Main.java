package agencias;
import java.util.Scanner; // importação da biblioteca de leitura de dados do teclado

public class Main {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);// declaração de objeto para entrada de dados.
    
    
    Conta conta1 = new Conta();
    conta1.cadastro();
    conta1.extrato();
    conta1.saca();
    conta1.deposita();
    conta1.extrato();
    
   Funcionario f1 = new Funcionario();
   f1.cadastroFuncionario();
   f1.mostraFuncionario();
   
   

    }
    




} 
