public class Policy 
{
   private int policyNumber;
   private String providerName; 
   private String holderFirstName;
   private String holderLastName;
   private int holdersAge;
   private String smokingStatus;
   private int height;
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
public Policy(int number, String provider, String firstName, String lastName, int age, String smokeStatus, int h, double w)
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

public void setholderFirstName(String firstName) 
   {
   
     holderFirstName = firstName;
   
   }
   
  
public void setholderLastName(String lastName) 
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
   
public void setHeight(int h) 
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
   
public String getHolderLasttName()
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

public int getHeight() 
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
 final double BASE_FEE = 600;
 double additionalFee = 0;
 double total = 0;
  
  if(getHolderAge() > 50)
  {
   additionalFee = 75;
   total = BASE_FEE + additionalFee; 
  }
  if(getSmokingStatus().equalsIgnoreCase("Yes")  )
  {
   additionalFee = 100;
   total = BASE_FEE + additionalFee; 
  }
 if(getBMI() > 35 )
  {
   additionalFee = ( (getBMI() - 35) * 20 );
   total = BASE_FEE + additionalFee; 
  }

 return total;
}



}