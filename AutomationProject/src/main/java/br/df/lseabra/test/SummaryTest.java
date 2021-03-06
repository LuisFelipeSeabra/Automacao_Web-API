package br.df.lseabra.test;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SummaryTest extends BaseTest {
	
	Steps steps = new Steps();

	@Test
	public void verificarQuantidadeTotalDeProdutosAdicionadosAoCarrinho() throws InterruptedException {
		//Verificar quantos tipos de produtos foram adicionados
		Integer x = 4;
		Assert.assertEquals(x,steps.obterQuantosProdutosForamAdicionadosAoCarrinho());
				
		//Verificar quantidade de produtos que foram adicionados
		Integer y = 5;
		Assert.assertEquals(y,steps.obterQuantidadeDeProdutosQueForamAdicionadosAoCarrinho());
			
		steps.clicarEmProsseguirTelaSummary();
	}

}
