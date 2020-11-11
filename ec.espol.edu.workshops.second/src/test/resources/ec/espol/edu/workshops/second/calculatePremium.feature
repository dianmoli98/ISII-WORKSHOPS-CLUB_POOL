Feature: Do you meet the age requirement?
 Scenario: Those over 80 years old do not meet the prerequisite.
 Given the customer is 82 years old
 When your age is entered
 Then they should tell me "Not suitable"

 Scenario outline: Do you meet the requirement or not?
  Given the client is "<age>" years old
  When your age is entered
  Then they should tell me <answer>
 Examples:
  | age | answer |
  | <80 | Suitable |
  | > 80 | Not suitable |
  | = 80 | Suitable |

 
Feature: Calculation of the insurance premium of a customer 
 Scenario: who meets more than one condition of the system
 Given the client is 50 years old and married	
 When the insurance premium is calculated
 Then the value of the premium will be 200.

 Scenario outline: Meet these conditions or not??
  Given the client is <age> years old and <status_married>
  When the insurance premium is calculated.
  Then the value of the premium will be <answer>.
 Examples:
  | age | status_married | answer |
  | >45 | married  | 200 |
  | <65 | married  | 200 |
  | anything else! | anything else! | -1 |
  
  
Feature: Validate the input of ages
 Scenario: Registering ages for the insurance prime 
 Given the user inputs letters  in the age field.
 When you enter the data in age 
 Then they should show -1 

Scenario outline: Successful age entry?
 Given the user inputs <data> in the age field.
  When you enter the data in age 
 Then they should show <answer>
Examples:
 | data | answer |
 | inputs letters | -1|
 | mix of letters and numbers | -1 |
 | numbers | 1 |
 
 

 