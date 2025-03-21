public class Policy 
{
   private int policyNumber;
   private String providerName; 
   private String holderFirstName;
   private String holderLastName;
   private int holdersAge;
   private String smokingStatus;
   private double height;
   private double weight; 

public Policy()
{
 policyNumber = 0;
 providerName = "";
 holderFirstName = "";
 holderLastName = ""; 
 holdersAge = 0;
 smokingStatus = "";
 height = 0;
 weight = 0;

}
public Policy(int number, String provider, String firstName, String lastName, int age, String smokeStatus, double h, double w)
{
 policyNumber = number;
 providerName = provider; 
 holderFirstName = firstName; 
 holderLastName = lastName;
 holdersAge = age;
 smokingStatus = smokeStatus;
 height = h;
 weight = w;

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
   
//Setter Method that sets the first name of the policy holder
//@param the Policy Holder's First Name 
public void setHolderFirstName(String firstName) 
   {
   
     holderFirstName = firstName;
   
   }
   
//Setter Method that sets the last name of the policy holder
//@param the Policy Holder's Last Name   

public void setHolderLastName(String lastName) 
   {
   
     holderLastName = lastName;
   
   }

//Setter Method that sets the age of the policy holder
//@param the Policy Holder's age 

public void setHolderAge(int age) 
   {
   
      holdersAge = age;
   
   }
//Setter Method that sets the smoking status of the policy holder
//@param the Policy Holder's smoking status
  
public void setSmokingStatus(String smokeStatus) 
   {
   
      smokingStatus = smokeStatus;
   
   }
//Setter Method that sets the height of the policy holder
//@param the Policy Holder's Height
  
public void setHeight(double h) 
   {
   
      height = h;
   
   }
   
//Setter Method that sets the weight of the policy holder
//@param the Policy Holder's Weight
   
public void setWeight(double w) 
   {
   
      weight = w;
   
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
   
//getHolderFirstName Method that returns the first name of the holder 
//@return the holder's First Name

public String getHolderFirstName()
   {
   
     return holderFirstName; 
   
   } 
//getHolderLastName Method that returns the last name of the holder 
//@return the holder's Last Name
  
public String getHolderLastName()
   {
   
     return holderLastName; 
   
   } 
//getHolderAge Method that returns the holder's age 
//@return the holder's age
   
public int getHolderAge()
   {
   
     return holdersAge; 
   
   } 
//getSmokingStatus Method that returns the holder's smoking status 
//@return the holder's smoking status 

public String getSmokingStatus()
   {
     
     return smokingStatus; 
   
   } 
//getHeight Method that returns the holder's height
//@return the holder's height

public double getHeight() 
   {
   
     return height;
    
   }
//getWeight Method that returns the holder's weight
//@return the holder's weight

public double getWeight()
   {
   
     return weight; 
   
   } 
//getBMI Method that returns the holder's BMI 
//@return the holder's BMI

public double getBMI()
{


return (getWeight() * 703) / ( getHeight() * getHeight() ); 

}

//getPrice Method that returns the holder's total policy price
//@return the total price of the price

public double getPolicyPrice()
{
 double policyPrice = 600;
 
  if(getHolderAge() > 50)
  {
    policyPrice += 75; 
  }
  if(getSmokingStatus().equalsIgnoreCase("smoker")  )
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



}