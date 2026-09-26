package Funcionarios;

public class Funcionario {
private int id;
private String nome;
private String cargo;
private double salario;
private String dataDeAdmisao;


public Funcionario(int id, String nome, String cargo, double salario, String dataDeAdmisao) {
	
	this.id = id;
	this.nome = nome;
	this.cargo = cargo;
	this.salario = salario;
	this.dataDeAdmisao = dataDeAdmisao;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCargo() {
	return cargo;
}


public void setCargo(String cargo) {
	this.cargo = cargo;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


public String getDataDeAdmisao() {
	return dataDeAdmisao;
}


public void setDataDeAdmisao(String dataDeAdmisao) {
	this.dataDeAdmisao = dataDeAdmisao;
}



}
