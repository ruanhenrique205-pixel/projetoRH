package Funcionarios;

import java.util.Scanner;



public class RHmain {

	public static void main(String[] args) {
		
	GerenciadorDeFuncionario gerenciador = new GerenciadorDeFuncionario();
	
	
	Scanner sc = new Scanner(System.in);

	boolean rodando = true;
	
	while(rodando) {

		System.out.println("\n====MENU FUNCIONARIO====");
		System.out.println("1- Cadastrar Funcionario");
		System.out.println("2- Buscar Funcionario");
		System.out.println("3- Listar Funcionario");
		System.out.println("4- Remover Funcionario");
		System.out.println("5- Editar Funcionario");
		System.out.println("6- Sair");
		
		int info = sc.nextInt();
		
		switch(info) {
		
		case 1:
			System.out.print("id : ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("nome : ");
			String nome = sc.nextLine();
			
			
			System.out.print("cargo : ");
			String cargo = sc.nextLine();
			
			System.out.print("salario : ");
			double salario = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("admissao : ");
			String admissao = sc.nextLine();
			
			Funcionario infoFuncionario =new Funcionario(id,nome,cargo,salario,admissao);
			
			gerenciador.cadastrarFuncionario(infoFuncionario);
			
			System.out.println("id : " + infoFuncionario.getId() +  "\nnome : " + infoFuncionario.getNome() +  "\ncargo : " +  infoFuncionario.getCargo() + "\nsalario : " + infoFuncionario.getSalario() + "\ndata de admissao : " + infoFuncionario.getDataDeAdmisao());

			break;
		case 2:
			System.out.println("digite seu Id ");
			
			int Id = sc.nextInt();
			
			Funcionario funcionarioEncontrado = gerenciador.buscarFuncionario(Id);
			
			if(funcionarioEncontrado == null) {
				System.out.println("funcionario nao encontrado");
			}
			else {
				System.out.println("nome : " + funcionarioEncontrado.getNome() + "\ncargo : " + funcionarioEncontrado.getCargo() + "\ndata de admsao : " + funcionarioEncontrado.getDataDeAdmisao());
			}
			break;
		case 3:
			 gerenciador.listarFuncionarios();
			
			break;
		case 4:
			System.out.print("digite o ID do funcionario que deseja remover");
			
			int remover = sc.nextInt();
	
			gerenciador.removerFuncionario(remover);
			
			System.out.println("funcionario removido com sucesso");
			
			break;
			
		case 5:
			System.out.println("qual funcionario deseja editar");
			
			System.out.print("novo id : ");
			int idMudar = sc.nextInt();
			sc.nextLine();
			
			System.out.print("novo nome : ");
			String nomeMudar = sc.nextLine();
			
			System.out.print("novo cargo : ");
			String cargoMudar = sc.nextLine();
			
			System.out.print("novo salario : ");
			double salarioMudar = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("nova data de admissao : ");
			String admissaoMudar = sc.nextLine();
			
	
			Funcionario editarFuncionario = new Funcionario(idMudar,nomeMudar,cargoMudar,salarioMudar,admissaoMudar);
		
			gerenciador.editarFuncionario(editarFuncionario);
			
			System.out.println("id :" + editarFuncionario.getId() + "\nnome : " + editarFuncionario.getNome() + "\ncargo : " + editarFuncionario.getCargo() + "\ndata de admsao : " + editarFuncionario.getDataDeAdmisao());
			break;
			
		case 6:
			System.out.println("sair");
			rodando = false;
			
			break;
			
		
	}
	

}
	sc.close();
	
}
	
}
