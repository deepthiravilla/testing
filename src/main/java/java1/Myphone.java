package java1;

	public class Myphone
//change
	{

		public int mobNum=96;
		public  String displayName (String name )
		{
			System.out.println("My name is: " +name);
			return name;
		}
		
		public void mobileNumber(int mobNum)
		 {
			 switch(mobNum)
			 {
			 case 96: 
				 System.out.println("kumaran number is: " +mobNum );
				 break;
			 case 97:
				 System.out.println("Mythili number is:" +mobNum);
				 break;
				 default :
					 System.out.println("suganya number is: " +mobNum);
			 }
			 
//			 if(mobNum==96)
//			 {
//			System.out.println("my mobile number is: "+mobNum);
//			 }
//			 else if(mobNum == 97)
//					 {
//						 System.out.println("Mythili number is :"+mobNum);
//					 }
//			 else
//			 {
//				 System.out.println("Suganya number is: 99");
//			 }
		}
		
		
	}
	