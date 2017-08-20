package test;

public class JavaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("반갑습니다. java 입니다.");
		
//		int i = 0;
//		// break 라벨기능(label)
//		OUT : while(true)
//		{
//			while(true)
//			{
//				i++;
//				if(i == 3)
//				{
//					System.out.println("end.");
//					break OUT;
//				}else {
//					System.out.println("반갑습니다. java 입니다.");
//				}
//			}
//		}
		
		int[][] nArray;
		nArray = new int[3][];
		nArray[0] = new int[2];
		nArray[1] = new int[3];
		nArray[2] = new int[5];
		
		
		int[][] nArray1 = { {1, 2}, {3, 4} };
		int[][] nArray2 = { {1, 2}, {3, 4, 5, 6} };
		
		for(int i = 0; i < nArray1.length; i++)
		{
			for(int j = 0; j < nArray1[i].length; j++)
			{
				System.out.printf("%1$d ", nArray1[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < nArray2.length; i++)
		{
			for(int j = 0; j < nArray2[i].length; j++)
			{
				System.out.printf("%1$d ", nArray2[i][j]);
			}
			System.out.println();
		}
	}

}
