//Lucas da Silva Santos - CB3030598 - ADS371
//Kaueh Farias Ferreira dos Santos - CB3031438 - ADS371


import java.util.Scanner;

class Hora{
	
//atributos

	private int hora;
	private int min;
	private int seg;
	
//Métodos Construtores

public Hora(){
	
	Scanner scan = new Scanner(System.in);
	
	do{
		
		System.out.pritln("Digite o valor da hora: ");
		public string hor = scan.nextInt();
		
		if(0 <= hor && hor >= 23) {
			
			this.hora = hor;
			
		} else{
			
			System.out.println("Digite um valor de hora valido!");
			
		}
		
	}while (hor < 0 || hor > 23);
		
	
	do{
		
		System.out.pritln("Digite o valor da hora: ");
		public string minu = scan.nextInt();
		
		if(0 <= minu && minu >= 59) {
			
			this.min = m;
			
		} else{
			
			System.out.println("Digite um valor de hora valido!");
			
		}
		
	}while (minu < 0 || minu > 59);
	
	do{
		
		System.out.pritln("Digite o valor da hora: ");
		public string segu = scan.nextInt();
		
		if(0 <= segu && segu >= 59) {
			
			this.seg = segu;
			
		} else{
			
			System.out.println("Digite um valor de hora valido!");
			
		}
		
	}while (segu < 0 || segu > 59);
	
}

public Hora(int hora, int min, int seg){
	
	this.hora = hora;
	this.min = min;
	this.seg = seg;
	
}
	
	public void setHor(int hora){
		
		this.hora = hora;
	
	}
	
	public int getHor(){
	
		return this.hora;
		
	}
	
	
	public void setMin(int min){
	
		this.min = min; 
	
	}
	
	public int getMin(){
		
		return this.min;
		
	}
	
	
	public void setSeg(int seg){
		
		this.seg = seg;
		
	}
	
	public int getSeg(){
		
		return this.seg;
		
	}
	
	
	public void setHor(){
	
	this.
	
	}
	
	public int gerHora1(){
		
		return this.Hor;
		
	}
}

public class TP03LPR1{
	
	public static void main(String[] args){
		
		println("Digite o horário: ");
		Scanner scan = new Scanner(System.in)
		
		
		
		
	}
	
}