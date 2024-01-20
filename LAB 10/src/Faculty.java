import java.util.ArrayList;

@DevelopmentHistory(version = 10, developer = "Adid", tester = "Alvee")
@DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 10, developer = "Adid", tester = "Alvee"), reviewers = {"Ab", "Bc", "Cd"})
public class Faculty {
    String name;
    String designation;
    Double salary;
    ArrayList<Course> courseList;

    public Faculty(String name, String designation, Double salary, ArrayList<Course> courseList) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courseList = courseList;
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 12, developer = "Adid2", tester = "Alvee2"), reviewers = {"Ab2", "Bc2", "Cd2"})
    public Faculty(String name, String designation, Double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 11, developer = "Adid1", tester = "Alvee1"), reviewers = {"Ab1", "Bc1", "Cd1"})
    void teach(Course course){
        System.out.println(name + " is taking class of " + course.getName());
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 13, developer = "Adid3", tester = "Alvee3"), reviewers = {"Ab3", "Bc3", "Cd3"})
    void research(String topic){
        System.out.println(name + " is conducting research on the topic " + topic);
    }
}
