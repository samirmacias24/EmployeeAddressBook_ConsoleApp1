# Macias_AddressBook
# A.) Description
   ### A1.) State of the System
* **Loading From File:**
This section asks the user to enter the specific name of a file (EX: File.txt). If the file is not found it will let the user know that the entered name of the file could not be located. If the file is found, it reads it line by line. It then lets the user know how many individual’s information was found in the file. 
* **Addition**
When the option of adding a new AddressEntry is selected, it asks the user for specific input. This input is the necessary information to create a new profile. Additionally, after finishing entering the appreciate information the user will be notified that the contact has been added.
* **Removal**
When the removal option is selected the user will be asked to enter the last name of the contact they seek to delete. Any last names that correspond to even the beginning letteres of the entered name, will appear on the screen numbered.  Then the user will have the option to choose which one to delete. After selecting one of the number options, they will be asked to enter y or n (Yes or No). Depending on their input, the corresponding action will be done. If no contacts are found then the user is returned to the main menu.
**Note!** That all the profiles with similar or same last names as entered are placed in a Linked List that is used to organize the possible choices. It also helps to find the profile wants to delete, as the integer entered by the user is used as the index of the Linked List. 
* **Find** 
If you seek to find something and there is nothing related to what the user entered, then it returns back to the main menu. If the user enters a last name or beginning of the last name that is in the AddressBook then they appear, in alphabetical order by last name. After showing the user the list it returns back to the main menu.
**Note!** That it was necessary to implement “Comparable<AddressEntry>” and use the compareTo method in order to alphabetize the profiles by the last name.
* **Listing**
This section is quite simple, it displays all the AddressEntries in the AddressBook. If nothing is found then the user is returned to the main menu. **Also uses Comparable
* **Quit**
Simply exits the program

   ### A2.) List of Classes
* **Loading**
Just asks the user for file name calls readFromFIle method
* **Addition**
Accepts input from the user to create a profile. 
* **Removal**
Asks the user for the last name of contact they wish to remove. This method uses a Linked List, O(n) for searching. However, it was assumed that many people wouldn’t have the same last name so something simple like a linked list could be used.
* **Find**
Simply takes input from the user and calls the find method
* **Listing**
Sorts the List then prints the new list
* **Quit**
Terminates the program

# B.) JavaDoc URL:
Link: http://csweb01.csueastbay.edu/~nt3576/
# C.) UML/Design
![](https://github.com/Smacias777/Macias_AddressBook/blob/master/UML%20Class%20Diagram%20Project1.png)
