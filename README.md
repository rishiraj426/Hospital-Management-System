# Hospital Management System 

A Spring Boot + JPA based Hospital Management System.  
This project provides REST APIs for managing patients, doctors, appointments, departments, and insurance records.

## Features
- Manage patients, doctors, appointments, departments, insurance
- Admin can view paginated patient list
- Doctors can view their appointments
- Patients can view profile and book appointments
- Public endpoint to view all doctors

## Tech Stack
- **Backend:** Spring Boot 3.5.3, Spring Data JPA, Hibernate
- **Database:** MySQL
- **Build Tool:** Maven
- **Libraries:** Lombok, ModelMapper
- **IDE:** IntelliJ IDEA

## Setup Instructions
1. Clone the repository:
    git clone https://github.com/rishiraj426/Hospital-Management-System.git
2. Navigate to the project folder: 
    cd Hospital-Management-System   
3. Configure application.properties   
    spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
    spring.datasource.username=your_name
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=create
    spring.jpa.show-sql=true
    server.servlet.context-path=/api/v1
4. Run the application
    mvn spring-boot:run
5. Access APIs
    http://localhost:8080/api/v1/

## API Endpoints
**Admin**
 GET /api/v1/admin/patients?page=0&size=10 → Get paginated list of patients
**Doctor**
 GET /api/v1/doctors/appointments → Get all appointments of doctor (currently hardcoded doctorId=1)
**Patient**
 GET /api/v1/patients/profile → Get patient profile (currently hardcoded patientId=4)
 POST /api/v1/patients/appointments → Create new appointment
**Public**
 GET /api/v1/public/doctors → Get list of all doctors

## Project Structure
src/main/java/com/spring/tutorial/hospitalManagement
│── controller
│── service
│── repository
│── entity
│── dto
│── config
 
