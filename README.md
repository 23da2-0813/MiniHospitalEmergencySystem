# Mini Hospital Emergency Management System

## CIT300 - Data Structures and Algorithms

### Project Title

**Mini Hospital Emergency Management System Using Data Structures**

---

## 1. Introduction

The Mini Hospital Emergency Management System is a Java-based console application developed for the CIT300 Data Structures and Algorithms assignment.

The purpose of this system is to simulate the management of patients in a hospital emergency department. The system allows hospital staff to register patients, search and delete patient records, manage emergency patients, store completed treatment records, and maintain patient visit histories.

Four different data structures are used in the system:

* Binary Search Tree (BST)
* Queue
* Stack
* Singly Linked List

Each data structure is used for a specific purpose in the hospital management system.

---

## 2. Objectives

The main objectives of this project are:

* To implement a Binary Search Tree for storing patient records.
* To implement a Queue for managing emergency patients.
* To implement a Stack for storing completed treatment records.
* To implement a Singly Linked List for storing patient visit history.
* To demonstrate important data structure operations using Java.
* To develop and test a complete menu-driven hospital management system.

---

## 3. Data Structures Used

### 3.1 Binary Search Tree (BST)

The Binary Search Tree is used to store patient records.

The **Patient ID** is used as the key.

Operations implemented:

* Insert a patient
* Search for a patient
* Delete a patient
* Display all patients using in-order traversal

The in-order traversal displays patients in ascending order of Patient ID.

---

### 3.2 Queue

The Queue is used to manage patients waiting for emergency treatment.

The Queue follows the:

**FIFO - First-In, First-Out**

principle.

Operations implemented:

* Enqueue a patient
* Dequeue the next patient
* Display all waiting patients
* Handle an empty queue

The patient who enters the emergency queue first is treated first.

---

### 3.3 Stack

The Stack is used to store completed treatment records.

The Stack follows the:

**LIFO - Last-In, First-Out**

principle.

Operations implemented:

* Push a completed treatment record
* Pop the most recently completed treatment
* Display treatment records
* Handle an empty stack

The most recently completed treatment record is removed first.

---

### 3.4 Singly Linked List

A Singly Linked List is used to maintain the previous hospital visits of each patient.

Each visit contains information such as:

* Visit ID
* Visit Date
* Doctor Name
* Diagnosis
* Treatment

Operations implemented:

* Add a new visit
* Remove a visit
* Search for a visit
* Display visit history

---

## 4. System Features

The system provides the following main features:

### Patient Management

* Register a new patient
* Search for a patient by Patient ID
* Delete a patient
* Display all patients in ascending Patient ID order

### Emergency Queue Management

* Add a patient to the emergency queue
* Treat the next patient
* Display patients currently waiting
* Handle an empty queue

### Treatment Management

* Add completed treatment records
* Display treatment history
* Remove the most recent treatment record
* Handle an empty treatment stack

### Patient Visit History

* Add patient visits
* Search patient visits
* Remove patient visits
* Display patient visit history

---

## 5. Project Structure

```text
MiniHospitalEmergencySystem
│
├── Patient.java
├── PatientBST.java
├── EmergencyQueue.java
├── TreatmentRecord.java
├── TreatmentStack.java
├── Visit.java
├── VisitHistory.java
├── HospitalSystem.java
└── README.md
```

---

## 6. Description of Java Classes

### Patient.java

Stores the main information about a patient:

* Patient ID
* Patient Name
* Age
* Contact Number
* Medical Condition

### PatientBST.java

Implements the Binary Search Tree used to store patient records.

### EmergencyQueue.java

Implements the emergency patient waiting Queue using FIFO.

### TreatmentRecord.java

Stores information about a completed patient treatment.

### TreatmentStack.java

Implements the Stack used to store completed treatment records using LIFO.

### Visit.java

Stores information about a patient's hospital visit.

### VisitHistory.java

Implements the Singly Linked List used to maintain patient visit history.

### HospitalSystem.java

The main class of the application.

It contains the `main()` method and provides the menu-driven interface that connects all four data structures.

---

## 7. Main Menu

The application provides the following menu:

```text
============================================
     MINI HOSPITAL EMERGENCY SYSTEM
============================================
1. Register New Patient
2. Search Patient
3. Delete Patient
4. Display All Patients
5. Add Emergency Patient
6. Treat Next Patient
7. Display Waiting Queue
8. Complete Treatment
9. View Treatment History
10. Add Patient Visit
11. Remove Patient Visit
12. Search Patient Visit
13. Display Patient Visit History
0. Exit
============================================
```

---

## 8. How to Run the Project

### Step 1: Open the project folder

Open the `MiniHospitalEmergencySystem` folder in a Java IDE such as Visual Studio Code, IntelliJ IDEA, Eclipse, or NetBeans.

### Step 2: Open the terminal

Make sure the terminal is inside the project folder.

### Step 3: Compile the Java files

Run:

```bash
javac *.java
```

### Step 4: Run the main program

Run:

```bash
java HospitalSystem
```

### Important

`HospitalSystem.java` is the main class and contains the `main()` method.

The other classes are supporting classes and should not be run individually.

---

## 9. Example Testing

### BST Testing

Patients can be inserted using different Patient IDs.

Example:

```text
105 - Ahmed
102 - Fatima
110 - Mohamed
```

When the in-order traversal is performed, the output should be:

```text
102 - Fatima
105 - Ahmed
110 - Mohamed
```

This demonstrates that the BST correctly stores and displays patients in ascending Patient ID order.

### Queue Testing

Example:

```text
Patient 105 enters queue
Patient 110 enters queue
```

The queue becomes:

```text
105 -> 110
```

Patient 105 is treated first.

This demonstrates FIFO.

### Stack Testing

Example:

```text
Treatment 1
Treatment 2
```

Treatment 2 is removed first.

This demonstrates LIFO.

### Linked List Testing

Example patient visit history:

```text
Visit 1
Visit 2
Visit 3
```

The system can:

* Add a visit
* Search a visit
* Remove a visit
* Display the complete visit history

---

## 10. Technologies Used

* Java
* Data Structures and Algorithms
* Visual Studio Code / Java IDE
* Git
* GitHub

---

## 11. GitHub Development History

The project is developed using multiple meaningful commits to demonstrate the development process.

Example commits:

```text
Created project structure 
Implemented Patient class and BST
Added BST search and deletion
Implemented emergency queue
Implemented treatment stack
Implemented patient visit linked list
Added main hospital system
Added testing
Updated README
```

The project should be maintained in the student's own GitHub repository with progressive development commits.

---

## 12. Testing

The following operations were tested:

### Binary Search Tree

* Patient insertion
* Patient search
* Patient deletion
* In-order traversal

### Queue

* Enqueue
* Dequeue
* Display waiting patients
* Empty queue handling

### Stack

* Push
* Pop
* Display treatment history
* Empty stack handling

### Singly Linked List

* Add visit
* Search visit
* Remove visit
* Display visit history

---

## 13. Conclusion

The Mini Hospital Emergency Management System demonstrates the practical use of important data structures in a real-world hospital scenario.

The Binary Search Tree provides an organized way to manage patient records. The Queue manages emergency patients according to the FIFO principle. The Stack stores completed treatments according to the LIFO principle. The Singly Linked List maintains each patient's previous visit history.

Through this project, the implementation and practical application of data structures in Java are demonstrated.

---

## 14. Author

**Name:** [Samrootha]

**Student ID:** [23Da2-0813]

**Module:** CIT300 - Data Structures and Algorithms

**Assignment:** Individual Mid Assignment

**GitHub Repository:** [https://github.com/23da2-0813/MiniHospitalEmergencySystem.git]
