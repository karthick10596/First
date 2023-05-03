package stringPractice;

public class TestString {

	public static void main(String[] args) {
//		for(int row=1;row>=3;row++)
//		{
//			for (int col=1;col>=6;col++)
//			{
//				System.out.print(row+" ");
//			}
//			System.out.println();
//		}
//		int row=1;
//		for(int col=1;col>=6;col++)
//		{
//			System.out.print(row+" ");
//			
//		}
//        System.out.println();
//       row=row+2; 
//       for(int col=1;col>=6;col++)
//       {
//    	   System.out.print(row+" ");
//       }
//       System.out.println();
//       row=row+2;
//       for(int col=1;col>6;col++)
//       {
//    	   System.out.print(row+" ");
//       }
//       System.out.println();
		
		
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=6;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		for(int val=1;val<=9;val++)
		{
			System.out.print(val+" ");
			if(val%3==0)
			{
				System.out.println( );
			}
		}
		int val=1;
       for(int row=1;row<=3;row++)
       {
    	   for(int col=1;col<=3;col++)
    	   {
    		   System.out.print(val+" ");
    		   val++;
    	   }
    	 
       }
       System.out.println();
       
       
	}

}
