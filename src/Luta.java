import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;

	// Metodos Publicos

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovado = true;
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.aprovado = false;
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}

	public void lutar() {
		if (this.isAprovado() == true) {
			System.out.println("---DESAFIADO---");
			this.desafiado.apresentar();
			System.out.println("---DESAFIANTE---");
			this.desafiante.apresentar();

			Random dado = new Random();
			int vencedor = dado.nextInt(3);

			switch (vencedor) {
			case 0://Empate 
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1://Vitoria L1
				System.out.println(this.desafiado.getNome() + " ganhou!!!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2://Vitoria L2
				System.out.println(this.desafiante.getNome() + " ganhou!!!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}//Fim do switch case
		} else {
			System.out.println("A luta não pode acontecer!");
		}

	}

	// Metodos Especiais(Acessores)

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
