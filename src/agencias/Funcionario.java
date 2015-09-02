package agencias;
import java.util.Scanner; // importação da biblioteca de leitura de dados do teclado


public class Funcionario {

Scanner teclado = new Scanner(System.in); // declaração de objeto para entrada de dados.

String nome;
String departamento;
String rg;
double salario;
String dataAdmissao = "01/01/2001"; // inicialização com valor default

void recebeAumento (double aumento){
this.salario+=aumento;
}

void calculaGanhoAnual(double salario){
    System.out.println("O ganho anual do funcionário "+this.nome +" é: " +this.salario*12);
}

void cadastroFuncionario (){
    
    System.out.println("Digite o nome do funcionário:");
    this.nome = teclado.nextLine();
    System.out.println("Digite o departamento do funcionario: ");
    this.departamento = teclado.nextLine();
    System.out.println("Digite o RG do funcionário: ");
    this.rg = teclado.nextLine();
    System.out.println("Digite a data de Admissão do funcionario: ");
    this.dataAdmissao = teclado.nextLine();
    System.out.println("Digite o salário do funcionário: ");
    this.salario = teclado.nextDouble();

     

}

void mostraFuncionario () {
    System.out.println("    Dados cadastrais do funcionáio    ");
    System.out.println("Nome: "+this.nome);
    System.out.println("Departamento: " +this.departamento);
    System.out.println("RG: " +this.rg);
    System.out.println("Salario: " +this.salario);
    System.out.println("Admissao: " +this.dataAdmissao);

}



    
    
    
    
    
    
    
    
    
}
