# Smart Study Planner

A console-based Java application that helps students prioritize what they need to study each day. The application uses a weighted priority formula to prioritize subjects based on **difficulty, days left until exams, and credits** for each subject.

The planner allows you to create a list of subjects, view them ordered by their priority, and allocate study hours for the day. It calculates how many hours should be spent studying each subject based on its priority.

## Features

* Add subjects
* Remove subjects
* View the priority of all subjects
* Generate a daily study plan
* Allocate available study hours based on subject priority
* Input validation for menu options

## Priority Formula

The application calculates the urgency of each subject using:

```text
Urgency = 100 / (Days Left + 1)
```

The priority of a subject is calculated using:

```text
Priority = Difficulty² + Urgency + Credits^1.5
```

The available study hours are divided among the subjects in the ratio of each subject's priority to the sum of all priorities.

```text
Subject Study Hours =
(Subject Priority / Total Priority) × Available Study Hours
```

A higher priority means that the subject receives more study time.

## Requirements

* Java SE Development Kit (JDK), version 8 or newer

## Building the Project

You'll need the Java Development Kit (JDK) installed on your computer.

You can check whether Java is already installed by opening a terminal or command prompt and running:

```bash
java -version
javac -version
```

If both commands show a version number, you're ready to use the project.

If Java is not installed, you can download the JDK from:

* Windows: https://www.oracle.com/java/technologies/downloads/
* Adoptium: https://adoptium.net/
* macOS: https://brew.sh/
* Linux (Debian/Ubuntu): https://wiki.debian.org/Java

After installing the JDK, open a new terminal or command prompt and run the commands above again to verify the installation.

## Project Structure

```text
.
├── README.md
└── SmartStudyPlanner.java
```

The `SmartStudyPlanner.java` file contains the main application and the `Subject` class.

## Setup

1.Fork/Clone this repo
2.Open a terminal/command prompt window and change to the project directory:

cd path/to/project-folder

There's no need to install any dependencies or set up any environment variables because this project only requires the standard Java library (java.util)


## Compile

To compile the source code, run:

```bash
javac SmartStudyPlanner.java
```

This will generate the required `.class` files in the same directory.

For example:

```text
SmartStudyPlanner.class
Subject.class
```

This is normal because the source code contains multiple classes.

## Run

To run the application, execute:

```bash
java SmartStudyPlanner
```

You should see the following menu in your terminal or command prompt:

```text
===== SMART STUDY PLANNER =====
1. Add Subject
2. Remove Subject
3. View Priority Ranking
4. Generate Today's Study Plan (allocate hours)
5. Exit
Enter choice:
```

## Usage

### 1. Add Subject

Select option `1` to add a subject.

You will be prompted to enter:

* Subject name
* Difficulty from 1–10
* Number of days left until the exam
* Credits from 1–10

Example:

```text
Enter choice: 1
Subject name: DSA
Difficulty (1-10): 8
Days left for exam: 5
Credits (1-10): 4
```

### 2. Remove Subject

Select option `2` and enter the name of the subject you want to remove.

Example:

```text
Enter choice: 2
Enter subject name to remove: DBMS
```

### 3. View Priority Ranking

Select option `3` to view all subjects along with their calculated priority.

The subjects are displayed according to their priority, with the highest-priority subject appearing first.

### 4. Generate Today's Study Plan

Select option `4` and enter the total number of hours you have available for studying that day.

Example:

```text
Enter choice: 4
Total hours available to study today: 6
```

The application will calculate the priority of each subject and distribute the available 6 hours among the subjects according to their priorities.

### 5. Exit

Select option `5` to exit the application.

## Example

```text
===== SMART STUDY PLANNER =====
1. Add Subject
2. Remove Subject
3. View Priority Ranking
4. Generate Today's Study Plan (allocate hours)
5. Exit

Enter choice: 1
Subject name: DSA
Difficulty (1-10): 8
Days left for exam: 5
Credits (1-10): 4

Enter choice: 1
Subject name: DBMS
Difficulty (1-10): 5
Days left for exam: 10
Credits (1-10): 3

Enter choice: 3

===== PRIORITY RANKING =====
DSA   - Priority: 88.67
DBMS  - Priority: 56.56

Enter choice: 4
Total hours available to study today: 6

===== TODAY'S STUDY PLAN =====
DSA  - Study for approximately 3.82 hours
DBMS - Study for approximately 2.18 hours
```

The exact study-hour allocation depends on the calculated priority of each subject.

## Notes

* All subject data is stored in memory.
* Data will be lost when the application is closed.
* No database is required.
* No networking or API keys are required.
* No external libraries are required.
* The project can be run using JDK 8 or newer.
* The application is designed as a simple console-based Java project for learning and educational purposes.

