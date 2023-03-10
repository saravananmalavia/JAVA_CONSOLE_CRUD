# JAVA_CONSOLE_CRUD
Console based application which covers java lang fundamentals, OOPs concepts, File Handling, Exception handling &amp; Collection framework 

# Student Management System

	SMS is a console based application which supports to manage the student marks details in a file in the local drive.

# Topics / Concepts

•	Java language fundamentals

o	data types, 
o	conditional statements
o	looping statements 
o	jump statements
o	arrays
o	passing  & return array from and  to a function

•	OOPs concepts

o	class & object, 
o	constructor, overloaded constructor
o	static function and data members, 
o	data encapsulation
o	data abstraction

•	packages

o	custom packages
o	built in packages

•	exception handling

o	try catch blocks
o	custom exception

•	File handling

o	FileInputStream & FileOutputStream
o	ObjectInputStream & ObjectOutputStream
o	Serialization

•	collection framework

o	Hashtable
o	Generic in collection classes
o	Enumeration


# Files in SMS

StudentManagement.java

	 menu based console application to do the CRUD operation on student data

StudentHandler.java

	 provides functions to read, display, update and delete a student details

StudentIO.java

	interface with abstract functions to read and display student details 

Student.java

	 entity class with required getter and setter methods
	implements the Interface StudentIO & Serializable

FileHelper.java
	
	 provides functions to read and write student objects into a File
 
Helper.java

	 provides utility functions to read an integer, double and string values from console.
	 provides function to read valid marks from the console.

MOBException.java
	
	 custom exception (Mark Out of Bound Exception)
	 used to accept marks between a range (0-100)
![image](https://user-images.githubusercontent.com/33054085/224251575-547c525a-9f70-4ad5-a37c-311d47d45e06.png)
