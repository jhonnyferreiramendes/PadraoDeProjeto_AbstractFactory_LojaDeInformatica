package br.com.dominio.boleto;

import br.com.dominio.produto.Produto;

public interface Boleto {

	public void emitirBoleto(Produto produto, double imposto);
}
