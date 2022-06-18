# java-oops-practice
In this Repository my Java Practice Programs from College as well as Tutorials are uploaded 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Experiment-2
Program-1
Write a class Book with title for the title of book of type String, author for the author’s name of type String, and price for the book price of type double. Using constructor define the values for data members. Create another class BookDemo with a main() method, which creates a Book titled “Developing Java Software” with authors Russel Winder and price $79.75. Prints the Book’s string representation to standard output (using System.out.println).

Program - 2
Write a class ‘Student’ with the following specifications:

Data Members:
- String studName : Name of student
- String sid : Unique ID of the student
- percentage : Percentage of student (Choose appropriate data-type)
Create a constructor to define the values for these data members. Take multiple inputs from user and print the students information with an appropriate grade (A,B,C,D).
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Experiment No. 03

Program-1
Create a Date class with data int year, int month, int date,  int hrs, int min, int sec. Create a default, no-argument constructor which sets the default date to January 1, 2000, 00:00:00 Create 3 overloaded setter methods 
void setDate(int year, int month, int date)
void setDate(int year, int month, int date, int hrs, int min)
void setDate(int year, int month, int date, int hrs, int min, int sec)
Also write a displayDate() method which will display the date depending on the type of date object created.

Program-2
Write a menu-driven program to recruit an employee (depending on his performance in various rounds) in some software company using constructor overloading.
Selection Criteria for each post is given below:
i) Programmer (Minimum total of 80 marks):-
Rounds:-
(1) Course Work
(2) Aptitude Test
(3) Technical Test
(4) Interview

ii) Team Leader (Minimum total of 85 marks ):-
Rounds:-
(1) Technical Test
(2) Interview

iii) Project Manager (Minimum score 90 marks)
Rounds:-
(1) Interview

Create a class Posting and write 3 constructors to initialize the object and set the parameters
and display the employee post according to selection criteria.
Data members:
● int courseWork;
● int AptTest;
● int TechTest;
● int interview;
Methods:
● Posting (int courseWork, int AptTest, int TechTest,int interview)
● Posting (int TechTest,int interview)
● Posting (int interview)
Make use of ‘this’ keyword.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Experiment-4
Program-1
Write a program in Java to maintain the information of Movies which includes the information of name of movie , type of movie( action , thriller , comedy ,drama ) , Hero name , Heroine , budget in Rs. . Write a program to accept the information of movies from user and sort them according to the budget of the film

Program-2
Write an editor program in java which can
1. take paragraph as input.
2. find number of occurance of a word
3. find and deletes a word
4. finds and replaces a word.
5.  Program on Inheritance: Implement a Program to demonstrate single, multilevel Inheritance
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Experiment-5
Program 1. Define parent class "Employee" that has 3 private attributes String name, String id, int age.
Employee has constructor with 3 arguments that set value of name, id, age. It also has getter and setter methods for all 3 private attributes.
Class "SalariedEmployee" is a sub class of Employee and has 1 private attribute empSalary. "SalariedEmployee" can be permanent or on contract and has constructor SalariedEmployee(String name, String id, int age, double empSalary) to set the values.
constructor SalariedEmployee must call the superclass constructor to set name, id, age and call setter method to set the salary.
Employee salary is empSalary + 2000(allowance) if he is a permanent employee else Employee salary is empSalary (no allowance).
Accept the details of 5 employees and print details of the employee with highest salary.
Create class Tester with main method

Program 2: Define class Production that has attributes String title, String director, String writer. Production class has 3 argument constructor that sets the values. It also has getter and setter methods and Overridden toString() of object class  to display details of class.
class Play is a sub-class of Production with getter and setter methods and has an attribute int performances that is incremented every time a play happens. Add Overridden toString() of the object class to display details of class
class Musical is a Play with songs. Musical object has all attributes of Play as well as String composer and String lyricist along with getter and setter methods. Override toString display all attributes of the Musical object
In main create 3 objects of Play and 2 objects of Musical. Every time an object of Play or Musical is created, performances get incremented.  Also add the number of seats booked for each play or musical.
Find the total box office collection, provided the cost of 1 seat for Play is Rs 500(can be variable) and the cost of 1 seat for Musical is Rs 800(can be variable)
Display the total No. of performances as 5 and display the box office collection.
Create a class Tester with the main method
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

