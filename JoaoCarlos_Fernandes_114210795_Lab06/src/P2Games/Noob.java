package P2Games;

import java.util.ArrayList;

public class Noob extends Usuario{

	public Noob(String nome, String login, ArrayList<Jogo> jogos) {
		super(nome, login, jogos);
	}

	@Override
	public void CompraJogos(Jogo novoJogo) {
		
		
		
		if (super.getDinheiroCaixa() >= novoJogo.getPrecoJogo()) {
			
			}
		}
	
}