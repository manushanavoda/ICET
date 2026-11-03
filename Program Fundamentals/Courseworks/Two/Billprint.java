import java.util.*;
class Billprint{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
		System.out.println("\n================================================================================== \n");
		System.out.println("__          __  _                            _          _ __  __            _");
		System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ '_  \\ / _ \\ | __/ _ \\  | | |\\/| |/ _' | '__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || ( ) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___| \\___\\___/  |_|_|  |_|\\__,_|_|   \\__| \n");
		System.out.println("\n================================================================================== \n");
		System.out.println();
		System.out.print("Enter Customer Phone Number -");
		String customerPhoneNo = input.next();
		System.out.println();
		System.out.print("Enter Customer Name         -");
		String customerName = input.next();		
		System.out.println();
		System.out.println("\n================================================================================== \n");
		System.out.print("Basmathi Qty(Kg) -");
		int basamthiQTY = input.nextInt();
		System.out.println();
		System.out.print("Dhal Qty(Kg)\t -");
		int dhalQTY = input.nextInt();
		System.out.println();
		System.out.print("Sugar Qty(Kg)\t -");
		int sugarQTY = input.nextInt();
		System.out.println();
		System.out.print("Higland Qty\t -");
		int highlandQTY = input.nextInt();
		System.out.println();
		System.out.print("Yoghurt Qty\t -");
		int yoghurtQTY = input.nextInt();
		System.out.println();
		System.out.print("Flour Qty(Kg)\t -");
		int flourQTY = input.nextInt();
		System.out.println();
		System.out.print("Soap Qty\t -");
		int soapQTY = input.nextInt();
		System.out.println();
		System.out.println();
		
		double basmathiPrice = 250.00;
		double dhalPrice = 180.00;
		double sugarPrice = 150.00;
		double highlandPrice = 1200.00;
		double yoghurtPrice = 50.00;
		double flourPrice = 120.00;
		double soapPrice = 160.00;
		
		double basmathiTotal = basmathiPrice * basamthiQTY;
		double dhalTotal = dhalPrice * dhalQTY;
		double sugarTotal = sugarPrice * sugarQTY;
		double highlandTotal = highlandPrice * highlandQTY;
		double yoghurtTotal = yoghurtPrice * yoghurtQTY;
		double flourTotal = flourPrice * flourQTY;
		double soapTotal = soapPrice * soapQTY;
		
		double total = basmathiTotal + dhalTotal + sugarTotal + highlandTotal + yoghurtTotal + flourTotal + soapTotal;
		double discount = total/100*10;
		double price = total-discount;
		
		
		
		
		
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|                 _   __   __           _____ _______              |"); 
		System.out.println("|                (_) |  \\ /  |    /\\   |  __ \\__   __|             |");
		System.out.println("|                 _  | \\   / |   /  \\  | |__) | | |                |");
		System.out.println("|                | | | |\\ /| |  / /\\ \\ |  _  /  | |                |");
		System.out.println("|                | | | |   | | / ____ \\| | \\ \\  | |                |");
		System.out.println("|                |_| |_|   |_|/_/    \\_\\_|  \\_\\ |_|                |");
		System.out.println("|                     225,Galle Road,Panadura.                     |");
		System.out.println("|                                                                  |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.printf("|                            #Tel  :%-31s| \n",customerPhoneNo);
		System.out.printf("|                            #Name :%-31s| \n",customerName);
		System.out.println("+--------------+------------+-----------------+--------------------+");
		System.out.println("|              |    QTY     |     Unit Price  |          Price     |");
		System.out.println("+--------------+------------+-----------------+--------------------+");
		System.out.printf ("|   %-9s  |    %-8d|      %-11.2f|       %-13.2f|\n","#Basmathi" ,basamthiQTY, basmathiPrice, basmathiTotal);
		System.out.println("|              |            |                 |                    |");
		System.out.printf ("|   %-9s  |    %-8d|      %-11.2f|       %-13.2f|\n","#Dhal", dhalQTY, dhalPrice, dhalTotal);
		System.out.println("|              |            |                 |                    |");
		System.out.printf ("|   %-9s  |    %-8d|      %-11.2f|       %-13.2f|\n","#Sugar", sugarQTY, sugarPrice, sugarTotal);
		System.out.println("|              |            |                 |                    |");
		System.out.printf ("|   %-9s  |    %-8d|      %-11.2f|       %-13.2f|\n","#Highland", highlandQTY, highlandPrice, highlandTotal);
		System.out.println("|              |            |                 |                    |");
		System.out.printf ("|   %-9s  |    %-8d|      %-11.2f|       %-13.2f|\n","#Yoghurt", yoghurtQTY, yoghurtPrice, yoghurtTotal);
		System.out.println("|              |            |                 |                    |");
		System.out.printf ("|   %-9s  |    %-8d|      %-11.2f|       %-13.2f|\n","#flour", flourQTY, flourPrice, flourTotal);
		System.out.println("|              |            |                 |                    |");
		System.out.printf ("|   %-9s  |    %-8d|      %-11.2f|       %-13.2f|\n","#Soap", soapQTY, soapPrice, soapTotal);
		System.out.println("|              |            |                 |                    |");
		System.out.println("+--------------+------------+-----------------+--------------------+");
		System.out.printf("|                           |  Total          |    %-16.2f|\n",total);
		System.out.println("|                           +-----------------+--------------------+");
		System.out.printf("|                           |  Discount(10%%)  |    %-16.2f|\n",discount);
		System.out.println("|                           +-----------------+--------------------+");
		System.out.printf("|                           |  Price          |    %-16.2f|\n",price);
		System.out.println("+---------------------------+-----------------+--------------------+");
		
		System.out.println();
		System.out.print("Enter the amount :");
		int Cash =input.nextInt();
		int Change = Cash - (int)price;
		System.out.println();
		System.out.println("+----------------------+------------------+");
		System.out.printf("|   Net Amount         |   %-15.1f|\n",price);
		System.out.println("+----------------------+------------------+");
		System.out.printf("|   Cash               |   %-15d|\n",Cash);
		System.out.println("+----------------------+------------------+");
		System.out.printf("|   Change             |   %-15d|\n",Change);
		System.out.println("+----------------------+------------------+");
		
		System.out.println();
		
		int Rs5000, Rs2000,Rs1000,Rs500,Rs100,Rs50,Rs20,Rs10,Rs5,Rs2,Rs1;
		
		Rs5000 = Change / 5000;
		Change = Change % 5000;
		Rs2000 = Change / 2000;
		Change = Change % 2000;
		Rs1000 = Change / 1000;
		Change = Change % 1000;
		Rs500 = Change / 500;
		Change = Change % 500;
		Rs100 = Change / 100;
		Change = Change % 100;
		Rs50 = Change / 50;
		Change = Change % 50;
		Rs20 = Change / 20;
		Change = Change % 20;
		Rs10 = Change / 10;
		Change = Change % 10;
		Rs5 = Change / 5;
		Change = Change % 5;
		Rs2 = Change / 2;
		Change = Change % 2;
		Rs1 = Change;
		
		int Notes = Rs5000 + Rs2000 + Rs1000 + Rs500 + Rs100 + Rs50 +Rs20;
		int Coins = Rs10 + Rs5 + Rs2 + Rs1;

		System.out.println("+-------------------+--------------+");
		System.out.println("|    Value          |      No      |");
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.5000        |     %-9d|\n",Rs5000);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.2000        |     %-9d|\n",Rs2000);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.1000        |     %-9d|\n",Rs1000);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.500         |     %-9d|\n",Rs500);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.100         |     %-9d|\n",Rs100);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.50          |     %-9d|\n",Rs50);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.20          |     %-9d|\n",Rs20);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.10          |     %-9d|\n",Rs10);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.5           |     %-9d|\n",Rs5);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.2           |     %-9d|\n",Rs2);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    Rs.1           |     %-9d|\n",Rs1);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    No of Notes    |     %-9d|\n",Notes);
		System.out.println("+-------------------+--------------+");
		System.out.printf("|    No of Coins    |     %-9d|\n",Coins);
		System.out.println("+-------------------+--------------+");
		
		System.out.println();
		System.out.println();
		
		System.out.println("----------------------------------------");
		System.out.println("     THANK YOU FOR SHOPPING WITH US     ");
		System.out.println("----------------------------------------");	
	

		
			
	}
}
