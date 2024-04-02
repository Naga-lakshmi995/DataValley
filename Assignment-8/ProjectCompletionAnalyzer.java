import java.util.*;

class Project {
    private String name;
    private int daysTaken;

    public Project(String name, int daysTaken) {
        this.name = name;
        this.daysTaken = daysTaken;
    }

    public String getName() {
        return name;
    }

    public int getDaysTaken() {
        return daysTaken;
    }
}

class Student {
    private String name;
    private List<Project> projects;

    public Student(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }
}

public class ProjectCompletionTracker {
    public static void main(String[] args) {
        // Sample student projects
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", Arrays.asList(new Project("Project A", 5), new Project("Project B", 7))));
        students.add(new Student("Alice", Arrays.asList(new Project("Project C", 3), new Project("Project D", 6))));

        // Calculate completion status and average time
        for (Student student : students) {
            int onTime = 0, late = 0, early = 0;
            int totalDays = 0;
            List<Project> projects = student.getProjects();
            for (Project project : projects) {
                int daysTaken = project.getDaysTaken();
                if (daysTaken <= 5)
                    onTime++;
                else if (daysTaken <= 7)
                    late++;
                else
                    early++;

                totalDays += daysTaken;
            }

            double avgTime = (double) totalDays / projects.size();

            System.out.println("Student: " + student.getName());
            System.out.println("On Time: " + onTime);
            System.out.println("Late: " + late);
            System.out.println("Early: " + early);
            System.out.println("Average Time: " + avgTime);
            System.out.println();
        }
    }
}
