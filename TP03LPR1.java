//Lucas da Silva Santos - CB3030598 - ADS371
//Kaueh Farias Ferreira dos Santos - CB3031438 - ADS371

import java.util.Scanner;

class Hora{
	
//atributoss

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
			
			int hor = -1;
			
			do{
			
			System.out.println("Digite o valor da hora: ");
			
			if(scan.hasNextInt()){
				
				hor = scan.nextInt();
			
				if(hor >= 0 && hor <= 23){
					
					this.hora = hor;
					
				} else{
					
					System.out.println("Entrada invalida! A hora deve estar entre 0 e 23.");
					
				}
			
			} else {
				
				System.out.println("Entrada invalida! Digite um numero inteiro.");
				scan.next();
				
			}
			
			}while (hor < 0 || hor > 23);
			
		}

		public void setMin(){
			
			int minu = -1;
			
			do{
			
			System.out.println("Digite o valor dos minutos: ");
			
			if(scan.hasNextInt()){
				
				minu = scan.nextInt();
			
				if(minu >= 0 && minu <= 59){
					
					this.min = minu;
					
				} else{
					
					System.out.println("Entrada invalida! Os minutos devem estar entre 0 e 59.");
					
				}
			
			} else {
				
				System.out.println("Entrada invalida! Digite um numero inteiro.");
				scan.next();
				
			}
			
			}while (minu < 0 || minu > 59);
			
		}

		public void setSeg(){
			
			int segu = -1;
			
			do{
			
			System.out.println("Digite o valor dos segundos: ");
			
			if(scan.hasNextInt()){
				
				segu = scan.nextInt();
			
				if(segu >= 0 && segu <= 59){
					
					this.seg = segu;
					
				} else{
					
					System.out.println("Entrada invalida! Os segundos devem estar entre 0 e 59.");
					
				}
			
			} else {
				
				System.out.println("Entrada invalida! Digite um numero inteiro.");
				scan.next();
				
			}
			
			}while (segu < 0 || segu > 59);
			
		}
		
//metodos com acoes
		
			public String getHora1(){
				
				return getHor() + ":" + getMin() + ":" + getSeg();
				
			}
			
			public String getHora2(){
				
				if(getHor() > 12){
				
				int hora;
				
				hora = getHor() - 12;
				
				return hora + ":" + getMin() + ":" + getSeg() + " PM";
				
				} else if(getHor() == 12){
					
					return 12 + ":" + getMin() + ":" + getSeg() + " PM";
					
				} else{
				
				return getHor() + ":" + getMin() + ":" + getSeg() + " AM";
				
				}
			}
			
			public int getSegundos(){
				
				int segundos;
				
				segundos = ((getHor() * 60) + getMin()) * 60 + getSeg();
				
				return segundos;
				
				
			}
	
}

public class TP03LPR1{
	
	public static void main(String[] args){
		 
	
		Hora primeiraHora;
		primeiraHora = new Hora();
		
		Hora segundaHora;
		segundaHora = new Hora(15, 16, 12);
		
		System.out.println();
		System.out.println("_______________________________________");
		System.out.println("Exibindo informacoes");
		
		System.out.println();
		System.out.println("_______________________________________");
		
		System.out.println("Horario passado por parametro");
		System.out.println();
		
		System.out.println("Hora informada: " + segundaHora.getHora1());
		System.out.println("Horario no formato americano: " + segundaHora.getHora2());
		System.out.println("Total de segundos da hora inforamda: " + segundaHora.getSegundos());
		
		System.out.println("_______________________________________");
		System.out.println();
		
		System.out.println("Horario passado sem parametro");
		System.out.println();
		
		System.out.println("Hora informada: " + primeiraHora.getHora1());
		System.out.println("Horario no formato americano: " + primeiraHora.getHora2());
		System.out.println("Total de segundos da hora inforamda: " + primeiraHora.getSegundos());
		System.out.println("_______________________________________");
		
	}
	
}