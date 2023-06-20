package SMS.school.management.system;

import java.util.List;

/*
 * Created by BJ Gillana on 6/11/23.
 * The school can have many teachers and many students.
 * Implement teachers and students using arraylists.
 */
public class School {
    
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /*
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent=0;
    }

    /*Return list of teachers. */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /*Add teacher to the school. */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /*Return list of students. */
    public List<Student> getStudents() {
        return students;
    }

    /*Add student to the school. */
    public void addStudent(Student student) {
        students.add(student);
    }

    //Return total money earned by the school.
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //Add money earned to the total money earned by the school.
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned+=MoneyEarned;
    }

    //Return total money spent by the school.
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /*
     * Update the money that is spent by the school which is the salary 
     * given by the school to its teachers.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
        totalMoneySpent += moneySpent;
    }
}
