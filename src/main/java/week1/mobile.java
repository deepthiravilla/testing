package week1;


	public class mobile {
		public static void main(String[] args) {
			mobile be=new mobile();
			
			be.mobileNumber(97);
			be.displayName("deepthi");
		}
       String displayName(String name){
			
			System.out.println("My name is: " +name);
			return name;
		}
		
		public void mobileNumber(int mobNum)
		 {
			switch(mobNum)
			 {
			 case 96: 
				 System.out.println("Deepthi number is: " +mobNum );
				 break;
			 case 97:
				 System.out.println("Rajesh number is:" +mobNum);
				 break;
				 default :
					 System.out.println("Keerthi number is: " +mobNum);
			 }
		 }
		 
//			 if(mobNum==96)
//			 {
//			System.out.println("my mobile number is: "+mobNum);
//			 }
//			 else if(mobNum == 97)
//					 {
//						 System.out.println("Rajesh number is :"+mobNum);
//					 }
//			 else
//			 {
//				 System.out.println("keerthi number is: 99");
//			 }
		}
	
		
	
		
	
	