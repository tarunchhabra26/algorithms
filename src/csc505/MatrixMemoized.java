package csc505;

public class MatrixMemoized {
	static int m[][], s[][];
	//static int d[] = {1,8,4};
	//static int d[] = {6,9,3,8,5};
	//static int d[] = {5,9,4,2,9,7,1};
	//static int d[] = {6,9,3,2,8,4,6,1,8};
	//static int d[] = {2,7,4,9,1,4,2,6,9,2,6};
	//static int d[] = {5,2,4,7,3,9,7,8,6,3,7,5,5};
	static int d[] = {5,2,4,3,7,9,7,8,6,1,3,7,6,5};
	static int count = 0;
	
	static int Check(int i, int j)
	{
		if (m[i-1][j-1] > Integer.MIN_VALUE)
			return m[i-1][j-1];
		else
			return MatMul(i,j);
	}
	
	static int MatMul(int i,int j)
	{
		count = count + 1;
		if (i >=j )
			return 0;
		else
		{
			int min = Integer.MAX_VALUE;
			int y = 0;
			for (int k = i; k<= j-1 ; k++)
			{	
				int x = Check(i,k) + Check(k+1,j) + d[i-1]*d[k]*d[j];
				if (x < min)
				{
					min = x;
					y = k;
				}
			}
			s[i-1][j-1] = y;
			return min;
		}
		
	}
	
	public static void main(String args[])
	{
		m = new int[d.length - 1][d.length -1 ];
		s = new int[d.length -1][d.length -1];
		for ( int i =1;i <= d.length -1;i++)
			for (int j = 1;j <=d.length -1;j++)
		        m[i-1][j-1] = Integer.MIN_VALUE;
		long t1 = System.nanoTime();
		for ( int i =1;i <= d.length -1;i++)
			for (int j = i;j <=d.length -1;j++)
		        m[i-1][j-1] = MatMul(i,j);
		long t2 = System.nanoTime();
		System.out.println("execution time: " + (t2-t1) + " nanoseconds" );
		System.out.println("--------------------------------------");
		System.out.println("No. of recursive calls: " + count);
		System.out.println("--------------------------------------");
		for ( int i =0;i<=d.length-2;i++)
		{
			for (int j = 0;j<=d.length-2;j++)
				System.out.print(m[i][j] + " ");
			System.out.println("");
		}
		System.out.println("--------------------------------------");
		for ( int i =0;i<=d.length-2;i++)
		{
			for (int j = 0;j<=d.length-2;j++)
				System.out.print(s[i][j] + " ");
			System.out.println("");
		}
	}

}
