# Employee Database - User Guide
GUI created using Javax.swing library. 

## Overview
EmployeeDatabase** can be utilized to manage employees in a company or organization. Users can add, search, remove, and display employees in the system and will be saved offline in a csv/excel file. 

Employees have the following general attributes:
* Employee Type (either part time or full time)
* Employee Number 
* First Name
* Last Name
* Gender
* Work Location 
* Deduction Rate

Further attributes for part time employees include hours/week worked, weeks/year worked, and hourly wage. Full time employee includes yearly salary. Net income and gross income are calculated based of these values and the deduction rate. T

*employee number is utilized for most functions of the EmployeeDatabase. Acting as the GUIID/primary key, the employee number must be unique and is used to identify who the employee is.

** _based off a single open hashing hash table_

## Installation
```
# clone repo (includes all other projects within SchoolCompSci) 
$ git clone https://github.com/JasonXZLiu/SchoolCompSci.git
```
The user can run the file through the EmployeeDatabase.jar file (found in the dist folder) and can access and modify the source code (in the src folder) with the latest version of NetBeans or Eclipse. 

**Note:** requires Java 8 to run properly or convert to .exe file

## Importing Existing Data
If employees already exist and are stored in a separate file/database, convert the file to a csv document. Save the file as "data.csv" and move it inside the same directory/folder where EmployeeDatabase.jar is located. If no such data exists, the EmployeeDatabase will automatically create the file.

## Menu
The menu includes a status text and four buttons. The status text displays the total amount of employees already in the database (including the ones being imported from the data.csv file). Clicking on one of the blue buttons will bring the user to another frame where the user can perform their action. 
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/mainFrame.png "Main Frame")

## Adding 
Clicking the __add__ button on the menu frame will show this:
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/addFrame.png "Add Employee Frame")

_Example inputs are shown already._

First, click on the appropriate type of employee (one of the two selectors at the top). This will display the rest of the attributes that needs to be filled in.

Example: Part time employee 

![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/addPTE.png "Add Part Time Employee Frame")

Example: Full time employee

![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/addFTE.png "Add Full Time Employee Frame")

__Input Restrictions:__ - all fields are required (depending on the type of employee) and will throw an error if one or more field is not completed
* Employee Type - one of the choices (Part Time or Full Time) must be selected
* Employee Number - must be a positive integer (leading 0's have no effect)
* First Name - must be a string 
* Last Name - must be a string 
* Gender - one of the choices (Male, Female, or Other) must be selected
* Work Location - must be a string
* Deduction Rate - must be a positive number between 0 and 1 (can hav decimals)
* Hourly Wage - must be bigger than 0
* Hours per Week - must be bigger than 0 and less than 168 (maximum 24 hours x 7 days)
* Weeks per Year - must be bigger than 0 and less than 52 (maximum 52 days in a year)
* Yearly Salary - must be bigger than 0

After filling in the textfields with the relavant information and clicking the __submit button__, users can add a new employee to the database. If the user decides not to add an employee, the user can click the __cancel button__ and will close the frame. Errors (shown through the red * beside each label) will be presented if the input is incorrect or there already exists an employee in the database with the same employee number. The status text on the menu will be updated after this action.

## Searching
Clicking the __search__ button on the menu frame will show this:
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/searchFrame.png "Search Frame")

By inputting an already existing employee number into the text field and clicking the __submit button__, a new frame with the attributes of that employee will be shown. If the user decides not to add an employee, the user can click the __cancel button__ and will close the frame. If the employee number entered does not exist, an error will be thrown and shown.

## Removing
Clicking the __search__ button on the menu frame will show this:
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/removeFrame.png "Remove Frame")

By inputting an already existing employee number into the text field and clicking the __submit button__, the user can delete the employee with the entered employee number. If the user decides not to remove an employee, the user can click the __cancel button__ and will close the frame. If the employee number entered does not exist, an error will be thrown and shown. The status text on the menu will be updated after this action.

## Displaying
Clicking the __display__ button on the menu frame will show this:
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/displayFrame.PNG "Display Frame")

A table of all the employees within the employee database will be listed. By clicking on one row and clicking on the __edit button__, the user will be brought to a new frame where they could enter and edit the employee's information (similar to the __adding employee frame__). If the user tries to edit an employee without selecting one, an error message will be displayed.

![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/editFrame.PNG "Edit Frame")

## Data Stored
EmployeeDatabase stores data into a comma-separated values file (which can be opened in an excel file). This makes updating, importing, and exporting the data really easy.  

Example: 
```
Type,Employee Number,First Name,LastName,Sex,Work Location,Deduction Rate,Hourly Wage,Hours Per Week,Weeks Per Year, Yearly Salary
F,5,Minnie,Mouse,F,California,0.01,,,,45.0,45.0,44.55,
F,1,Duffy,Duck,M,San Francisco,0.0,,,,1000000.0,1000000.0,1000000.0,
P,6,Jimmy,Cricket,M,Anaheim,0.3,30.0,20.0,40.0,,24000.0,16800.0,,
P,2,Donald,Duck,M,Toronto,0.05,30.0,20.0,40.0,,24000.0,22800.0,,
F,7,Pluto,Dog,M,Toronto,0.0,,,,100000.0,100000.0,100000.0,
F,3,Winnie,Pooh,M,New York,0.1,,,,30.0,30.0,27.0,
F,4,Mickey,Mouse,M,San Francisco,0.25,,,,300.0,300.0,225.0,
```
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/data.PNG "Data")

## Issue Reporting
Issues can be reported [here](https://github.com/JasonXZLiu/SchoolCompSci/issues).
