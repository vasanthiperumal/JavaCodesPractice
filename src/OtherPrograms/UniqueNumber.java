package OtherPrograms;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 5, 4, 3, 2, 2, 3, 5, 5, 4, 2 };
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
				k++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						k++;
					}

				}
				System.out.println("number: "+arr[i]+" count: "+k);
				
				if(k==1) 
					System.out.println(arr[i]+" is unique number");
				
			}

		}
	}}


