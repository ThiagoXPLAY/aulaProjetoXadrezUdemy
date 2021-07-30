
package xadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        iniciarPartida();
    }
    
    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i < tabuleiro.getLinhas(); i++){
            for(int j = 0; j < tabuleiro.getColunas(); j++){
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    
    private void iniciarPartida(){
        tabuleiro.ColocarPeca(new Torre(Cor.BRANCO, tabuleiro), new Posicao(2, 1));
        tabuleiro.ColocarPeca(new Rei(Cor.PRETO, tabuleiro), new Posicao(0, 3));
        tabuleiro.ColocarPeca(new Rei(Cor.BRANCO, tabuleiro), new Posicao(7, 4));
    }
}
