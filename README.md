# School-Management
Learner's Academy is a School Management Application to maintain records of teachers, students, classes, subject via an administrative login
<h1>Project Overview</h1>
<pre>
Learner's Academy is an Application implementing data maintaining features and 4 operations for all 4 tables (teacher, student, clas, subject)

1) Insert new record
2) Update existing record
3) Delete record
4) Show all records
</pre>
<h1>Project Github Repository url</h1>
https://github.com/devadeepdeb/School-Management
<h1>Output</h1>
<h3>Code to display the welcome screen. It should display:</h3>
<h2>Output 1</h2>
<p>Main application window: Application name and the developer details</p>
<p>Admin Login link</p>
<img src="Images/1.PNG">
<h2>Output 2</h2>
<p>Admin login form and click on Submit button</p>
<img src="Images/2.PNG">
<h2>Output 3</h2>
<p>Acceptance of admin credentials and Option to go to Reports</p>
<p>Option for Managing Report of School with these details:</p>
<p>Option to Manage Teachers</p>
<p>Option to Manage Subjects</p>
<p>Option to Manage Classes</p>
<p>Option to Manage Students</p>
<p>Mapping of Teachers, Subjects, Classes, Subjects</p>
<img src="Images/3.PNG">
<h2>Output 4</h2>
<p>Choices of Managing Teachers</p>
<p>1) Insert new record by checking the table</p>
<p>2) Update existing record by checking the table</p>
<p>3) Delete record by checking the table</p>
<p>4) Show all records by checking the table</p>
<img src="Images/4.PNG">
<h2>Output 5</h2>
<p>Teachers 4 operations with validation</p>
<p>Records will be added/updated/deleted on the basis of primary key and uniqueness of values. Updation/Deletion will be based on Teacher_ID (tid).</p>
<p>There are two Teacher Columns: Teacher_ID (tid) and Teacher_Name (tname).</p>
<img src="Images/5.PNG">
<img src="Images/6.PNG">
<img src="Images/7.PNG">
<img src="Images/8.PNG">
<img src="Images/9.PNG">
<img src="Images/10.PNG">
<img src="Images/11.PNG">
<img src="Images/12.PNG">
<img src="Images/13.PNG">
<img src="Images/14.PNG">
<img src="Images/15.PNG">
<img src="Images/16.PNG">
<img src="Images/17.PNG">
<img src="Images/18.PNG">
<img src="Images/19.PNG">
<img src="Images/20.PNG">
<img src="Images/21.PNG">
<h2>Output 6</h2>
<p>Subjects 4 operations with validation</p>
<p>Records will be added/updated/deleted on the basis of primary key and uniqueness of values. Updation/Deletion will be based on Subject_ID (sid).</p>
<p>There are two Subject Columns: Subject_ID (tid) and Subject_Name (tname).</p>
<img src="Images/22.PNG">
<img src="Images/23.PNG">
<img src="Images/24.PNG">
<img src="Images/25.PNG">
<img src="Images/26.PNG">
<img src="Images/27.PNG">
<img src="Images/28.PNG">
<img src="Images/29.PNG">
<img src="Images/30.PNG">
<img src="Images/31.PNG">
<img src="Images/32.PNG">
<img src="Images/33.PNG">
<img src="Images/34.PNG">
<img src="Images/35.PNG">
<img src="Images/36.PNG">
<img src="Images/37.PNG">
<img src="Images/38.PNG">
<img src="Images/39.PNG">
<img src="Images/40.PNG">
<h2>Output 7</h2>
<p>Classes 4 operations with validation</p>
<p>Records will be added/updated/deleted on the basis of primary key and uniqueness of values. Updation/Deletion will be based on Class_ID (cid).</p>
<p>There are two Class Columns: Class_ID (cid) and Class_Name (cname).</p>

<h2>Output 8</h2>
<p>Students 4 operations with validation</p>
<p>Records will be added/updated/deleted on the basis of primary key and uniqueness of values. Updation/Deletion will be based on Student_ID (stid).</p>
<p>There are two Student Columns: Student_ID (stid) and Student_Name (stname).</p>

<h2>Output 9</h2>
<p>Assignments 4 operations with validation for mapping of Teachers, Subjects, Classes, Students</p>
<p>Records will be added/updated/deleted on the basis of primary key and uniqueness of values. Updation/Deletion will be based on Student_ID (stid).</p>
<p>There are two Student Columns: Student_ID (stid) and Student_Name (stname).</p>

<h1>Database is schooldb. Used phpMyAdmin for mysql to create database and table</h1>
<p>Used 6 tables in that database:</p>
<p>1) teacher (tid - primary, tname - unique) for teachers</p>
<p>2) subject (sid - primary, sname - unique) for subjects</p>
<p>3) clas (cid - primary, cname - unique) for class</p>
<p>4) student (sid - primary, sname - unique) for student</p>
<p>5) assignment (tid - foreign key referencing to teacher table, cid - foreign key referencing to class table and unique, sid - foreign key referencing to subject table, stid - foreign key referencing to student table and unique) for assignment</p>
<p>6) login (username, password) for admin</p>
<img src="Images/41.PNG">
<h1>Application Algorithm</h1>
<pre>
1) Start.
2) Welcome Screen to Print Application, Developer Name and admin link to login.
3) Admin logins and get the 5 options to manage - teacher, subject, class, student, login and assignment (for mapping).
4) For each of these 5 options, there are 4 sub-options to add, update, delete and show records.
5) Enter values in sub-options except show records.
5a) If correct values entered, success message and return to 5) and continue.
5b) If incorrect values entered, re-enter/failure message and return to 5) and continue.
6) See tables of each 5 options. 
7) End
</pre>
<h1>Application Flowchart</h1>
<img src="Images/Flowchart.PNG">
<h1>Agile Framework</h1>
<p>I have used Agile Scrum Methodology to deliver this Application taking 2 Sprints, considering 1 Sprint per week.</p>
<p>In first week, I have installed Apache Tomcat 9.0 for server, phpMyadmin for mysql and worked to prepare Servlet files </p>
<p>In second week, I have created JSP files with modifications, integrations and compilations to test final application in localhost via server localhost for delivery and then pushed source code to GitHub via Git Bash with documentation.</p>
<h1>Core Concepts</h1>
<p>IDE : Eclipse Oxygen</p>
<p>Command Line Emulator Used: Git Bash 2.28.0 version</p>
<p>Git repository hosting service: GitHub</p>
<p>Operating System: Windows 10</p>
<p>Java Compiler Version: 1.8</p>
<p>Java Concepts Used: Exception, If-else, Class, Function, Packages, JSP, Servlet, Maven</p>
<p>Web Server: Apache Tomcat 9.0</p>
<p>Mysql database administration tool: phpMyAdmin</p>
<h1>Data Structures</h1>
<p>Sequential Search: In this, the list or array  (here a list of files) is traversed sequentially and every element is checked. In this application Linear Searching is used to search data in tables.</p>
<h1>Conclusion</h1>
<p>Application can be enhanced further by adding images and more formatting styles</p>