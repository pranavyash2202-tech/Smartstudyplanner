# Smartstudyplanner


Smart Study Planner--

A console based java application which helps students to prioritize what they need to study each day. This uses a weighted priority formula to prioritize subjects based on difficulty, days left till exams, and credits for each subject. This planner allows you create a list of your subjects, and then gives an option to view those subjects ordered by their priority (based on the weighted formula). It also allows you to allocate hours for studying for the day and calculates how many hours should be spent studying for each subject based on their priority.

Features
•Add/remove subjects

•View the priorities of all subjects

•Allocate hours for the day and see how many hours should be spent on each subject

•Input validation for menu options

Priority Formula---

urgency = 100/(daysLeft+1) priority = difficulty2 + urgency + credits1.5 The hours are divided among the subjects in the ratio of the priority of each subject to the sum of all priorities.

Requirements--

Java SE Development Kit (JDK), version 8 or newer
Building the Project
You'll need the Java SE Development Kit (JDK) installed on your computer. You can check if you already have it installed by opening a terminal/command prompt and running the following commands:

java -version
javac -version
If both commands show a version number, you're all set. If not, you'll need to install the JDK.

Installing the JDK--

If you don't have the JDK installed, you can download it from the following links:

•Windows: https://www.oracle.com/java/technologies/downloads/ or https://adoptium.net/
•macOS: https://brew.sh/
•Linux (Debian/Ubuntu): https://wiki.debian.org/Java Once you've installed the JDK, you'll need to open a new terminal/command prompt and run the same commands as before to verify that the installation was successful.

Project Structure--
.
├── README.md
└── SmartStudyPlanner.java
Setup--

Fork/Clone this repo
Open a terminal/command prompt window and change to the project directory:
cd path/to/project-folder
There's no need to install any dependencies or set up any environment variables because this project only requires the standard Java library (java.util).

Compile--

To compile the source code simply run:

javac SmartStudyPlanner.java
This will generate two .class files in the same directory as the source code (SmartStudyPlanner.class and Subject.class). This is normal as the source code defines multiple classes.

Run--

To run the app execute the following command:

java SmartStudyPlanner
You should now see the following menu in your terminal/command prompt:

===== SMART STUDY PLANNER =====
1. Add Subject
2. Remove Subject
3. View Priority Ranking
4. Generate Today's Study Plan (allocate hours)
5. Exit
Enter choice:
Usage
Add Subject : You will be prompted to enter the name of the subject, its difficulty (1-10) the number of days left till the exam, and its credits (1-10).

View Priority Ranking : This will display all the subjects along with their priority.

Generate Today's Study Plan (allocate hours) : Enter the number of hours you have for studying for the day and the application will display how many hours you should spend studying for each subject.

Remove Subject : Enter the name of the subject you wish to remove.

Exit : Exits the application.

Example--

•Enter choice: 1
•Subject name: DSA
•Difficulty (1-10): 8
•Days left for exam: 5
•Credits (1-10): 4
•Enter choice: 1
•Subject name: DBMS
•Difficulty (1-10): 5
•Days left for exam: 10
•Credits (1-10): 3
•Enter choice: 4
•Total hours available to study today: 6

The output will be the priority of each subject followed by the number of hours to spend on each subject out of the 6 hours allocated for the day.

Notes--
All the data will be stored in memory so it will be lost when the application is closed.
No networking or API keys are required.
