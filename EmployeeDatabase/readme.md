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

After filling in the textfields with the relavant information and clicking the __submit button__, users can add a new employee to the database. If the user decides not to add an employee, the user can click the __cancel button__ and will close the frame. Errors (shown through the red * beside each label) will be presented if the input is incorrect or there already exists an employee in the database with the same employee number. 

## Searching
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/searchFrame.png "Search Frame")

## Removing
![alt text](https://github.com/JasonXZLiu/SchoolCompSci/blob/master/EmployeeDatabase/files/removeFrame.png "Remove Frame")

## Displaying
to be updated

## Editting
to be updated

## Error Reporting
to be updated
