
public class Aplicacao {

	public static void main(String[] args) {
		//exemploWhile();
		//exemploDoWhile();
		exemploFor();
	}
	
	public static void exemploFor() {
		
		int i,j;
		for(i=0, j=10; i<10; i++, j--) {
			System.out.println(i + " - " + j);
		}
		
		for(;;) {
			if(i==9) {
				break;
			}
		}
		
	}
	
	public static void exemploDoWhile() {
		int x = 0;
		do {
			System.out.println(x);
			x++;
			
		} while(x <= 10);
	}
	
	public static void exemploWhile() {
		int x = 0;
		
		while(true) {
			x++;
			
			if(x==5) {
				continue; // for�a a execu��o voltar para a condi��o do bloco.
			}
			
			if(x==10) {
				break;
			}
			
			System.out.println(x);
		}
	}
	
}
