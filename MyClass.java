
	import java.util.HashMap;

	public class MyClass {
	  public static void main(String[] args) {
	    // Create a HashMap object called connectingCities
	    HashMap<String, String> connectingCities = new HashMap<String, String>();

	    
	 
	    connectingCities.put("Dhaka ","Doha");
	    connectingCities.put("Doha ","Dhaka");
	    connectingCities.put("Dhaka"," Delhi");
	    connectingCities.put(" Delhi"," Dhaka");
	    connectingCities.put("Dhaka"," Kolkata");
	    connectingCities.put(" Kolkata"," Dhaka");
	    connectingCities.put("Dhaka"," Chittagong");
	    connectingCities.put("Chittagong ","Dhaka");
	    connectingCities.put("Dhaka ","Sylhet");
	    connectingCities.put(" Dhaka"," Bangkok");
	    connectingCities.put(" Delhi"," Mumbai ");
	    connectingCities.put("Mumbai"," Delhi");

	    
	  
	   
	    
	    
	   /* Doha Riyadh
	    Riyadh Doha
	    Delhi Kolkata
	    Kolkata Delhi
	    Bangkok Seoul
	    Seoul Bangkok
	    Doha Cairo
	    Cairo Doha
	    Doha London
	    London Doha
	    Wuhan Bangkok
	    Bangkok Wuhan
	    Wuhan Seoul
	    Seoul Wuhan
	    Wuhan Jakarta
	    Jakarta Doha
	    Jakarta Cairo
	    Jakarta London/*/
	    System.out.println(connectingCities);}
	}
	   //for (String i : connectingCities.keySet()) {
	
		//System.out.println("key: " + i + " value: " + connectingCities.get(i));
	    
	  
	


	