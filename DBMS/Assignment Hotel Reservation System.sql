CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone_number VARCHAR(20),
    address TEXT
);


CREATE TABLE Rooms (
    room_id INT PRIMARY KEY,
    room_type VARCHAR(50),
    price_per_night DECIMAL(10, 2),
    status VARCHAR(50),
    floor_number INT
);

CREATE TABLE Reservations (
    reservation_id INT PRIMARY KEY,
    customer_id INT,
    room_id INT,
    reservation_date DATE,
    check_in_date DATE,
    check_out_date DATE,
    status VARCHAR(50),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);

CREATE TABLE Payments (
    payment_id INT PRIMARY KEY,
    reservation_id INT,
    payment_date DATE,
    amount_paid DECIMAL(10, 2),
    payment_method ENUM('credit card', 'cash'),
    FOREIGN KEY (reservation_id) REFERENCES Reservations(reservation_id)
);

CREATE TABLE Staff (
    staff_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    roles VARCHAR(50),
    hire_date DATE
);

CREATE TABLE Room_Assignments (
    assignment_id INT PRIMARY KEY,
    staff_id INT,
    room_id INT,
    assignment_date DATE,
    task_description VARCHAR(50),
    FOREIGN KEY (staff_id) REFERENCES Staff(staff_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);

INSERT INTO Customers (customer_id,first_name, last_name, email, phone_number, address)
VALUES
(1,'John', 'Doe', 'john.doe@email.com', '555-1234', '123 Main St, Springfield'),
(2,'Jane', 'Smith', 'jane.smith@email.com', '555-5678', '456 Elm St, Shelbyville'),
(3,'Michael', 'Johnson', 'michael.johnson@email.com', '555-8765', '789 Oak St, Capital City'),
(4,'Emily', 'Davis', 'emily.davis@email.com', '555-4321', '321 Pine St, Springfield'),
(5,'David', 'Martinez', 'david.martinez@email.com', '555-1122', '654 Maple St, Rivertown');

INSERT INTO Rooms (room_id,room_type, price_per_night, status, floor_number)
VALUES
(101,'Single', 100.00, 'available', 1),
(102,'Double', 150.00, 'available', 2),
(103,'Suite', 250.00, 'available', 3),
(104,'Single', 100.00, 'occupied', 1),
(105,'Double', 150.00, 'under maintenance', 2);

INSERT INTO Reservations (reservation_id,customer_id, room_id, reservation_date, check_in_date, check_out_date, status)
VALUES
(1,1, 101, '2024-10-01', '2024-10-05', '2024-10-10', 'confirmed'),
(2,2, 102, '2024-10-02', '2024-10-07', '2024-10-14', 'confirmed'),
(3,3, 103, '2024-10-03', '2024-10-08', '2024-10-12', 'confirmed'),
(4,4, 104, '2024-10-04', '2024-10-09', '2024-10-15', 'confirmed'),
(5,5, 105, '2024-10-05', '2024-10-10', '2024-10-13', 'confirmed');

update Reservations set status='not confirmed' where reservation_id=2;

INSERT INTO Payments (payment_id,reservation_id, payment_date, amount_paid, payment_method)
VALUES
(1,1, '2024-10-01', 500.00, 'credit card'),
(2,2, '2024-10-02', 1050.00, 'credit card'),
(3,3, '2024-10-03', 1000.00, 'cash'),
(4,4, '2024-10-04', 750.00, 'credit card'),
(5,5, '2024-10-05', 450.00, 'cash');

INSERT INTO Staff (staff_id,first_name, last_name, roles, hire_date)
VALUES
(1,'Alice', 'Williams', 'receptionist', '2023-05-01'),
(2,'Bob', 'Brown', 'manager', '2022-08-15'),
(3,'Charlie', 'Miller', 'housekeeper', '2021-11-23'),
(4,'Diana', 'Taylor', 'housekeeper', '2024-01-10'),
(5,'Edward', 'Anderson', 'receptionist', '2024-03-20');

INSERT INTO Room_Assignments (assignment_id,staff_id, room_id, assignment_date, task_description)
VALUES
(1,1, 101, '2024-10-06', 'Cleaned and prepared for new guest'),
(2,2, 102, '2024-10-07', 'Cleaned and prepared for new guest'),
(3,3, 103, '2024-10-08', 'Routine maintenance and cleaning'),
(4,4,104, '2024-10-09', 'Cleaned and prepared for new guest'),
(5,5,105, '2024-10-10', 'Cleaning and restocking supplies');

/*Retrieve all information about rooms available on a specific floor.*/
SELECT r.*
FROM Rooms r
LEFT JOIN Reservations res ON r.room_id = res.room_id
WHERE r.status = 'available'AND r.floor_number=2 AND (res.room_id IS NULL OR res.status!='confirmed');

/*List all reservations with customer details (first name, last name, email) sorted by check-in date (earliest first).*/       
SELECT res.reservation_id,res.check_in_date, res.check_out_date,res.status,c.first_name,c.last_name,c.email
FROM Reservations res
JOIN Customers c ON res.customer_id = c.customer_id
ORDER BY res.check_in_date ASC;

/*Find all customers who have reserved rooms for more than 5 nights.*/
SELECT c.customer_id,c.first_name,c.last_name,c.email,res.reservation_id,res.check_in_date,res.check_out_date,
DATEDIFF(res.check_out_date, res.check_in_date)
FROM Reservations res
JOIN Customers c ON res.customer_id = c.customer_id
WHERE DATEDIFF(res.check_out_date, res.check_in_date) > 5;

/*Get the total amount paid for each reservation.*/
SELECT res.reservation_id,SUM(p.amount_paid)
FROM Payments p
JOIN Reservations res ON p.reservation_id = res.reservation_id
GROUP BY res.reservation_id;

/*Find the average room price for each room type.*/
SELECT room_type,AVG(price_per_night)
FROM Rooms
GROUP BY room_type;

/*Display the total revenue generated from all reservations in the last month.*/
SELECT SUM(p.amount_paid)
FROM Payments p
JOIN Reservations res ON p.reservation_id = res.reservation_id
WHERE res.check_in_date BETWEEN DATE_SUB(CURDATE(), INTERVAL 1 MONTH) AND CURDATE();

/*Find the staff members who have been assigned the most rooms for cleaning or maintenance in the last month.*/
SELECT s.staff_id,s.first_name,s.last_name,COUNT(ra.assignment_id) AS num_assignments
FROM Staff s
JOIN Room_Assignments ra ON s.staff_id = ra.staff_id
WHERE ra.assignment_date BETWEEN DATE_SUB(CURDATE(), INTERVAL 1 MONTH) AND CURDATE()
GROUP BY s.staff_id
ORDER BY num_assignments DESC
LIMIT 1;

/*Retrieve the most recent reservation for each customer.*/
SELECT c.customer_id,c.first_name,c.last_name,c.email,r.reservation_id,r.check_in_date,r.check_out_date,r.status AS reservation_status
FROM Customers c
JOIN Reservations r ON c.customer_id = r.customer_id
WHERE r.check_in_date = (SELECT MAX(r2.check_in_date)
FROM Reservations r2
WHERE r2.customer_id = c.customer_id);

#Room Availability Check: Create a query that checks which rooms are available for a given date range (i.e., not reserved for those dates).
SELECT r.room_id,r.room_type,r.price_per_night,r.status
FROM Rooms r
WHERE NOT EXISTS (SELECT 1 FROM Reservations res WHERE res.room_id = r.room_id 
AND ((res.check_in_date BETWEEN '2024-11-01' AND '2024-11-05') OR (res.check_out_date BETWEEN '2024-11-01' AND '2024-11-05')
OR (res.check_in_date <= '2024-11-01' AND res.check_out_date >= '2024-11-05')));

select c.*,r.*
from customers c
left join reservations r 
on c.customer_id=r.customer_id;






