public class Funcionario{
    private String nome;
    private String cpf;
    private Double salario;

public Funcionario(String nome, String cpf, Double salario){
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
}
public void setNomeFun(String nome){
    this.nome = nome;
}
public String getNomeFun(){
    return this.nome;
}
public void setCpfFun(String cpf){
    this.cpf = cpf;
}
public String getCpfFun(){
    return this.cpf;
}
public void setSalarioFun(Double salario){
    this.salario = salario;
}
public Double getSalarioFun(){
    return this.salario;
}
public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Salário: R$ " + salario);
    }

}