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
      smokeStatus = inputFile.nextLine();
      inputFile.nextLine();  
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
       
      
      
     }           
     
     for(int i = 0; i < policy.size(); i++)
     {
      System.out.println(policy);
      System.out.println();  
      
       //Number of Smokers
       if(smokeStatus.equalsIgnoreCase("smoker"))
        totalSmokers++; 
        else
         totalNonSmokers++;
     
     }
     
     //Display Information
     System.out.println("There were " + Policy.numOfPolicies() + " Policy objects created. "); 
     System.out.println("The number of policies with a smoker " + totalSmokers); 
     System.out.println("The number of policies with a non-smoker " + totalNonSmokers); 
        

   
     
       
          
      
    
   
    
     
 } 
}  
