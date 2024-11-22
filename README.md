# School Management System - README

## Overview
This project is a simple Java application for managing a school's teachers and students. It provides functionality to add, remove, and display lists of students and teachers, along with their details such as names, grades, subjects, and more.

## Structure
The project consists of three primary classes:
1. **`School`**:
   - Represents a school with attributes such as name, city, total classes, and lists of students and teachers.
   - Provides methods to add, remove, and display students and teachers.
2. **`Student`**:
   - Represents a student with attributes like first name, last name, grade, and student number.
   - Includes getters and setters for managing student details.
3. **`Teacher`**:
   - Represents a teacher with attributes like first name, last name, and the subject they teach.
   - Includes getters and setters for managing teacher details.

## Features
- Add students or teachers to the school.
- Remove students or teachers by their index in the respective lists.
- Display lists of students and teachers with readable details.
- Create and manage custom student and teacher objects.

## How It Works
The **`Main`** class demonstrates the functionality:
1. A `School` object is initialized with its name, city, and number of classes.
2. Ten `Student` objects and three `Teacher` objects are created and added to the school.
3. The current lists of students and teachers are displayed.
4. Two students and one teacher are removed from their respective lists.
5. Updated lists are displayed.

## Running the Application
1. Compile all `.java` files using a Java compiler:
   ```bash
   javac Main.java School.java Student.java Teacher.java
   ```
2. Run the program:
   ```bash
   java Main
   ```

## Example Output
The program prints the lists of students and teachers before and after removals, showcasing the updates in real-time.

## Future Enhancements
- Add functionality to search for students or teachers by name or other attributes.
- Include error handling for invalid indices when removing items.
- Implement file-based persistence for saving and loading school data.

Enjoy managing your school's data with this simple and effective system!
