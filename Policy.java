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

public void setPolicyNumber(int number) 
   {
   
    policyNumber = number;
   
   }

public void setProviderName(String provider) 
   {
   
    providerName  = provider;
   
   }

public void setHolderFirstName(String firstName) 
   {
   
     holderFirstName = firstName;
   
   }
   
  
public void setHolderLastName(String lastName) 
   {
   
     holderLastName = lastName;
   
   }



public void setHolderAge(int age) 
   {
   
      holdersAge = age;
   
   }
   
public void setSmokingStatus(String smokeStatus) 
   {
   
      smokingStatus = smokeStatus;
   
   }
   
public void setHeight(double h) 
   {
   
      height = h;
   
   }
   
public void setWeight(double w) 
   {
   
      weight = w;
   
   }

public int getPolicyNumber()
   {
   
     return policyNumber; 
   
   } 

public String getProviderName()
   {
   
     return providerName; 
   
   } 

public String getHolderFirstName()
   {
   
     return holderFirstName; 
   
   } 
   
public String getHolderLastName()
   {
   
     return holderLastName; 
   
   } 

   
public int getHolderAge()
   {
   
     return holdersAge; 
   
   } 

public String getSmokingStatus()
   {
     
     return smokingStatus; 
   
   } 

public double getHeight() 
   {
   
     return height;
    
   }

public double getWeight()
   {
   
     return weight; 
   
   } 

public double getBMI()
{


return (getWeight() * 703) / ( getHeight() * getHeight() ); 

}

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