package P2Games;
/**
 * @author Joao Carlos Fernandes Bernardo. 114210795.
 */
import java.util.ArrayList;

public class Veterano extends Usuario{

	
	/**
	 * Construtor da SubClasse Veterano
	 * @param nome
	 * @param login
	 * @param jogos
	 */
	
	
	public Veterano(String nome, String login, ArrayList<Jogo> jogos) {
		super(nome, login, jogos);
		super.setX2P(1000);
	}

	
	/**
	 * Override do metodo abstrato compraJogos da classe Usuario
	 */
	@Override
	public void compraJogos(Jogo novoJogo) {
		if (super.getDinheiroCaixa() >= novoJogo.getPrecoJogo()) {
			super.setX2P(super.getX2P() + (int) (15 * novoJogo.getPrecoJogo()));
			super.setDinheiroCaixa(super.getDinheiroCaixa() - ((novoJogo.getPrecoJogo() * 20) / 100));
		}
	}
}
