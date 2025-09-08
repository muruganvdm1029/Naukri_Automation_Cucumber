Feature: Naukri Web Application Testing

 Scenario: Login Functionality
    Given user must Launch The Browser
    When user must Click The Login Button
    And user must Enter The Valid User Name in the "muruganmech743@gmail.com" User Name Field
    And user must Enter The Valid Password in the "DM1029@amdm" Password Field
    Then user must click the login button and its navigate to the homepage "Murugan Velan"
    
 Scenario: Profile Update Functionality
    Given User must click profile icon
    When User must click View & Update Profile link
    And User must click profile edit button
    And User must select work status as experienced
    And User must select years and months of experience
    And User must enter current salary ""
    And User must select salary breakdown as Fixed
    And User must select country  as india 
    And User must enter the current location 
    Then User must click the save button
    
 Scenario: Resume Headline Functionality  
    Given User must click resume headline button
    When  User must enter the text in text field
    And User must click save button
    
 Scenario: Resume Upload Functionality
    Given User must click resume update button
    When User must upload the resume
     
 Scenario: Key Skills Functionality
    Given User must click the key skills edit button
    When  User must enter the skills in input box
    Then User must click save button
    
 Scenario: Employment Page Functionality
    Given User must click Add Employment button in employment field
    When User must select current employment radio button as yes
    And The user must select the radio button for current employment yes
    And The user must select the radio button for employment type Fulltime
    And The user must click the current companyname text field 
    And The user must click current job title text field
    And The user must click select year in select year text field dropdown
    And The user must click select month in select month text field dropdown
    And The user must enter the salary in salary inputbox
    And The user must enter the skills in Add skills text field
    And The user must click the Notice Period inputbox and select listed relevent notice period 
    Then The user should click save button 
    
 Scenario: Education Functionality
    Given User must click Add education button
    When User must click select education dropdown
    And  User must select Graduation from dropdown
    And User must click select university input field and enter university name and select university
    And User must click select course input field and select course
    And User must click select specialization input field 
    And User must select Fulltime radio button
    And User must click and select course duration starting year and end year 
    And User must click select grading system  
    And User must click checkbox 
    Then user should click save button
    
 Scenario: IT Skills Functionality
    Given User must on profile page
    When User should click Add details button
    And User must send input to skill text field 
    And User should click save button
    Then "IT skills have been successfully saved" text popup should display
 Scenario: Profile Summary Functionality
    Given User must be on profile page 
    When User must click profile summary edit icon
    And User should enter their technical skills in input field 
    And User should click save button
    Then "Profile summary Updated Successfully " text popup should display   
    
Scenario: Career Profile Functionality
    Given User must be on profile page
    When User must click career profile edit icon
    And User must click and select relevent industry of current company from listed industry
    And User must click and select relevent department 
    And User must click and select role category
    And User must click and select job role 
    And User must select radio button of desired job type as permanent
    And User must select radio button of Desired employment type as fulltime
    And User must select radio button of preferred shift as day
    And User must enter the expected salary in text field
    And User should click save button
    Then "Career profile have been updated successfully" text popup should be display 
    
    Scenario: Personal Details Functionality      
    
   Given User must be able to login Naukri page
   When user must be able to click on edit button in personal details
   And user must select the gender 
   And user must select the More information 
   And user must select the Marital Status
   And user must select the date of birth 
   And User should be able to select the radio button in "differently abled" category.
   And User should be able to select the radio button in "Have you taken career break" category.
   And User must enter "Address" in the Permanent Address Field
   And User must enter "Hometown" in the Permanent Hometown Field
   And User must enter "Pin code" in the Pin code  Field
   And User must click on "Add Language" in the Language proficiency. 
   And User must be able to select "Language" from drop down in in Language category
   And User must be able to select "Proficiency" from drop down in Proficiency category
   And User must click on "Add another language" in the Language proficiency. 
   And User must be able to select "Language" from drop down in in Language category
   And User must be able to select "Proficiency" from drop down in Proficiency category
   And User must click on save button
   Then user should get the message as "Personal details updated successfully"

    
    
    

