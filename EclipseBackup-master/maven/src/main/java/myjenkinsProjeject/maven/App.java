package myjenkinsProjeject.maven;

/**
 * Hello world!
 *
 */
public class App {
	

	   public static void main(String[] args) {
	        
for (int minage = 0; minage < 17; minage++) {
	  System.out.println(minage);
	  
	  if(minage < 18) {
			System.out.println("Failed !");
	  }
			
	  
	  
	  for (int maxage = 18; maxage <= 35; maxage++) {
    System.out.println(maxage);
 
  
if(maxage>30) {
	System.out.println("Failed !");
}
if(maxage<30) {
	System.out.println("Passed !");
	   }
	
}
}
	  }
}
	  
