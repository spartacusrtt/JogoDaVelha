import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class JogoTeste {

	@Test
	public void test() {
		//passo:criar jogo
		Jogo jogo=new Jogo();
		//Assertiva:verifiar que o jogo n�o acabou
	    Assert.assertFalse("O jogo iniciou acabado",jogo.acabou());
		
	}

}
