import java.util.*;
class Salarycal{
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			
			do{
			
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|                          SALARY INFORMATION SYSTEM                                |");
		    System.out.println("-------------------------------------------------------------------------------------\n");
		    
			
				System.out.println("\t [1] Calculate Income Tax");
				System.out.println("\t [2] Calculate Annual Bonus");
				System.out.println("\t [3] Calculate Loan amount");
				System.out.println("\t [4] Exit");
				System.out.println();
				
				System.out.print("Enter an option to contiune >");
				int option = input.nextInt();
				double tax;
				double bonus;
				
				switch(option){
					
					case 1:
						System.out.println("-------------------------------------------------------------------------------------");
			            System.out.println("|                             Calculate Income Tax                                  |");
		                System.out.println("-------------------------------------------------------------------------------------\n");
		                
		                System.out.print("Input Employee name        - ");
		                String Itname = input.next();
		                System.out.print("Input Employee salary      - ");
		                double Itsalary = input.nextDouble();
		                
		                
		                if(Itsalary< 100000){
							tax =0; 
		                }else if(Itsalary> 100000 & Itsalary < 141667){
							tax = Itsalary*0.06;					    
					    }else if(Itsalary >= 141667 & Itsalary < 183333){
							tax = Itsalary*0.12;	                
		                }else if(Itsalary >= 183333 & Itsalary < 225000){
							tax = Itsalary*0.18;							
						}else if(Itsalary >= 225000 & Itsalary < 266667){
							tax = Itsalary*0.24;							
						}else if(Itsalary >= 266667 & Itsalary < 308333){
							tax = Itsalary*0.30;							
						}else{
							tax = Itsalary*0.36;
						}
						
						System.out.println();
						System.out.println("You have to pay Income Tax per month :"+tax);
						
						break;
						
						
					case 2:
						System.out.println("-------------------------------------------------------------------------------------");
			            System.out.println("|                             Calculate Annual Bonus                                |");
		                System.out.println("-------------------------------------------------------------------------------------\n");
					
						System.out.print("Input Employee name        - ");
		                String Abname = input.next();
		                System.out.print("Input Employee salary      - ");
		                double Absalary = input.nextDouble();
		                
		                if(Absalary < 100000){
							bonus = 5000;
						}else if(Absalary >= 100000 & Absalary <= 199999){
							bonus = Absalary*0.10;
						}else if(Absalary >= 200000 & Absalary <= 299999){
							bonus = Absalary*0.15;
						}else if(Absalary >= 300000 & Absalary <= 399999){
							bonus = Absalary*0.20;
						}else{
							bonus = Absalary*0.35;
						}
						
						System.out.println();
						System.out.println("Annual bonus :"+bonus);
						break;
						
						
					case 3:
						System.out.println("-------------------------------------------------------------------------------------");
			            System.out.println("|                             Calculate Loan amount                                 |");
		                System.out.println("-------------------------------------------------------------------------------------\n");
					
						System.out.print("Input Employee name        - ");
		                String Laname = input.next();
		                System.out.print("Input Employee salary      - ");
		                int Lasalary = input.nextInt();
		                
		                System.out.println();
		                
		                if(Lasalary < 50000){
							System.out.println("You can not get a loan because your salary lessthan Rs.50 000....");
						}else{
							System.out.print("Enter number of year : ");
							int years = input.nextInt();
						
							System.out.println();
							if (years <= 5){
							
							int Nomonths = years*12;
						
						
							double Loan = (Lasalary * 0.60) *( ((1-(1/Math.pow( (1+(0.15/12)),Nomonths ) )) )  / (0.15/12) );
						
							System.out.println("You can get Loan Amouunt : "+Loan);
						
							}else{
								System.out.println("The maximam  year is 5 , try again ...\n");
							}
						
						}
						break;
						
					case 4:
						System.exit(0);
				}
				
			}while(true);
			
		}
}
