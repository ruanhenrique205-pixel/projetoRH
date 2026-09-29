package Funcionarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorDeFuncionario {

	private HashMap<Integer, Funcionario> gerenciar = new HashMap<>();

	public HashMap<Integer, Funcionario> getGerenciar() {
		return gerenciar;
	}

	public void setGerenciar(HashMap<Integer, Funcionario> gerenciar) {
		this.gerenciar = gerenciar;
	}

	public GerenciadorDeFuncionario() {

	}

	public void cadastrarFuncionario(Funcionario funcionario) {
		gerenciar.put(funcionario.getId(), funcionario);

	}

	public Funcionario buscarFuncionario(int id) {
		return gerenciar.get(id);
	}

	public void listarFuncionarios() {
		for (Map.Entry<Integer, Funcionario> buscar : gerenciar.entrySet()) {

			// Integer id = buscar.getKey();
			Funcionario dados = buscar.getValue();

			System.out.println("informacoes do funcionario : " + "\nId : " + dados.getId() + "\nnome : "
					+ dados.getNome() + "\ncargo : " + dados.getCargo() + "\ndata de admissao : "
					+ dados.getDataDeAdmisao() + "\nsalario : " + dados.getSalario());
			System.out.println();

		}
	}

	public void removerFuncionario(int id) {

		gerenciar.remove(id);
	}

	public void editarFuncionario(Funcionario funcionarioAtualizado) {

		gerenciar.put(funcionarioAtualizado.getId(), funcionarioAtualizado);
	}

	public void salvarFuncionario() {

		try {
			FileWriter salvar = new FileWriter("funcionarios.txt");

			for (Map.Entry<Integer, Funcionario> salva : gerenciar.entrySet()) {

				Integer valores = salva.getKey();

				Funcionario info = salva.getValue();

				salvar.write(valores + ";" + info.getNome() + ";" + info.getCargo() + ";" + info.getSalario() + ";"
						+ info.getDataDeAdmisao() + "\n");

			}

			salvar.close();

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}

	public void carregarFuncionario() {
		
try {
	File mostrar = new File("funcionarios.txt");

        Scanner sc = new Scanner (mostrar);
        
        

        while(sc.hasNextLine()) {

            String texto = sc.nextLine();
            String [] converter = texto.split(";");
            

            Integer id = Integer.parseInt(converter[0]);
            
            Double salario = Double.parseDouble(converter[3]);
            
            
            Funcionario funcionarioCarregado = new Funcionario(id , converter[1] , converter[2] ,salario , converter[4]);
            
      
            cadastrarFuncionario(funcionarioCarregado);
        }
        sc.close();
        
    }catch (FileNotFoundException e) {

    	System.out.println(e.getMessage());
    }

}

}

