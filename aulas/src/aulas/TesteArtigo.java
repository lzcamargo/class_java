package aulas;
import java.util.Arrays;

public class TesteArtigo {

	public static void main(String[] args) {
		int[] array = {1,2,4,5,6,10};
		Arrays.sort(array);
		float b;
		
		if(array.length % 2 == 1 ) 
			b = array[array.length / 2];
		else
			b = ((float)array[array.length / 2 - 1]) +
			  ((float)array[array.length / 2]) / 2;
		System.out.println(b);
		

	}

}
