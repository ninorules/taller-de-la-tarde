package drcasa;


public class Infecciosa {

		private int cantCelulasAmenazadas;

		public void setCantidadCelulasAmenazadas(int cantCelulasAmenazadas){
			this.cantCelulasAmenazadas = cantCelulasAmenazadas;
		}

		public boolean esAgresiva(Persona unaPersona) {
			
			return unaPersona.getCantCelulasTotales()*0.1 < this.cantCelulasAmenazadas;
		}
}
