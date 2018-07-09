public class Homework5{
   public static void main (String[] args){		

       int i =0;
       int num =0;
       String  primeNumbers = "";

    for (i = 1; i <= 150; i++){ 		  	  
        int counter=0; 	  
    for(num =i; num>=1; num--){

    if(i%num==0){
 		   counter = counter + 1;
	     }
	   }
	  if (counter ==2){
	     
	     primeNumbers = primeNumbers + i + ", ";
	   }	
       }	
       System.out.println("Prime numbers from 0 to 150 are :");
       System.out.println(primeNumbers);
   }
}
