package projeto;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MultiplicacaoTeste {
	
	@Test
	public void TesteComJunit() {
		Multiplicacao multi = new Multiplicacao();
		int multi = multi.Resultado(1, 5);
	
		Assert.assertEquals(5, multi);
	}

}
