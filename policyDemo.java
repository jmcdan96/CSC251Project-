import java.util.Scanner;
import java.util.ArrayList; 
import java.io.*; 
; 

public class policyDemo
{
 public static void main(String[] args)throws IOException 
 {
           
    //Scanner 
    Scanner kb = new Scanner(System.in);  
       
    //ArrayList for Policy
    ArrayList<Policy> policy = new ArrayList<Policy>();
    
     
   //Variables
   int policyNumber;
   String providerName = "";
   String firstName = "";
   String lastName= "";
   int age = 0;
   String smokeStatus;
   int height;
   int weight;
   int totalSmokers = 0; 
   int totalNonSmokers = 0; 
   String anotherPolicy = "";
   int numOfPolicies = 0; 
    
     do
     {
      //Add policy Information 
      System.out.println("Enter the policy number : ");
      policyNumber = kb.nextInt(); 
      
         kb.nextLine(); 
      
      System.out.println("Enter provider name : "); 
      providerName = kb.nextLine(); 
     
      //Add Policy Holder Information
      System.out.println("Enter the Policy Holder's First Name : "); 
      firstName = kb.nextLine(); 
      
      System.out.println("Enter the Policy Holder's Last Name : "); 
      lastName = kb.nextLine(); 
 
      System.out.println("Enter the policy holder's age : " ); 
      age = kb.nextInt(); 
      
      kb.nextLine(); 
      
      System.out.println("Enter the smoking status(Y/N) : " ); 
      smokeStatus = kb.nextLine(); 
      
      if(smokeStatus.equalsIgnoreCase("smoker"))
        totalSmokers++; 
       else 
        totalNonSmokers++; 
        
      
      System.out.println("Enter the policy holder's height : " ); 
      height = kb.nextInt(); 
      
      System.out.println("Enter the policy holder's weight : " ); 
      weight = kb.nextInt(); 
     
     
        kb.nextLine(); 
     
     System.out.println("Do you want to enter information for another policy ? "); 
     anotherPolicy = kb.nextLine();   
     
     //PolicyHolder Object
     PolicyHolder holder = new PolicyHolder(firstName , lastName , age , smokeStatus , height , weight);

     //Policy Object 
     Policy policies = new Policy(policyNumber , providerName , holder );
    
     //add value to policy object 
     policy.add(policies); 
              
     }
     while(anotherPolicy.equalsIgnoreCase("yes") ); 
        
     
     //Display
     for(int i = 0; i < policy.size(); i++)
     {
        System.out.println(policy.get(i)); 
        System.out.println(); 
        System.out.println("There were " + (i + 1) + " Policy objects created. "); 
        System.out.println("The number of policies with a smoker " + totalSmokers); 
        System.out.println("The number of policies with a non-smoker " + totalNonSmokers); 
        

     }
     
       
          
      
    
   
    
     
 } 
}  
