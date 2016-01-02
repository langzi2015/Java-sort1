import java.util.Arrays;

public class sort1 {
	public static void main(String[] args) {
		int a[]={42,45,12,34,56,78,89,32,10,58};
		int i,j,k,temp;
		for(i=0;i<a.length;i++){
			k=i;
			for(j=i+1;j<a.length;j++){
				if(a[j]<a[k])
					k=j;
			}
			
			if(i!=k){
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
