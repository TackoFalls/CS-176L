import java.util.*;
public class medals {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<String>> medalList = new ArrayList();


		ArrayList<String> countries = new ArrayList();
		countries.add("Canada");
		countries.add("Italy");
		countries.add("Germany");
		countries.add("Japan");
		countries.add("Kazakhstan");
		countries.add("Russia");
		countries.add("South Korea");
		countries.add("United States");


		ArrayList<String> gold = new ArrayList();
		gold.add("0");
		gold.add("0");
		gold.add("0");
		gold.add("1");
		gold.add("0");
		gold.add("3");
		gold.add("0");
		gold.add("1");

		
		ArrayList<String> silver = new ArrayList();
		silver.add("3");
		silver.add("0");
		silver.add("0");
		silver.add("0");
		silver.add("0");
		silver.add("1");
	    silver.add("1");
		silver.add("0");


		ArrayList<String> bronze = new ArrayList();
		bronze.add("0");
		bronze.add("1");
		bronze.add("1");
		bronze.add("0");
		bronze.add("1");
		bronze.add("1");
	    bronze.add("0");
		bronze.add("1");
		
		medalList.add(countries);
		medalList.add(gold);
		medalList.add(silver);
		medalList.add(bronze);

		
  //for loop 
	
	for (int row = 0; row < medalList.get(0).size();row++)	{
		
		   int goldCount = Integer.parseInt(medalList.get(1).get(row));
		   int silverCount = Integer.parseInt(medalList.get(2).get(row));
		   int bronzeCount = Integer.parseInt(medalList.get(3).get(row));
		   
		   
		   
		   
		        System.out.println(medalList.get(0).get(row));
		        System.out.println(medalList.get(1).get(row));
		        System.out.println(medalList.get(2).get(row));
		        System.out.println(medalList.get(3).get(row));

		   
  }			
 }
}


