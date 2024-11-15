#unnormalised table
create table orders2(
order_id int primary key auto_increment,
customer_name varchar(50),
product_name varchar(50));

#unnormalised data insertion
insert into orders (customer_name, product_name) 
values('Alice Smith', 'Cappuccino, Espresso'),
('Bob Johnson', 'Latte, Macchiato, Espresso'),
('Charlie Brown', 'Cappuccino'),
('Diana Prince', 'Latte'),
('Eve Adams', 'Macchiato');

#normalised table 1NF
create table orders_2nf(
order_id int primary key auto_increment,
customer_name varchar(50),
product_name varchar(50));

#normalised data insertion 1NF
insert into orders_2nf (customer_name, product_name) 
values('Alice Smith', 'Cappuccino'),
('Alice Smith', 'Espresso'),
('Bob Johnson', 'Latte'),
('Bob Johnson', 'Macchiato'),
('Bob Johnson', 'Espresso'),
('Charlie Brown', 'Cappuccino'),
('Diana Prince', 'Latte'),
('Eve Adams', 'Macchiato');

#StudentID`, `StudentName`, `CourseID`, `CourseName`, `InstructorID`, `InstructorName`

#unnormalised table
create table student_courses(
student_id int primary key auto_increment,
student_name varchar(50),
course_id int,
course_name varchar(50),
instructor_id int,
instructor_name varchar(50));

#unnormalised data insertion
INSERT INTO student_courses (student_name, course_id, course_name, instructor_id, instructor_name) 
VALUES('Alice Johnson', 101, 'Mathematics', 201, 'Dr. Smith'),
('Bob Williams', 102, 'Physics', 202, 'Dr. Johnson'),
('Charlie Brown', 101, 'Mathematics', 201, 'Dr. Smith'),
('Diana Prince', 103, 'Chemistry', 203, 'Dr. Evans'),
('Eve Adams', 102, 'Physics', 202, 'Dr. Johnson');

#normalised table-2NF
create table student_2nf(
student_id int primary key auto_increment,
student_name varchar(50));

#normalised data insertion-2NF
INSERT INTO student_2nf (student_name) 
VALUES('Alice Johnson'),
('Bob Williams'),
('Charlie Brown'),
('Diana Prince'),
('Eve Adams');

#normalised table-2NF
create table courses_2nf(
course_id int primary key auto_increment,
course_name varchar(50),
instructor_id int,
foreign key(instructor_id) references instructors_2nf(instructor_id)); 


#normalised data insertion-2NF
INSERT INTO courses_2nf (course_name,instructor_id) 
VALUES('Mathematics',1),
('Physics',2),
('Mathematics',3),
('Chemistry',4),
('Physics',5);

#normalised table-2NF
create table instructors_2nf(
instructor_id int primary key auto_increment,
instructor_name varchar(50));

#normalised data insertion-2NF
INSERT INTO instructors_2nf(instructor_name) 
VALUES( 'Dr. Smith'),
( 'Dr. Johnson'),
( 'Dr. Smith'),
('Dr. Evans'),
( 'Dr. Johnson');

create table enrollments_2nf(
student_id int ,
course_id int,
foreign key(student_id) references student_2nf(student_id),
foreign key(course_id) references courses_2nf(course_id));

#Columns: `SalesID`, `ProductID`, `ProductName`, `CategoryID`, `CategoryName`, `SaleDate`
create table sales_unnormalised(
sales_id int primary key auto_increment,
product_id int,
product_name varchar(50),
category_id int,
category_name varchar(50),
sale_date date);

#inserting into unnormalised table
INSERT INTO sales_unnormalised (product_id, product_name, category_id, category_name, sale_date)
VALUES
(101, 'Laptop', 1, 'Electronics', '2024-10-01'),
(102, 'Headphones', 1, 'Electronics', '2024-10-05'),
(103, 'Desk Chair', 2, 'Furniture', '2024-10-08'),
(104, 'Smartphone', 1, 'Electronics', '2024-10-10'),
(105, 'Coffee Table', 2, 'Furniture', '2024-10-12');

#3nf conversions

create table sales_3nf(
Salesi_d int primary key auto_increment,
productID int,
sale_date date,
foreign key(productID) references product_3nf(productID));

INSERT INTO Sales_3NF ( ProductID, Sale_Date)
 VALUES ( 1, '2024-01-01'), ( 2, '2024-01-02');
    
    select * from Categories_3NF ;
    select * from Products_3NF;
    select * from Sales_3NF ;


create table product_3nf(
ProductID INT PRIMARY KEY auto_increment,
ProductName VARCHAR(50),
CategoryID INT,
FOREIGN KEY (CategoryID) REFERENCES category_3nf(CategoryID));

INSERT INTO Product_3NF ( ProductName, CategoryID)
VALUES ( 'Pizza', 1), ( 'Burger', 2);

create table category_3nf(
CategoryID INT PRIMARY KEY auto_increment,
CategoryName VARCHAR(50));

INSERT INTO Category_3NF ( CategoryName) VALUES ( 'Beverages'), ( 'Snacks');












