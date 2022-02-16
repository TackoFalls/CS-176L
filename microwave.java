
public class microwave {

		// TODO Auto-generated method stub
		
		//Instant Variables 
		
	private int time;
	private int power;
		

		
		//Constructor goes here
		public microwave() {
			
			time = 0;
			power = 1;
		}
		
		//timeButton goes here 
		public void timeButton() {
			
			time = time + 30;
			
		}
		//powerButton goes here 
		public void powerButton() {
			
			if (power == 1)
			{power = 2;}

			else {power = 1;}
		}

		//resetButton goes here 
	public void resetButton() {
		
		time = 0;
		power = 1;
		
	    }

		//startButton goes here 
	public void startButton() {
		
		System.out.println("Cooking for " + (time) + " seconds at level " + (power) + ("."));
		
	}
		
		
	

}
