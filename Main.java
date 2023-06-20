package SMS.school.management.system;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Teacher Lizzy = new Teacher(1,"Lizzy",500);
        Teacher Melissa = new Teacher(2, "Melissa", 700);
        Teacher Vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(Vanderhorn);
        
        Student Natasha = new Student(1,"Natasha",5);
        Student John = new Student(2,"John",10);
        Student Rom = new Student(3,"Rom",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Natasha);
        studentList.add(John);
        studentList.add(Rom);

        School IHMA = new School(teacherList, studentList);
        Teacher nigga = new Teacher(6,"Nigga",467);
        IHMA.addTeacher(nigga);
        
        Natasha.payFees(5000);
        Rom.payFees(6000);
        System.out.println("IHMA has earned "+IHMA.getTotalMoneyEarned()+".");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("IHMA has paid "+Lizzy.getName()+" and now has "+IHMA.getTotalMoneyEarned()+".");
        System.out.println(Natasha);
        System.out.println(Lizzy);
    }
}
