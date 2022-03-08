import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class donationsTester {

		public static void main(String[] args) throws FileNotFoundException  {
			
	        System.out.print("Would you like to process all of the donations? Please input 'yes' to continue moving forward: ");

	        Scanner sc = new Scanner(System.in);

	        if (!sc.nextLine().equalsIgnoreCase("yes")) {
	        	
	            System.out.println("Ending system now without processing any donations");
	        }
	        
	        else {
	            Donations giveToMe = new Donations();
	            
	            File f = new File("Donations.txt");
	            
	            Scanner sc1 = new Scanner(f);
	            
	            while (sc1.hasNextLine()) {
	            	
	                String s = sc1.nextLine();
	                
	                if (s.contains("EOF")){break;}

	                else {
	                    String[] arr = s.split(">");
	                    if (arr[0].contains("individual")){
	                        giveToMe.processDonation("individual",Integer.parseInt(arr[1]));
	                    }
	                    else if (arr[0].contains("business")) {
	                        giveToMe.processDonation("business",Integer.parseInt(arr[1]));
	                    }
	                    else if (arr[0].contains("other")){
	                        giveToMe.processDonation("other",Integer.parseInt(arr[1]));
	                    }
	                }
	            }

	            giveToMe.getStatistics();

	        }
	    }
}
