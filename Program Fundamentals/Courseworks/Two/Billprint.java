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
	

		
			
	}
}
