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
    
    policy.setPolicyNumber(policyNumber);
    policy.setProviderName(providerName);
    policy.setHolderFirstName(firstName);
    policy.setHolderLastName(lastName);
    policy.setHolderAge(age);
    policy.setSmokingStatus(smokeStatus);
    policy.setHeight(height);
    policy.setWeight(weight);
    
     System.out.println();     
     System.out.println("Policy Number: " + policy.getPolicyNumber() );
     System.out.println("Provider Name: " + policy.getProviderName() );
     System.out.println("Policyholder's first name: " + policy.getHolderFirstName() );
     System.out.println("Policyholder's last name: " + policy.getHolderLastName() );
     System.out.println("Policyholder's Age: " + policy.getHolderAge() );
     System.out.println("Policyholder's smoking status: " + policy.getSmokingStatus() );
     System.out.println("Policyholder's Height (in inches) : " + policy.getHeight() );
     System.out.println("Policyholder's Weight (in pounds) : " + policy.getWeight() );
     System.out.printf("Policyholder's BMI : %.2f " , policy.getBMI() );
     System.out.println();
     System.out.printf("Policy Price : $%.2f" , policy.getPolicyPrice() );
     System.out.println();
     
      if(smokeStatus.equalsIgnoreCase("smoker"))
      {
        totalSmokers++;
      
      }
      
      if(smokeStatus.equalsIgnoreCase("non-smoker"))
      {
        totalNonSmokers++;
      
      }

     
       
   }
    System.out.println("\nThe number of policies with a smoker is : " + totalSmokers);
    System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
   
   //close file 
   inputFile.close(); 
 }
}  