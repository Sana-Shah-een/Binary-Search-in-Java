package binarypkg;

public class BinarySearch {

	public static void main(String[] args) {
//		Array must be sorted in Binary Search
		int[] arr= {-11,-8,-5,-2,0,1,2,3,4,10,99,888};
		int target= 10;
		int ans=binarysearch(arr,target);
		System.out.println(ans);

	}
	
//	Return the index
//	Return -1 if it does not exist
	
	static int binarysearch(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
//			int mid=(start+end)/2; //might be some cases(start+end) exceeds the range of int in Java
			
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
			
		}
		return -1;
		
	}
	

}
