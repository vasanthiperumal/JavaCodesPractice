package OtherPrograms;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,3,9,2,8};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						
				}
			}
		}
		for(int j=0;j<a.length;j++) {
		System.out.println(a[j]);
		}
	}
}
