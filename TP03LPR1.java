//Lucas da Silva Santos - CB3030598 - ADS371
//Kaueh Farias Ferreira dos Santos - CB3031438 - ADS371

import java.util.Scanner;

class Hora{
	
//atributos

	private int hora;
	private int min;
	private int seg;
	
	Scanner scan = new Scanner(System.in);
	
//Métodos Construtores

//vazio

	public Hora(){
		
		setHor();
		setMin();
		setSeg();
		
	}

//com parametros

	public Hora(int hora, int min, int seg){
		
		setHor(hora);
		setMin(min);
		setSeg(seg);
		
	}
	
//getters e setters com parametro
		
		public void setHor(int hora){
			
			this.hora = hora;
		
		}
		
		public void setMin(int min){
		
			this.min = min; 
		
		}
		
		public void setSeg(int seg){
			
			this.seg = seg;
			
		}
		
		public int getHor(){
		
			return this.hora;
			
		}
		
		public int getMin(){
			
			return this.min;
			
		}
		
		public int getSeg(){
			
			return this.seg;
			
		}
		
//setters sem parametro

		public void setHor(){
			
			int hor;
			
			do{
			
			System.out.println("Digite o valor da hora: ");
			hor = scan.nextInt();
			
			if(!scan.hasNextInt()){
				
				System.out.println("Entrada inválida! O valor deve ser um número");
				
			} else if(0 > hor || hor > 23) {
				
				System.out.println("Entrada inválida! O valor de hora deve estar entre 0 e 23");
				
			} else{
				
				this.hora = hor;
			}
			
			}while (hor < 0 || hor > 23);
			
		}

		public void setMin(){
			
			int minu;
			
			do{
			
			System.out.println("Digite o valor dos minutos: ");
			minu = scan.nextInt();
			
			if(0 <= minu && minu <= 59) {
				
				this.min = minu;
				
			} else{
				
				System.out.println("Digite um valor de minutos valido!");
				
			}
			
			}while (minu < 0 || minu > 59);
			
		}

		public void setSeg(){
			
			int segu;
			
			do{
			
			System.out.println("Digite o valor dos segundos: ");
			segu = scan.nextInt();
			
			if(0 <= segu && segu <= 59) {
				
				this.seg = segu;
				
			} else{
				
				System.out.println("Digite um valor de segundos valido!");
				
			}
			
			}while (segu < 0 || segu > 59);
			
		}
	
}

public class TP03LPR1{
	
	public static void main(String[] args){
		
	
		
		
		
		
	}
	
}