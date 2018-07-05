package problem.solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Program to find a pair for given sum
 */
public class SumPair {
public static void main(String[] args) {
	int[] arr = new int []{1,5,6,10,3,7,13} ;
	int n=16;
	SumPair sumPair = new SumPair();
	sumPair.findPair(arr, n);
	sumPair.findPair2(arr, n);
}
//method 1
private void findPair(int [] arr, int sum){
	int l=0;
	int r=arr.length-1;
	Arrays.sort (arr);
	while (l<r){
		if(arr[l]+arr[r]<sum){
			l++;
		}
		else{
			r--;
		}
		if(arr[l]+arr[r]==sum){
			System.out.println("Pair is "+arr[l]+","+arr[r]);
			return;
		}
	}
}

//method 2
private void findPair2(int [] arr, int sum){
	Set<Integer> leftPair = new HashSet<>();
	int temp=0;
	for(int i=0;i<arr.length;i++){
		temp = sum-arr[i];
		if(temp>0 && leftPair.contains(temp))
		{
			System.out.println("2:Pair is "+temp+","+arr[i]);
		}
		leftPair.add(arr[i]);
	}
	
}
}
