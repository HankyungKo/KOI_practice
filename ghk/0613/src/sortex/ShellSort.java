package sortex;

public class ShellSort {
	
	static void shellSort(int[] a){
		for( int gap = a.length / 2; gap > 0;
                gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) )
       for( int i = gap; i < a.length; i++ )
       {
 //          Comparable tmp = a[ i ];
           int j = i;

 //          for( ; j >= gap && tmp.compareTo( a[ j - gap ] ) < 0; j -= gap )
               a[ j ] = a[ j - gap ];
 //          a[ j ] = tmp;
       }
	}
	
	static void insertionSort(int[] arr)
	{

	   for(int index = 1 ; index < arr.length ; index++){
	      
	      int temp = arr[index];
	      int aux = index - 1;

	      while( (aux >= 0) && ( arr[aux] > temp) ) {

	         arr[aux+1] = arr[aux];
	         aux--;
	      }
	      arr[aux + 1] = temp;
	   }
	}
	
	static void swap(int[]a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		int [] ar = new int[10];
		int input;
		for ( int i = 0; i < ar.length; i++){
		   input = (int)(Math.random()*45)+1;
		   for( int j = 0; j <= i; j++){
			   if(input == ar[j])
				   break;
			   else if(i == j)
				   ar[i] = input;
		   }
		}
		for(int i = 0; i < ar.length; i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	//	bubbleSort(ar);
	}

}
