package modulo;

public class Schleifenapp {

	public static void main(String[] args) {
		
		// A
		Integer a = 1;
		while( a <= 9){
			System.out.print(a+" ");
			a+=2;
		}
		
		System.out.println("");
		
		
		// B
		
		Integer b = 1;
		do{
			System.out.print(b+" ");
			b+=2;
		} while( b<=9);
		
		System.out.println("");
		
		// C
		
		for( Integer c = 1; c<10; c++){
			if( c%2 == 0 ){
				continue;
			}
			System.out.print(c%24+" ");
		}
		
		System.out.println("");
		
		// D
		
		for( Integer d = 1; d<=9; d+=2){
			System.out.print(d+" ");
		}
		
		System.out.println("");

		// Letzte
		// A
		
		b = 1;
		Integer c = 1;
		do{
			System.out.print(b+" ");
			b+=c;
			c++;
		} while( b<=37);
		
		
		System.out.println("");

		// B
		
		c = 0;
		for( Integer d = 1; d<=37; d+=c){
			System.out.print(d+" ");
			c++;
		}
		
	}

}
