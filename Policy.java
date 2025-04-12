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
 this.holder = holder; 
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
   
//getBMI Method that returns the holder's BMI 
//@return the holder's BMI

public double getBMI()
{


return (holder.getWeight() * 703) / ( holder.getHeight() * holder.getHeight() ); 

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
  if(holder.getSmokingStatus().equalsIgnoreCase("smoker")  )
  {
    policyPrice += 100;
  }
  if(getBMI() > 35 )
  {
   double bmiFee = ( (getBMI() - 35) * 20 );
   policyPrice += bmiFee; 
  }

 return policyPrice;
}

//toString method 
public String toString()
{
 String output = ""; 
 
 output = "The policy number is " + policyNumber + " the provider name is " + providerName; 

 return output; 

}

//numOfPolicies
 public static int numOfPolicies()
 {
   
   return numOfPolicies; 
   
      
 }

}