package guvi;
import java.util.Scanner;
public class Logiccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
Scanner s=new Scanner(System.in);
int a[]=new int[4];
int b[]=new int[4];
for(int i=0;i<4;i++){
	a[i]=s.nextInt();
}
for(int j=0;j<4;j++){
	b[j]=s.nextInt();
}
for(int k=0;k<4;k++){
	for(int l=0;l<4;l++){
		if(a[k]==b[l]){
			count++;
		}
	}
}
System.out.println(count+count);
	}

}
