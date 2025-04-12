public class PolicyHolder 
{
   private String holderFirstName;
   private String holderLastName;
   private int holdersAge;
   private String smokingStatus;
   private double height;
   private double weight; 
   
   
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


//toString method 
public String toString() 
{
 String output = "";
 
 output = "The policy holder's name is " +  holderFirstName + " " +  holderLastName + " they are " + holdersAge + 
 " years old. " + " smoking status is " + smokingStatus + " they are " + height + " inches tall " + " and weigh " + 
 weight; 
 
 return output;


}





}