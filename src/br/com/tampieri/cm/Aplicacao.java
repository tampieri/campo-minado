package br.com.tampieri.cm;

import br.com.tampieri.cm.modelo.Tabuleiro;
import br.com.tampieri.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}

}
