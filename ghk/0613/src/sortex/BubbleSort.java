package sortex;

public class BubbleSort {
	
	static void bubbleSort(int [] a){
		int size = a.length;
        for(int i=size-1; i>0; i--) {
            System.out.printf("\n버블 정렬 %d 단계 : ", size-i);
            for(int j=0; j<i; j++) {
                if(a[j] > a[j+1]) {
                    swap(a,j,j+1);
                }
                System.out.printf("\n\t");
                for(int v : a) {
                    System.out.printf("%3d ", v);
                }
            }            
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
