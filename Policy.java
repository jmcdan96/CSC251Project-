public class Policy 
{
   private int policyNumber;
   private String providerName; 
   private PolicyHolder holder; 
   private static int numOfPolicies;
   
public Policy()
{
 policyNumber = 0;
 providerName = "";
 
}
public Policy(int policyNumber , String providerName , PolicyHolder holder)
{
 this.policyNumber = policyNumber;
 this.providerName = providerName;
 this.holder = new PolicyHolder(holder); 
 numOfPolicies++;
 

}
//setPolicyNumber method that sets the Policy Number of the person 
//@param the policyNumber of the holder

public void setPolicyNumber(int number) 
   {
   
    policyNumber = number;
   
   }
//Setter Method that sets the name of the provider
//@param the Provider's name 

public void setProviderName(String provider) 
   {
   
    providerName  = provider;
   
   }
   
//getPolicyNumber Method that returns the policy number of the holder 
//@return the policy number
public int getPolicyNumber()
   {
   
     return policyNumber; 
   
   } 
   
//getPolicyNumber Method that returns the policy number of the holder 
//@return the policy number

public String getProviderName()
   {
   
     return providerName; 
   
   }   

//PolicyHolder method 
public PolicyHolder getPolicyHolder() 
{

 return holder;  


}
//getPrice Method that returns the holder's total policy price
//@return the total price of the price

public double getPolicyPrice()
{
 double policyPrice = 600;
 
  if(holder.getHolderAge() > 50)
  {
    policyPrice += 75; 
  }
  else if(holder.getSmokingStatus().equalsIgnoreCase("smoker")  )
  {
    policyPrice += 100;
  }
  else if(holder.getBMI() > 35 )
  {
   double bmiFee = ( (holder.getBMI() - 35) * 20 );
   policyPrice += bmiFee; 
  }

 return policyPrice;
}

//toString method 
public String toString()
{
 String output = ""; 
 
 output = "Policy Number : " + policyNumber + "\nProvider Name : " + providerName 
 + "\n" + holder.toString() + "\n$" + getPolicyPrice() + "\n"; 

 return output; 

}

//numOfPolicies
 public static int numOfPolicies()
 {
   
   return numOfPolicies; 
   
      
 }

}