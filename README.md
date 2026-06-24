Taxi Booking System
📌 Overview

The Taxi Booking System is a Java-based application designed to simplify the process of booking, managing, and tracking taxi rides. The system allows customers to book taxis, view ride details, calculate fares, and manage bookings efficiently. It automates taxi allocation based on availability and provides a seamless experience for both customers and administrators.

This project demonstrates core Java concepts such as Object-Oriented Programming (OOP), Collections Framework, Exception Handling, File Handling, and Data Structures.

🚀 Features
Customer Management
Register new customers
View customer details
Manage booking history
Taxi Management
Add and manage taxis
Track taxi availability
Assign nearest available taxi
Booking Management
Book a taxi
Cancel bookings
View booking details
Track ride status
Fare Calculation
Automatic fare calculation
Distance-based pricing
Ride summary generation
Reports
Customer booking reports
Taxi earnings reports
Ride history reports
🛠️ Technologies Used
Programming Language
Java
Core Concepts
Object-Oriented Programming (OOP)
Collections Framework
Exception Handling
File Handling
Multithreading (Optional)
Development Tools
Eclipse IDE / IntelliJ IDEA
Git & GitHub
🏗️ System Architecture
Customer
    │
    ▼
Booking Module
    │
    ▼
Taxi Allocation Module
    │
    ▼
Fare Calculation Module
    │
    ▼
Database/File Storage
📂 Project Structure
TaxiBookingSystem/
│
├── src/
│   ├── model/
│   │   ├── Customer.java
│   │   ├── Taxi.java
│   │   └── Booking.java
│   │
│   ├── service/
│   │   ├── BookingService.java
│   │   ├── TaxiService.java
│   │   └── FareCalculator.java
│   │
│   ├── util/
│   │   └── Constants.java
│   │
│   └── Main.java
│
├── README.md
└── .gitignore
⚙️ Installation & Execution
Clone the Repository
git clone https://github.com/your-username/taxi-booking-system.git
cd taxi-booking-system
Compile the Project
javac Main.java
Run the Application
java Main
📋 Functional Modules
1. Customer Module
Customer registration
Customer information management
Booking history tracking
2. Taxi Module
Taxi registration
Availability management
Earnings tracking
3. Booking Module
Ride booking
Ride cancellation
Booking confirmation
4. Fare Calculation Module
Distance-based fare calculation
Trip summary generation
Revenue tracking
📊 Class Design
Customer
class Customer {
    private int customerId;
    private String name;
    private String pickupPoint;
    private String dropPoint;
}
Taxi
class Taxi {
    private int taxiId;
    private char currentLocation;
    private boolean available;
    private double earnings;
}
Booking
class Booking {
    private int bookingId;
    private int customerId;
    private int taxiId;
    private char pickupPoint;
    private char dropPoint;
    private int pickupTime;
    private double fare;
}
🔄 Workflow
Customer requests a taxi.
System checks available taxis.
Nearest taxi is allocated.
Fare is calculated based on distance.
Booking confirmation is generated.
Taxi earnings are updated after ride completion.
🎯 Learning Outcomes

This project helps in understanding:

Object-Oriented Programming
Class and Object Design
Encapsulation and Abstraction
Collections Framework
Real-world problem solving
Java application development
📈 Future Enhancements
GUI using Java Swing or JavaFX
Database integration with MySQL
Online payment support
GPS-based taxi tracking
Driver management module
User authentication and authorization
REST API integration using Spring Boot
📸 Sample Output
========== TAXI BOOKING SYSTEM ==========
1. Book Taxi
2. View Bookings
3. View Taxi Details
4. Exit

Enter Choice: 1

Customer ID: 101
Pickup Point: A
Drop Point: D
Pickup Time: 10

Taxi Allocated Successfully!
Taxi ID: 2
Fare: ₹450
👨‍💻 Author

Abinesh R

Email: abineshr005@gmail.com
GitHub: https://github.com/your-github-username
LinkedIn: https://linkedin.com/in/rabinesh
