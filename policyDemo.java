import java.util.Scanner;
import java.util.ArrayList; 
import java.io.*; 

public class policyDemo
{
 public static void main(String[] args)throws IOException 
 { 
       
    //ArrayList for Policy
    ArrayList<Policy> policy = new ArrayList<Policy>();
    
    //Create and open file
    File file = new File("PolicyInformation.txt"); 
    Scanner inputFile = new Scanner(file); 
     
   //Variables
   int policyNumber = 0;
   String providerName = "";
   String firstName = "";
   String lastName= "";
   int age = 0;
   String smokeStatus = "";
   int height = 0;
   int weight = 0;
   int totalSmokers = 0; 
   int totalNonSmokers = 0; 
   String anotherPolicy = "";
   int numOfPolicies = 0; 
  
  
   while(inputFile.hasNext() )  
   {
      //Add policy Information 
               
      policyNumber = inputFile.nextInt();
      inputFile.nextLine(); 
      providerName = inputFile.nextLine(); 
      firstName = inputFile.nextLine(); 
      lastName = inputFile.nextLine(); 
      age = inputFile.nextInt(); 
      inputFile.nextLine();  
      smokeStatus = inputFile.nextLine();
      height = inputFile.nextInt();
      weight = inputFile.nextInt(); 
  
      
      if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();

       //PolicyHolder Object
       PolicyHolder holder = new PolicyHolder(firstName , lastName , age , smokeStatus , height , weight);

       //Policy Object 
       Policy policies = new Policy(policyNumber , providerName , holder );
    
       //add value to policy object 
       policy.add(policies); 
       
       //Number of Smokers
       if(policies.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
        totalSmokers++; 
        if(policies.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("non-smoker"))
         totalNonSmokers++; 
     }           
     
         System.out.println(policy);
         System.out.println();  
        
    
     
     //Display Information
     System.out.println("There were " + Policy.numOfPolicies() + " Policy objects created. "); 
     System.out.println("The number of policies with a smoker " + totalSmokers); 
     System.out.println("The number of policies with a non-smoker " + totalNonSmokers ); 
        

   
     
       
          
      
    
   
    
     
 } 
}  
