import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Subject {
String name;
int difficulty; 
int daysLeft;     
int credits;     
double priorityScore;
double allocatedHours;

public Subject(String name, int difficulty, int daysLeft, int credits) {
this.name = name;
this.difficulty = difficulty;
this.daysLeft = daysLeft;
this.credits = credits;
calculatePriority();
}

public void calculatePriority() {
double urgency = 100.0 / (daysLeft + 1);
this.priorityScore = (difficulty  2) + urgency + (credits * 1.5);
}

public void display() {
System.out.printf("%-15s | Difficulty: %-2d | Days Left: %-3d | Credits: %-2d | Priority: %-6.2f | Study Today: %.2f hrs%n",
name, difficulty, daysLeft, credits, priorityScore, allocatedHours);
}
}

class StudyPlanner {
private ArrayList subjects = new ArrayList<>();

public void addSubject(String name, int difficulty, int daysLeft, int credits) {
subjects.add(new Subject(name, difficulty, daysLeft, credits));
System.out.println("Subject added: " + name);
}

public void removeSubject(String name) {
boolean removed = subjects.removeIf(s -> s.name.equalsIgnoreCase(name));
System.out.println(removed ? "Removed: " + name : "Subject not found.");
}

public void viewRanking() {
if (subjects.isEmpty()) {
System.out.println("No subjects added yet.");
return;
}
ArrayList sorted = new ArrayList<>(subjects);
sorted.sort(Comparator.comparingDouble((Subject s) -> s.priorityScore).reversed());
System.out.println("\n--- SUBJECTS RANKED BY PRIORITY (highest first) ---");
for (Subject s : sorted) s.display();
}

public void allocateHours(double totalHours) {
if (subjects.isEmpty()) {
System.out.println("No subjects to allocate hours to.");
return;
}
double totalPriority = 0;
for (Subject s : subjects) totalPriority += s.priorityScore;

for (Subject s : subjects) {
s.allocatedHours = (s.priorityScore / totalPriority) * totalHours;
}
System.out.println("\n--- TODAY'S STUDY PLAN (Total: " + totalHours + " hrs) ---");
viewRanking();
}
}

public class SmartStudyPlanner {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
StudyPlanner planner = new StudyPlanner();
int choice;

do {
System.out.println("\n===== SMART STUDY PLANNER =====");
System.out.println("1. Add Subject");
System.out.println("2. Remove Subject");
System.out.println("3. View Priority Ranking");
System.out.println("4. Generate Today's Study Plan (allocate hours)");
System.out.println("5. Exit");
System.out.print("Enter choice: ");

while (!sc.hasNextInt()) {
System.out.println("Invalid input. Enter a number.");
sc.next();
}
choice = sc.nextInt();
sc.nextLine();

switch (choice) {
case 1:
System.out.print("Subject name: ");
String name = sc.nextLine();
System.out.print("Difficulty (1-10): ");
int diff = sc.nextInt();
System.out.print("Days left for exam: ");
int days = sc.nextInt();
System.out.print("Credits (1-10): ");
int credits = sc.nextInt();
sc.nextLine();
planner.addSubject(name, diff, days, credits);
break;
case 2:
System.out.print("Subject name to remove: ");
String remName = sc.nextLine();
planner.removeSubject(remName);
break;
case 3:
planner.viewRanking();
break;
case 4:
System.out.print("Total hours available to study today: ");
double hours = sc.nextDouble();
planner.allocateHours(hours);
break;
case 5:
System.out.println("Exiting... Good luck with your studies!");
break;
default:
System.out.println("Invalid choice. Try again.");
}
} while (choice != 5);

sc.close();
}
}
