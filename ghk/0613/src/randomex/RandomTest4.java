package randomex;

import java.util.Random;

public class RandomTest4 {
 
 static void swap(int[]ar, int i, int j){
	 int temp = ar[i];
     ar[i] = ar[j];
     ar[j] = temp;
 }
 
 static void printArray(int[]ar){
	 for(int i = 0; i < ar.length; i++){
	 	System.out.print(ar[i] + " ");
	 }
 }

	
 static void makeUnique(int [] ar){
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
 }
 
 static void ascend(int arLotto[]){
  for(int i = 0; i < arLotto.length-1;i++){
   for ( int j = 0; j < arLotto.length-i-1;j++){
    if(arLotto[j] > arLotto[j+1]){
    	swap(arLotto, j, j+1);
    }
   }
  }
  printArray(arLotto);
 }
 
 static void descend(int arLotto[]){
  for(int i = 0; i < arLotto.length-1;i++){
   for ( int j = 0; j < arLotto.length-i-1;j++){
    if(arLotto[j] < arLotto[j+1]){
    	swap(arLotto, j, j+1);
    }
   }
  }
  printArray(arLotto);
 }
 
 static void shuffle(int arLotto[]){
	 Random random = new Random();
	 random.nextInt();
	 for (int i = 0; i < arLotto.length; i++) {
		 int change = i + random.nextInt(arLotto.length - i);
		 swap(arLotto, i, change);
	 }
	 printArray(arLotto);
 }
 
 public static void main(String[] args) {
  int arLotto[] = new int[6];
  
  makeUnique(arLotto); // 중복 배제 정수 배열 생성.
  
  ascend(arLotto);  // 오름차순 출력해라.
  System.out.println();
  
  descend(arLotto);  // 내림차순 출력해라.
  System.out.println();
  
  shuffle(arLotto);	// 무작위로 섞어서 출력해보자.
 }

}
