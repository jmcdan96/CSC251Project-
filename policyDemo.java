import java.util.Scanner;
import java.util.ArrayList; 
import java.io.*; 
; 

public class policyDemo
{
 public static void main(String[] args)throws IOException 
 {
   
   File file = new File("PolicyInformation.txt"); 
   
   if(!file.exists() )
   {
    System.out.println("File doesnt exist" );
    System.exit(0);
   }
          
    Scanner inputFile = new Scanner(file); //opening file 
    
    //Policy Object 
    Policy policy = new Policy(); 
    
   //Variables
   int policyNumber;
   String providerName = "";
   String firstName = "";
   String lastName= "";
   int age = 0;
   String smokeStatus = "";
   int height;
   int weight;
   int totalSmokers = 0; 
   int totalNonSmokers = 0; 
  
    
    
   while(inputFile.hasNext() )  
   {
    policyNumber = inputFile.nextInt();
    inputFile.nextLine();  
    providerName = inputFile.nextLine(); 
    firstName = inputFile.nextLine();
    lastName = inputFile.nextLine(); 
    age = inputFile.nextInt();
    inputFile.nextLine(); 
    smokeStatus = inputFile.nextLine(); 
    height = inputFile.nextInt();  
    weight = inputFile.nextInt() ;
    
   
    
           
      System.out.println(policyNumber);
      System.out.println(providerName);
      System.out.println(firstName);
      System.out.println(lastName);
      System.out.println(age);
      System.out.println(smokeStatus);
      System.out.println(height);
      System.out.println(weight);

      if(smokeStatus.equalsIgnoreCase("smoker"))
      {
        totalSmokers++;
      
      }
      
      if(smokeStatus.equalsIgnoreCase("non-smoker"))
      {
        totalNonSmokers++;
      
      }

     
       
   }
    System.out.println("The number of policies with a smoker is : " + totalSmokers);
    System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
   
   //close file 
   inputFile.close(); 
 }
}  
