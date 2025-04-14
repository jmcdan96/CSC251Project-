public class PolicyHolder 
{
   private String firstName;
   private String lastName;
   private int Age;
   private String smokingStatus;
   private double height;
   private double weight; 
   

//no-arg Constructor
public PolicyHolder()
{
   firstName = "";
   lastName = "";
   Age = 0;
   smokingStatus = "";
   height = 0;
   weight = 0; 

}
//Constructor
public PolicyHolder(String firstName, String lastName, int Age , String smokingStatus , double height , double weight)
{

 this.firstName = firstName;
 this.lastName = lastName;
 this.Age = Age;
 this.smokingStatus = smokingStatus;
 this.height = height;
 this.weight = weight; 

}

//Copy of PolicyHolder Object 
public PolicyHolder(PolicyHolder object2)
{
 this.firstName = object2.firstName; 
 this.lastName = object2.lastName; 
 this.Age = object2.Age; 
 this.smokingStatus = object2.smokingStatus; 
 this.height = object2.height;
 this.weight = object2.weight; 



}
//Setter Method that sets the first name of the policy holder
//@param the Policy Holder's First Name 
public void setHolderFirstName(String firstName) 
   {
   
     this.firstName = firstName;
   
   }
   
//Setter Method that sets the last name of the policy holder
//@param the Policy Holder's Last Name   

public void setHolderLastName(String lastName) 
   {
   
     this.lastName = lastName;
   
   }

//Setter Method that sets the age of the policy holder
//@param the Policy Holder's age 

public void setHolderAge(int age) 
   {
   
      this.Age = Age;
   
   }
//Setter Method that sets the smoking status of the policy holder
//@param the Policy Holder's smoking status
  
public void setSmokingStatus(String smokingStatus) 
   {
   
      this.smokingStatus = smokingStatus;
   
   }
//Setter Method that sets the height of the policy holder
//@param the Policy Holder's Height
  
public void setHeight(double height) 
   {
   
      this.height = height;
   
   }
   
//Setter Method that sets the weight of the policy holder
//@param the Policy Holder's Weight
   
public void setWeight(double w) 
   {
   
      this.weight = weight;
   
   }

//getHolderFirstName Method that returns the first name of the holder 
//@return the holder's First Name

public String getHolderFirstName()
   {
   
     return firstName; 
   
   } 
//getHolderLastName Method that returns the last name of the holder 
//@return the holder's Last Name
  
public String getHolderLastName()
   {
   
     return lastName; 
   
   } 
//getHolderAge Method that returns the holder's age 
//@return the holder's age
   
public int getHolderAge()
   {
   
     return Age; 
   
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


return (getWeight() * 703) / (getHeight() * getHeight() ); 

}


//toString method 
public String toString() 
{
 String output = "";
 
 output += "Policy Holder's First Name : " + firstName + 
          "\nPolicy Holder's Last Name : " + lastName + 
          "\nPolicyholder's age : " + Age + 
          "\nPolicyholder's Smoking Status(Y/N) : " + smokingStatus + 
          "\nPolicyholder's height " + height + 
          "\nPolicyholder's weight " + weight;  
           
          
          
 
 
  return output;


}





}