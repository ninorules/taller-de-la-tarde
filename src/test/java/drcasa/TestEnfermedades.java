package drcasa;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEnfermedades {
    
	
	private Persona frank;
	private Infecciosa malaria;

	@Before 
    public void inicializar(){
    	
		malaria = new Infecciosa();
		frank = new Persona();
		frank.setCantidadCelulasTotales(1000);
    }

	@Test
	public void unaEnfermedadInfecciosaEsAgresiva(){
		//precondiciones-escenario-contexto-fixture
		
		malaria.setCantidadCelulasAmenazadas(200);
		//ejecución - se hace algo
		boolean esAgresiva = malaria.esAgresiva(frank);
		//postcondiciones - hace algo
		Assert.assertTrue(esAgresiva);
		
	}
}
