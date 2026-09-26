package Funcionarios;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeFuncionario {


 private HashMap<Integer , Funcionario> gerenciar = new HashMap<>();

 
 
 public HashMap<Integer, Funcionario> getGerenciar() {
	return gerenciar;
}



 public void setGerenciar(HashMap<Integer, Funcionario> gerenciar) {
	this.gerenciar = gerenciar;
 }



 public GerenciadorDeFuncionario() {
	
 }

	public void cadastrarFuncionario(Funcionario funcionario) {
		gerenciar.put(funcionario.getId() ,funcionario);
		
	}
	public Funcionario buscarFuncionario(int id) {
		return gerenciar.get(id);
	}


	public void listarFuncionarios() {
		for(Map.Entry<Integer, Funcionario> buscar : gerenciar.entrySet()) {
	
		Integer id = buscar.getKey();
		Funcionario dados = buscar.getValue();
	
		System.out.println("informacoes do funcionario : " +  "\nnome :" + dados.getNome() +
				"\ncargo : " + dados.getCargo()+ 
				"\ndata de admissao : " + dados.getDataDeAdmisao() + 
				"salario : " + dados.getSalario());
		System.out.println(id + " id do Funcionario ");
	}
}
	
	public void removerFuncionario(int id) {
		gerenciar.remove(id);
	}
	
}


