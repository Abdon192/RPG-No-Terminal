package rpg;

public class Personagem {

	private String nome;
	private int passos;
	private ClassePersonagem classe;

	public Personagem() {
		// TODO Auto-generated constructor stub
	}

	public Personagem(String nome, int passos, ClassePersonagem classe) {
		super();
		this.nome = nome;
		this.passos = passos;
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPassos() {
		return passos;
	}

	public void setPassos(int passos) {
		this.passos = passos;
	}

	public String golpeComum() {
		return "Golpe comum ";
	}

	public ClassePersonagem getClasse() {
		return classe;
	}

}
