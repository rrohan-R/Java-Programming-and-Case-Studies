create table books
(book_id int Primary Key AUTO_INCREMENT,
title VARCHAR(50),
Author_ID int,
publication_year year,
price decimal(10,2),
foreign key(Author_ID) references authors(Author_ID));

select * from books;

create table authors
(Author_ID int primary key auto_increment,
first_name varchar(50),
last_name varchar(50));

create table borrowers(
borrower_id int primary key auto_increment,
first_name VARCHAR(50),
last_name VARCHAR(50),
email varchar(50) unique,
dob date);

create table loans(
loan_id int primary key auto_increment,
borrower_id INT,
book_id INT,
Foreign Key(borrower_id) references borrowers(borrower_id),
foreign key(book_id) references books(book_id),
loan_date DATE,
return_date DATE);

insert into authors(Author_ID,first_name,last_name)
values(1,"Ram","Krish"),
(2,"Roy","Kumar"),
(3,"Nike","Jordan"),
(4,"Eva","John"),
(5,"Mike","Kit");

insert into books(book_id,title,Author_ID,publication_year,price)
values(100,"2 States",1,2000,500),
(101,"Half Girlfriend",2,2018,700),
(103,"Gullivers Travels",3,1995,1000),
(104,"Harry Potter",4,2004,850),
(105,"The Alchemist",5,1987,1500);

insert into Borrowers(first_name, last_name, email, dob) values
("Vijay","Kumar", "vijayvk@email.com", "1990-05-15"),
("Bob", "Kumar", "Bob.kumar@email.com", "1985-08-20"),
("Ray", "Diamond", "diamond@email.com", "2000-02-10"),
("Surya","Kiran", "surya.kiran@email.com", "1995-11-30"),
("Eva", "David", "eva.david@email.com", "1988-01-25");

insert into Loans(loan_id,borrower_id,book_id,loan_date, return_date) values
(1000,1,100,"2000-06-22","2000-09-20"),
(1001,2,101,"2002-06-22","2002-09-20"),
(1002,3,103,"2002-06-28","2002-09-27"),
(1003,4,104,"2002-09-20","2003-05-20"),
(1004,5,105,"2003-01-01","2003-07-20");

SELECT * FROM Books;

select title, price, publication_year
from Books
where price > 20;

select first_name,last_name,email
from borrowers b
where borrower_id in(select borrower_id from loans where loan_date>"2024-01-01");



update Books
set price = 25.00
where title ='The Alchemist';

update books
set title="The Great Gatsby"
where price = 25.00;

update books
set title="Moby Dick"
where book_id=100;

DELETE FROM Loans
WHERE book_id=(SELECT book_id FROM Books WHERE title = "Moby Dick");

delete from books
where title="Moby Dick";

alter table books
add column genre varchar(50);

select count(book_id)
from books;

select sum(price)
from books;

select avg(price)
from books;

select title from Books where book_id in (
	select book_id from Loans where borrower_id in(
		select borrower_id from Borrowers where datediff(curdate(),dob)/365 >30));
