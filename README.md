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

###Author###
Aidan O'Grady (Reg No. 201218150) - wlb12153@uni.strath.ac.uk

###Motivation###
This project is my submission for Assessed Coursework Exercise 2 for class CS313
in the Computer Science course in the University of Strathclyde, Glasgow. This
exercise was based off Programming Problems 3.17 and 4.15 in the book "Operating
System Concepts with Java 8th Edition" by Silberschatz, Galvin, Gange.

The purpose behind the assignment was to familiarise students with programming
with multithreading in mind. It would also help in introducing concepts like
sockets and thread pools in a Java environment. For further information, see
[here](http://classes.myplace.strath.ac.uk/mod/assign/view.php?id=481288).

###Version History###
To see the version history of this project, see VERSIONHISTORY.TXT for more
information.

###Submission Info###
This repositiory is stored in https://github.com/ANuclearError/CS313-ACE-2.git
and is currently private. The submission for the assignment will contain the
source code and runnable .jar files as well for use. In order to use the .jar
files, use the following commands in order:
```
java -jar jar/Server.jar
java -jar jar/Client.jar
```

###Output Example###
```
Hello and welcome to CS313-ACE-2 Server.
Author:	Aidan O'Grady
Reg No:	201218150
Opening server
Connection found
String input read
Message sent
```
The last three messages will repeat as clients request.
```
Hello and welcome to CS313-ACE-2 Client.
Author:	Aidan O'Grady
Reg No:	201218150
Please enter a string: abc123
Original String: abc123
Char Count: 6
Digit Count: 3
```

###License###
Copyright 2014 

This project can not be copied and/or distributed without the express permission
of the authors.

