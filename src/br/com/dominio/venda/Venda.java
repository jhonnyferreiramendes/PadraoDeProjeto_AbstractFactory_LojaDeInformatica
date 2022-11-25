package br.com.dominio.venda;

import br.com.dominio.boleto.Boleto;
import br.com.dominio.nfe.NFE;
import br.com.dominio.produto.Produto;

public class Venda {

	private NFE notaFiscal;
	private Boleto boleto;

	public Venda(VendaFactory factory) {
		this.notaFiscal = factory.criarNFE();

		this.boleto = factory.criarBoleto();

	}
	
	public void realizarVenda(Produto produto) {
		
		double imposto = notaFiscal.caucularImposto(produto);
		
		boleto.emitirBoleto(produto, imposto);
	}
}
