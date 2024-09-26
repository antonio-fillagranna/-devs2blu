package ExerciciosPraticaArrays;

public class ExemploArrayTemperatura {
	
	public static void main(String[] args) {
		
		double tempdia1= 31.3;
		double tempdia2= 34.8;
		double tempdia3= 37.9;
		double tempdia4= 24.2;
		double tempdia5= 26.4;
		
		double[] temperaturas = new double[5]; 
		temperaturas[0] = 31.3;
		temperaturas[1] = 34.8;
		temperaturas[2] = 37.9;
		temperaturas[3] = 24.2;
		temperaturas[4] = 26.4;
		
		for(double elemento: temperaturas) { 
			System.out.println(elemento);
		}
		
		
	}

}
