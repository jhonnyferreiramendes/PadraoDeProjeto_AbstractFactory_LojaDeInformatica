import java.math.BigDecimal;

import br.com.dominio.produto.Produto;
import br.com.dominio.venda.Venda;
import br.com.dominio.venda.VendaFactory;
import br.com.dominnio.loja.LojaCentroDaInformatica;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("SmartPhone MOTO x 2° geração");
		produto.setQuantidade(1);
		produto.setValorUnitario(new BigDecimal(1000));
		
		
		VendaFactory factory = new LojaCentroDaInformatica();
		
		Venda venda = new Venda(factory);
		
		venda.realizarVenda(produto);
		
		
	}

}
