Feature: Do you meet the age requirement?
 Scenario: Those over 80 years old do not meet the prerequisite.
 Given the customer is 82 years old
 When your age is entered
 Then show -1

 Scenario outline: Do you meet the requirement or not?
  Given the client is "<age>" years old
  When your age is entered
  Then they should tell me <answer>
 Examples:
  | age | answer |
  | <80 | Suitable |
  | > 80 | -1 |
  | = 80 | Suitable |

 
Feature: Calculation of the insurance premium of a customer 
 Scenario: who meets more than one condition of the system
 Given the client is 50 years old and married	
 When the insurance premium is calculated
 Then the value of the premium will be 200.

 Scenario outline: Meet these conditions or not??
  Given the client is <age> years old 
  And <status_married> is married
  When the insurance  is calculated
  Then the value of the premium will be <answer>.
 Examples:
  | age | status_married | answer |
  | >45 | married  | 200 |
  | <65 | married  | 200 |
  | anything else! | anything else! | -1 |
  
  
Feature: Validate license
 Scenario: Registering license for the insurance prime 
 Given the user inputs license false  in the invalid license field.
 When you enter the data in license 
 Then they should show -1 

Scenario outline: the client has an invalid license
 Given the user inputs <data> in the license field.
  When you enter the data in license 
 Then they should show <answer>
Examples:
 | license | answer |
 | false | -1|
 | true | positive number |

 
 

 