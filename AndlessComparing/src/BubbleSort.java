import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		System.out.println("Karşılaştırılacak sayı sayısını girin.");
		int x= girdi.nextInt();
		int[] arr = new int[x];
		
		try{
		for(int y = 0; y <x; ++y) {
			System.out.println("Sayi " + y + " girin");
			arr[y] = girdi.nextInt();
			}
		}
catch(Exception e){
	System.out.println("HATA ARRAY KAPASITE BELIRLEME KISMINDA");
}
		try{	   
		int b= 0;
		int c =0;
		int e= 0;
		int k = (x-1);		
		
		for (int h = 0; h<k; ++h) {
		for(int z = 0; z<k ; ++z) {
			b= z+1;
			if(arr[z] > arr[b]) {
				c = arr[z];
				e = arr[b];
				arr[b] = c;
				arr[z] = e;
				
		}	
		}
		}
		}
			catch(Exception e) {
				System.out.println("HATA SIRLAMA YAPMASINI UMDUGUNUZ YERDE");
			}
		int l = 1 ;
		System.out.println("Küçükten Büyüğe Sırlama");
		for (int t: arr) {
			System.out.print(l +". ");
			System.out.println(t);
			l++;
		}
		//Everything for Cemal
}
		


}
