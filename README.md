CS313-ACE-2
===========
##
###Synopsis###
This Java program is a Client/Server system allowing communication and object
streaming between the two. After successfully connecting to the server, the
prompts the user for a string input. When received, the server will use that
input to create a Message, which stores the string and calculates the number of
characters and digits in the message. This Message object is sent back to the
client and it's information is read to the user.

###Output Example###
```
Please enter a string: The quick brown fox jumped over the lazy dog, 12345
Original String: The quick brown fox jumped over the lazy dog, 12345
Char Count: 51
Digit Count: 5
```

###Motivation###
This project is my submission for Assessed Coursework Exercise 2 for class CS313
in the Computer Science course in the University of Strathclyde, Glasgow. This
exercise was based off Programming Problems 3.17 and 4.15 in the book "Operating
System Concepts with Java 8th Edition" by Silberschatz, Galvin, Gange.

The purpose behind the assignment was to familiarise students with programming
with multithreading in mind. It would also help in introducing concepts like
sockets and thread pools in a Java environment. For further information, see
[here](http://classes.myplace.strath.ac.uk/mod/assign/view.php?id=481288).

###Contents###
In the github repository, there should be:
	-	README.md (this file)
	-	VERSIONHISTORY.txt
	- 	src/
		-	Client.java
		-	Message.java
		-	MessageImpl.java
		-	MessageImplTest.java
		-	Server.java
		-	ServerDriver.java
	-	doc/
		All the Javadoc, not being listed for brevity's case.
In the submission for the assignment, you will also find
	- bin/
		- Client.class
		- Message.class
		- MessageImpl.class
		- MessageImplTest.class
		- Server.class
		- ServerDriver.class
	- jar/
		- Client.jar
		- ClientST.jar
		- Server.jar
		- ServerST.jar
Please note, .jar files with ST at the end of the file name indicates a
singlethreaded .jar file included for comparison's sake. The other .jar files
are multithreaded.

###Version History###
To see the version history of this project, see VERSIONHISTORY.TXT for more
information.

###Author###
Aidan O'Grady (Reg No. 201218150) - wlb12153@uni.strath.ac.uk

###License###
Copyright 2014 

This project can not be copied and/or distributed without the express permission
of the authors.

