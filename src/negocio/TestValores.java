/**
 * 
 */
package negocio;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Isael e Marcos
 *
 */
public class TestValores {
	
Valores valores;
	
	@Test
	public void inserirValor() {
		valores = new Valores();
		Assert.assertEquals(true, valores.ins(2));
	}
	
	@Test
	public void deletarValor() {
		valores = new Valores();
		Assert.assertEquals(-1, valores.del(1));
	}
	
	@Test
	public void valoresValor() {
		valores = new Valores();
		valores.ins(3);
		valores.ins(4);
		Assert.assertEquals(1, valores.size());
	}
	
	@Test
	public void mediaValores() {
		valores = new Valores();
		valores.ins(3);
		valores.ins(4);
		valores.ins(3);
		valores.ins(4);
		valores.ins(3);
		valores.ins(4);
		Assert.assertEquals(3.5, valores.mean(), 0.1);
	}
	
	@Test
	public void maiorValor() {
		valores = new Valores();
		valores.ins(3);
		valores.ins(4);
		valores.ins(5);
		valores.ins(6);
		valores.ins(7);
		valores.ins(8);
		Assert.assertEquals(8, valores.greater());
	}
	
	@Test
	public void menorValor() {
		valores = new Valores();
		valores.ins(3);
		valores.ins(4);
		valores.ins(5);
		valores.ins(6);
		valores.ins(7);
		valores.ins(8);
		Assert.assertEquals(3, valores.lower());
	}

}
