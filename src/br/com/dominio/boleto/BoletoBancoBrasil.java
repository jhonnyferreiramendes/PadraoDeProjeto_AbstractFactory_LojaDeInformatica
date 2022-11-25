package br.com.dominio.boleto;

import br.com.dominio.produto.Produto;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitirBoleto(Produto produto, double imposto) {
		System.out.println("BANCO DO BRASIL");
		System.out.println("========================================================================");
		System.out.println("Descri��o: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: "+ produto.getValorUnitario());
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor Total: " + produto.getValorTotal(imposto));
		
	}

}
