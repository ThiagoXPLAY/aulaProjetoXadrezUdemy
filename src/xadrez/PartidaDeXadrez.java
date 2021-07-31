
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
    
    private void ColocarNovaPeca(char coluna, int linha, PecaXadrez peca){
        tabuleiro.ColocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
    }
    
    private void iniciarPartida(){
        ColocarNovaPeca('b', 6, new Torre(Cor.BRANCO, tabuleiro));
        ColocarNovaPeca('e', 8, new Rei(Cor.PRETO, tabuleiro));
        ColocarNovaPeca('e', 1, new Rei(Cor.BRANCO, tabuleiro));
    }
}
