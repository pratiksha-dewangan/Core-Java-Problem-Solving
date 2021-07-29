# Core-Java-Problem-Solving
Problem solving related to core java such as collection framework, thread synchronization.
ASSIGNMENT --3
-----------------------
1 Create a new tester in package "com.tester" : TestPointArray
 Prompt user , how many points to plot?
Create suitable data structure  , to store Point2D type of references.
eg : Point2D[] points=new Point2D[sc.nextInt()];//10

2 Add a menu , Run the application till user chooses option 10 (exit)
-----------------------------------------------------------------------
1 Plot a new point
I/P --index , x & y
eg : If user supplies 5 50 100
Create a Point2D with x, y of (50,100) & its reference should be stored at the 5th index position in array.
eg : if (index < .... && points[index] == null)
         points[index] =new Point2D(....);
       else
         sop("point plotting error!!!!!");

2 Display all points plotted so far. (Use for-each)
Q : is null checking required ? 
for (Point2D p : points)
    sop(p);

3. Test equality of 2 points
I/P : index1 , index 2
eg If user enters 1 7 , you have to check if point at 1st n 7th index is same.
If same , print "SAME" , otherwise print "DIFFERENT"

4. Calculate distance
I/P strt , end point indexes.
eg : If user enters 2 6
Find out the distance between 2nd & 6th point. (array indexes start from 0)

10. Exit

Note : Boundary condition checking & null checking is expected.
(Meaning : if user supplies invalid index , then give error message : invalid index --out of range
If no point is plotted at user specified index , then give error message : invalid index -- no point plotted here.)

ASSIGNMENT --4
------------------
Create basket of fruits . Prompt user for the capacity of the basket.

Available fruits are 
Apple (sweet n sour in taste)
Mango (sweet)
Orange (sour)

Allow user to add any fruit dynamically in the basket.
User should be able to display the name of the fruit & taste , for all the fruits added in the basket.
Hint : name : data member
taste() : a method


ASSIGNMENT --5
--------------------
Create Emp based organization structure --- Emp , Mgr , Worker
All of above classes must be in package--com.app.org

1.1 Emp state--- id(int), name, deptId(string) , basic(double)

Behaviour ---1.  get emp details -- use toString.
1.2. compute net salary ---
eg : public double computeNetSalary()

2 Mgr state  ---id,name,basic,deptId , perfmonceBonus
Behaviour ----1. get mgr details :  override toString. 
2. compute net salary (formula: basic+performanceBonus) 
3. get performance bonus. --add a new method to return bonus.(getter)


1.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
Behaviour--- 
1. get worker details -- :  override toString.
2.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)

Can you organize these classes in inheritance  hierarchy.

1.4 Write TestOrganization in "tester" package.
Create suitable data structure  to store organization details.

Provide following options. Run the application till "exit"

1. Hire Manager

2. Hire Worker  

3. Display information of all employees including net salary  using single for-each loop.
Display from the same for-each loop, performance bonus if it's a manager or if it's a worker , display hourly rate of the worker .

4. Update performanceBonus or hourly rate
I/P : emp id , bonus or hourly rate increment
Update the details suitably.

5. Exit

ASSIGNMENT-- 6
-----------------
1. Create Java application for fixed stack & growable stack based on Stack i/f , for storing emp details

Steps
1.1  Create Employee class -- id,name,salary, constructor,toString
1.2 Stack interface -- push & pop functionality for Emp refs. & declare STACK_SIZE as a constant. 
1.3 Create implementation class of Stack i/f -- FixedStack (array based)
1.4 Create another implementation class of Stack i/f-- GrowableStack (array based)

1.5

From Tester class (Hint :  use dynamic method dispatch using interfaces)
--- display Menu
(Note : Must use 1 switch-case only. You won't need any complex nested control structure
Once user selects either fixed or growable stack , user shouldn't be allowed to change the selection of the stack.(Hint : null checking)
)
1 -- Choose Fixed Stack
2 -- Choose Growable Stack
Accept following options only after initial selection.(Hint : null checking)
3 -- Push data 
I/P Accept emp details & store these details in the earlier chosen stack
4 --- Pop data & display the same (from the earlier chosen stack)
5 -- Exit


ASSIGNMENT-- 7
------------------------
Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
tight encapsulation
state(data members)  : registrationNo : String , color : String , price : double
registrationNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique ID)
Override toString to return complete state.

Create a class TestVehicle under the package "tester"
Accept details of 2 vehicles from user . 
Display "SAME" or "DIFFERENT" , using inherited "equals" method , from Object class.
Observe & conclude
Is there any problem ?
If yes : think of the solution.

ASSIGNMENT --8
-----------------
1.1 Customer : name(string),email(string),password(string),registrationAmount(double),dob(Date),type (CustomerType : enum)
CustomerType : SILVER,GOLD,PLATINUM
Add/generate suitable constructor & toString
Unique ID(Primary Key ) : email  (2 customers are SAME iff their email ids are same)
Will you add any other data member in Customer class for parsing n formatting dates ? 
HOW ? : 

1.2 Create custom exception (checked exception )class in a separate package
CustomerHandlingException

1.3 Create in "utils" package : ValidationRules
Rules 
email must contain "@" & should be from ".com" domain
password must be min 4 max 10 chars long
reg amount should be multiples of 500
dob should be before 1st Jan 1995
duplicate customer details should not be stored.

Supply these validation rules using different static methods.
(Centralized exception handling is expected)

1.4 Create a simple tester : Tester1 
MUST use try-with-resources to create scanner.
Options
1. Prompt for customer details
Validate customer details (using validation rules)
You should not  accept duplicate customer details
Iff it's valid , create customer instance , o.w display error message via catch clause.

2. Display details of all registered customers
(for-each)

3. Exit

ASSIGNMENT-- 10
--------------------
1. Solve :
Either continue with earlier Customer class or can Create a new data type 
Student  : 
1.1 Student : prn (string : unique id) , name , email , password, course (enum) ,GPA(double) , dob(Date)
Add suitable constructor/s , toString , equals (as per the requirement)
1.2 Course (enum) : DBT,REACT,ANGULAR,REST,SPRING,HIBERNATE

1.3 Create custom exception class

1.4 NO validation rules currently (keeping it simple!)

1.5 Create a Tester with following options (use dynamic data structure : ArrayList)
MUST use AL methods.
1. Add student details
2. Fetch Student details
I/P : student'd PRN
Either display details or throw custom exception , in case of invalid PRN

3. Display All student details

4. Cancel Admission
I/P : student'd PRN
Either remove student  details or throw custom exception , in case of invalid PRN

5. Update GPA
I/P : student'd PRN n new GPA
Either update student  details or throw custom exception , in case of invalid PRN


ASSIGNEMENT-- 11
------------------
1.Customer based assignment
Options
1. Customer registration (no dups pls!)
i/p : customer details
o/p err mesg in case of invalid / dup inputs or success mesg
2. Customer login
i/p : email , password
o/p invalid email or invalid password or login successful mesg
3. Unsubscribe customer
i/p : email
o/p  invalid email mesg or delete customer details

4. Apply discount to all customers of specified plan registered before specific date
n Display names of such customers
i/p : plan(silver/gold...) ,reg date , discount in %

2. Import day11.1 in your workspace, revise CRUD , searching , sorting , anonymous inner class .
3. Copy Day10 assignment into Day 11.
Modify tester to add these options.
3.0 Create CollectionUtils class , to return populated sample data of students
3.1 Print names of students enrolled in a specific course , with DoB before a specific date
I/P : course name & DoB
3.2 Sort student details as per asc order of PRN , using natural ordering
3.3 Sort student details as per desc / asc GPA  , using custom ordering & anonymous inner class
3.4 Sort student details as per course & GPA   , using custom ordering & anonymous inner class
NOTE : lexicographical sorting of courses is not expected here.(ordinal position based sorting will do!)
eg : Collections.sort(list,new Comparator<Student>()
{
 //compare
});
3.5 Remove  details of failed students from the list
(Failed if GPA < 5)
Hint : Use Iterator's remove method
3.6 Display details of the student in reverse order.
(ListIterator)

ASSIGNMENT--12
------------------
1. Complete pending work.
2. Import all day12 related projects & revise generic methods n generic syntax
3. Solve
3.1 Collections.shuffle() to shuffle list elements of type string
1. Create List of fixed size Strings(Arrays.asList)
2. Then use shuffle method to shuffle this list n print same.
1. Create List of fixed size Doubles(Arrays.asList)
2. Then use shuffle method to shuffle this list n print same.

3. Write a static , generic method to display details (toString) of collection(AL,LL,V,HS,LHS,TS) of any type.
Usage : AL<Integer> l1, HS<String> l2 , LL<Date> l3
display(l1/l2/l3);

3.3 Write a generic method to accept ANY type of the collection(any list or any set) of numbers (int/double/float/byte/short...) n return it's sum
eg : public static double ......(...)
{
//Wrapper : double doubleValue()
}


3.1.5
Use Collections.fill  method , to fill up List of emps with Emp/Mgr/SalesMgr/Worker ....(Emp or any any sub type of emp


3.2 Collections.copy to understand extends vs super
3.3 Write a generic method to accept ANY type of the collection(any list or any set) of numbers (ints/double/float) n return it's sum
3.4 Write a generic method to accept ANY type of the list of numbers  &   add the specified number to the list. 
Detailed meaning
Write a method to accept AL/LL/Vector of either Byte or Long or Double & then add to it Byte or Long or Double ..as per matching signature
 
(For understanding PECS)
3.5 Solve uploaded "generic-questions"


4. Add the populated list of students to HashSet.
Add students with dup PRN (don't call dup based validation rule)
Check if it's storing the dups.
If  yes : fix the problem


5. More practise questions for generics
Emp <---Mgr <----SalesManager
public class Test1 {
public static void main(String[] args) {
ArrayList<Emp> list = new ArrayList<>(Arrays.asList(new Emp(), new Mgr(), new SalesMgr()));
list.add(new SalesMgr());
displayDetails(list);
ArrayList<Mgr> list2 = new ArrayList<>(Arrays.asList(new Mgr(), new SalesMgr(),new Mgr()));
displayDetails(list2);
}

// add a static method to display Emp/Mgr/Worker details from any collection
public static void displayDetails(Collection<Emp> emps) {
 for (Emp e : emps)
 System.out.println(e);
}

}

ASSIGNMENT-- 13
-------------------
Create a new eclipse project
1. Store book details in a library in hashing based data structure : HashSet
Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
Unique ID : book title
Accept at least 5 book details from user & confirm if hash set is working in a correct manner.

2. Store book details in a library in hashing based data structure : HashMap<String,Book>

Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
Unique ID : book title
Create a pre-populated map with sample data.(put) : 5 entries
Supply following options
2.1 Add book.
I/P Book details
(containsKey/get)
title --(containsKey:false) doesn't exist --prompt for remaining book details
exists --(containsKey:true ) ---prompt for qty -- (get(key) --> value: bk : setter/getter for qty)
In case of a new book , store book details in the map.
In case of duplicate title , just update the quantity

2.2 Display All books in a library
(values ---for-each)

2.3 Issue out a book.
i/p book title
If the book is found , update the quantity suitably.
(Map : get(key) --> bk , use settters: reduce qty

2.4 Return a book
i/p book title
If the book is found , update the quantity suitably.
(Map : get(key) --> bk , use settters: increase qty)

2.5 Remove book
i/p book title
(Map : remove)

ASSIGNMENT-- 14
---------------

2. Create a copy of day13 work into a new project n add these options
2.1. Reduce quantity of all old books by 10 % (i.e books having publish date < specified date)
I/P : Date 

2.2 Accept a category from user & display all available books(quantity > 0) under specified category
eg : Category category=Category.valueOf(sc.next().toUppercase());
for(Book b : lib.values())
  if(b.getCategory().equals(category))
   .....
 

2.3 Sort books as per the title , display the same.
(lexicographical order)

2.4 Sort the books as per author & price.

3. Import day14 projects , revise maps n functional programming especially.

4. To be done : completely with lab faculty help
Understand basic concept of Java 8 Functional streams n solve the following 

1.Create int[] ---> IntStream & display its contents.
2. Create AL<Integer> , populate it.
Convert it to seq stream & display elems
Convert it to parallel stream & display elems
3. Create stream of ints between 1-100 & display all even elements.
(Hint : IntStream methods --range,filter,forEach)
4. Use supplied Product class , Utils class from ready code samples.
Display all product names of a particular category , exceeding specific price.
I/P category name & price.
(stream,filter,forEach)

5. Display sum of all even nos between 1-100 .

6. Display sum of product prices of a specific category.
I/P category name
o/p sum.

7. Display average  of product prices of a specific category.
I/P category name
o/p average 

8. Find name of the product which is most expensive.
--------------------------
More discussion!
Fruit f=new Mango();
//Mango m=new Fruit();//javac err
Mango m=(Mango) new Fruit();//illgeal casting : Classcast exc

With the same logic : 
Collections.sort(list,(List)map.values());//Classcast exc 
-----------------
Extra OPTIONAL Work
Store emp details in a suitable DS , to ensure constant time performance for CRUD operations
(which one : HashMap)
Emp :empPK,salary,name.
Unique ID : emp id & dept id.
HashMap<EmpPK,Emp>
EmpPK : emp id(int),dept(string/enum)
Must satisfy contract : hashCode,equals (i.e override these methods suitably!)


ASSIGNMENT-16
----------------

2. Refer to Day13 , book library assignment.
At the time of launching the app , load book details from a bin file using de-serialization 
Before terminating save book details
(Collection + I/O)

2.1 Add i/f : IOUtils
2 methods
1. static void storeData(map, fileName) throws ....
{
 //Java App --->OOS(ser) --->FOS( Bin File)
//method : writeObject(map)
}

2. de-serial
static  Map<...> restoreData(fileName) 
{
   //Java App <---- OIS <----FIS(bin file)  --in case of FNFExc(IOException) ----create new EMPTY map n ret
   readObject : downcasting (Object ----> Map)
}


3. Create multi threaded java application --- having 3 threads
main , even , odd.

Create EvenPrinterTask  & OddPrinterTask
Accept from user (in main thread)-- start & end values.
Pass these values from main to child threads
Even no printer thread  should print even nos within range, with small delay (sleep)
Odd no printer thread should print odd nos within range , with small delay (sleep)
Ensure no orphans.

Solve above using  implements Runnable scenario.
------------------------------------

4.  Extra  assignments(application of threads with collection n I/O)

4.1 Create core classes --
Student : prn (string : unique id) , name , email , password, course (enum) ,GPA(double) , dob(LocalDate)
Address --street,city,zipCode
Create Aggregation between Student & Address
(weaker association)

4.2 Create StudentCollctionUtils class to create populated Map of students with their address
(atleast 5 entries)


4.3 Create a multi threaded application for saving student details in 2 separate  bin files(taken from the SAME Map) : (in student_gpa.ser : sorted by gpa & in student_dob.ser : sorted by dob) using 2 different threads , concurrently! , using serialization.

4.4 Write a utility to confirm the correctness of the output

5. 
Create new project 
5.1 Copy from  utils package : JointAccount class , which represents a joint account between 2 customers.
Go through it's methods carefully.

5.2. Create a package runnable_tasks to create 2 runnable tasks (implements scenario)
1. UpdaterTask 
Should  invoke BankAccount's update balance method : continuously (while loop with some sleep)
Hard code amount to update as 500.

2. CheckerTask
Invoke SAME BankAccount's check balance : continuously (while loop with some sleep)
In ideal condition ,  balance must be same as original balance (i.e 5000). So if it's not , then terminate application.
(System.exit(1))

5.3  Create a Tester 
main : Create a SINGLE joint acct instance with opening balance of 5000.
Pass it to 2 threads .
Ensure no orphans. 
Observe n conclude.
