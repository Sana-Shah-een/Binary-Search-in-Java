package binarypkg;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		int[] arr= {-11,-8,-5,-2,0,1,2,3,4,10,99,888};//ASCENDING
		int[] arr2= {99,88,77,66,55,44,33,22,11,10,5,-11,-18,-111};//DESCENDING

		int target= 10;
		int ans=orderAgnosticBS(arr,target);
		System.out.println(ans);
		
		int target1= -111;
		int ans1=orderAgnosticBS(arr2,target1);
		System.out.println(ans1);
	}
	
	static int orderAgnosticBS(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
//		find whether the array is sorted in ascending or descending
		boolean isAsc;   //boolean isAsc=arr[start]<arr[end] ->>same thing
		if(arr[start]<arr[end]) {
			isAsc=true;
		}else {
			isAsc=false;
		}
		while(start<=end) {
//			int mid=(start+end)/2; //might be some cases(start+end) exceeds the range of int in Java
			
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			if(isAsc) {
				if(target<arr[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}else {
				if(target>arr[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}		
		}
		return -1;	
	}
}
