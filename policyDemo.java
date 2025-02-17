import java.util.Scanner;

public class policyDemo
{
 public static void main(String[] args)
 {
  //Variables 
  int policyNumber;
  String providerName = "";
  String firstName = "";
  String lastName= "";
  int age;
  String smokeStatus = "";
  double height;
  double weight;
  
  
  
  
  //Scanner Object 
  Scanner keyboard = new Scanner(System.in);
  
  //Policy Object 
  Policy policy = new Policy();
 
  //Get the policy number 
  System.out.println("Please enter the policy number : ");
  policyNumber = keyboard.nextInt();
  
  //Get Provider
  System.out.println("Please enter the provider name : ");
  providerName = keyboard.nextLine(); 
  
  keyboard.nextLine();
  
  //Holder First Name
  System.out.println("Please enter Policyholder's first name : ");
  firstName = keyboard.nextLine();
  
  //Holder Last Name
  System.out.println("Please enter Policyholder's last name : ");
  lastName = keyboard.nextLine();
  
  //Holder's Age
  System.out.println("Please enter Policyholder's Age : ");
  age = keyboard.nextInt();

  keyboard.nextLine();
  
  //Holder's Smoke status 
  System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):  ");
  smokeStatus = keyboard.nextLine();
  
  //Holder's Height
  System.out.println("Please enter the Policyholder’s Height:  ");
  height = keyboard.nextInt();

  //Holder's Weight
  System.out.println("Please enter the Policyholder’s Weight:  ");
  weight = keyboard.nextDouble();

  
  //Set Values
  policy.setPolicyNumber(policyNumber);
  policy.setProviderName(providerName);
  policy.setHolderFirstName(firstName);
  policy.setHolderLastName(lastName);
  policy.setHolderAge(age);
  policy.setSmokingStatus(smokeStatus);
  policy.setHeight(height);
  policy.setWeight(weight);
  
  //Display 
  System.out.println("Policy Number: " + policy.getPolicyNumber() );
  System.out.println("Provider Name: " + policy.getProviderName() );
  System.out.println("Policyholder's first name: " + policy.getHolderFirstName() );
  System.out.println("Policyholder's last name: " + policy.getHolderLastName() );
  System.out.println("Policyholder's Age: " + policy.getHolderAge() );
  System.out.println("Policyholder's smoking status: " + policy.getSmokingStatus() );
  System.out.println("Policyholder's Height (in inches) : " + policy.getHeight() );
  System.out.println("Policyholder's Weight (in pounds) : " + policy.getWeight() );
  System.out.printf("Policyholder's BMI : %.2f " , policy.getBMI() );
  System.out.println();
  System.out.printf("Policy Price : $%.2f" , policy.getPolicyPrice() );
 }
}