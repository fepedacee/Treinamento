
package exercicio1;

import java.util.ArrayList;
import java.util.List;

class Pessoa {
	
	private String nome;
	private String dataNasc;
	private double altura;
	private int idade;
	List<Pessoa> pessoas = new ArrayList<>();
	
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, String dataNasc, double altura,int idade) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
	
		return idade;
		
	}
	public void setIdade(int idade) {
		
		
	}
	public boolean CadastraPessoa(String nome ,String dataNasc,double altura,int idade) {
	
	
	return true  ;
	
	}
	
	public void exibirDados() {
		System.out.println("Dados Pessoais");
		System.out.println("//////////////////////");
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Data de Nascimento: "+this.getDataNasc());
		System.out.println("Altura: "+this.getAltura());
		System.out.println("Idade: "+this.getIdade()); 
	}
	@Override
	public String toString() {
		return "\nNome=" + this.nome 
				+ "\nNascimento=" + this.dataNasc 
				+ "\nAltura=" + this.altura 
				+ "\nIdade=" + this.idade 
				+"\n";
	}
	public static void get(int i) {
		
	}
	
	public Pessoa pesquisaPorNome(String nome) {
		for (Pessoa pessoa : this.pessoas) {
			if(pessoa.getNome() == nome)
				return pessoa;
		}
		return null;

	}
	public void add(Pessoa pessoa) {
		this.pessoas.add(pessoa);
		System.out.println("Cadastrado com sucesso!\n");
		
	}
	
	

}
