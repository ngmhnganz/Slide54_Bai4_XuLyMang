package nguyenminhngan.com;

import java.util.Scanner;

public class Main {
	static void nhapMang(int []M) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập các giá trị của mảng: ");
		for (int i=0;i<M.length;i++) 
		{
			M[i]=sc.nextInt();
		}
	}
	static void soLe(int []M) 
	{
		int []Luu; Luu=new int [1000];
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			if (M[i] % 2 !=0) 
			{
				dem++;
				Luu[M[i]]++;
			}
		}
		int thedem=dem;
		for (int i = 0; i < M.length; i++) 
		{
			if ((M[i] % 2 !=0) && (Luu[M[i]]!=0))
			{
				dem=dem-Luu[M[i]];
				if (dem!=0) 
				{
				if (Luu[M[i]]==1) System.out.print(M[i]+", ");
				else System.out.print(M[i]+"("+Luu[M[i]]+"), ");
				Luu[M[i]]=0;
				}
				else 
				{
					if (Luu[M[i]]==1) System.out.print(M[i]+". ");
					else System.out.print(M[i]+"("+Luu[M[i]]+"). ");
					Luu[M[i]]=0;
				}
			}
		}
		System.out.println();
		System.out.println("Có tổng cộng "+ thedem +" số lẻ.");
	}
	static void soChan(int []M) 
	{
		int []Luu; Luu=new int [1000];
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			if (M[i] % 2 ==0) 
			{
				dem++;
				Luu[M[i]]++;
			}
		}
		int thedem=dem;
		for (int i = 0; i < M.length; i++) 
		{
			if ((M[i] % 2 ==0) && (Luu[M[i]]!=0))
			{
				dem=dem-Luu[M[i]];
				if (dem!=0) 
				{
				if (Luu[M[i]]==1) System.out.print(M[i]+", ");
				else System.out.print(M[i]+"("+Luu[M[i]]+"), ");
				Luu[M[i]]=0;
				}
				else 
				{
					if (Luu[M[i]]==1) System.out.print(M[i]+". ");
					else System.out.print(M[i]+"("+Luu[M[i]]+"). ");
					Luu[M[i]]=0;
				}
			}
		}
		System.out.println();
		System.out.println("Có tổng cộng "+ thedem +" số chẵn.");
	}
	static void soNguyenTo(int []M) 
	{
		int []Luu; Luu=new int [1000];
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			if (kiemtraSoNguyenTo(M[i])) 
			{
				dem++;
				Luu[M[i]]++;
			}
		}
		int thedem=dem;
		for (int i = 0; i < M.length; i++) 
		{
			if (kiemtraSoNguyenTo(M[i]) && (Luu[M[i]]!=0))
			{
				dem=dem-Luu[M[i]];
				if (dem!=0) 
				{
				if (Luu[M[i]]==1) System.out.print(M[i]+", ");
				else System.out.print(M[i]+"("+Luu[M[i]]+"), ");
				Luu[M[i]]=0;
				}
				else 
				{
					if (Luu[M[i]]==1) System.out.print(M[i]+". ");
					else System.out.print(M[i]+"("+Luu[M[i]]+"). ");
					Luu[M[i]]=0;
				}
			}
		}
		System.out.println();
		System.out.println("Có tổng cộng "+ thedem +" số nguyên tố.");
	}
	static void soKhongNguyenTo (int []M) {
		int []Luu; Luu=new int [1000];
		int dem=0;
		for (int i=0; i<M.length;i++) 
		{
			if (!kiemtraSoNguyenTo(M[i])) 
			{
				dem++;
				Luu[M[i]]++;
			}
		}
		int thedem=dem;
		for (int i = 0; i < M.length; i++) 
		{
			if (!kiemtraSoNguyenTo(M[i]) && (Luu[M[i]]!=0))
			{
				dem=dem-Luu[M[i]];
				if (dem!=0) 
				{
				if (Luu[M[i]]==1) System.out.print(M[i]+", ");
				else System.out.print(M[i]+"("+Luu[M[i]]+"), ");
				Luu[M[i]]=0;
				}
				else 
				{
					if (Luu[M[i]]==1) System.out.print(M[i]+". ");
					else System.out.print(M[i]+"("+Luu[M[i]]+"). ");
					Luu[M[i]]=0;
				}
			}
		}
		System.out.println();
		System.out.println("Có tổng cộng "+ thedem +" số nguyên tố.");
	}
	static boolean kiemtraSoNguyenTo (int a) 
	{
		int dem=0;
		for (int i=1; i<a;i++) {
			if (a%i==0) dem++;
		}
		if (dem==1)
		return true;
		else return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n=sc.nextInt();
		int []M;
		M= new int[n];
		nhapMang(M);
		System.out.println("----------------------------------------");
		System.out.print("Các số lẻ có trong mảng là: "); soLe(M);
		System.out.println("----------------------------------------");
		System.out.print("Các số chẵn có trong mảng là: "); soChan(M);
		System.out.println("----------------------------------------");
		System.out.print("Các số chẵn có trong mảng là: "); soNguyenTo(M);
		System.out.println("----------------------------------------");
		System.out.print("Các số chẵn có trong mảng là: "); soKhongNguyenTo(M);
		System.out.println("----------------------------------------");
	}

}
