package SMS.school.management.system;

/*
 * Created by Byron Gillana on 6/11/23.
 * This class is responsible for keeping the track of teacher's name, id, and salary.
 */

public class Teacher {
    
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /*
     * Createas a new Teacher object.
     * @param id for id of teacher.
     * @param name for name of teacher.
     * @param salary for salary of teacher.
     */


    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /*
     * Getter methods for id, name and salary of teacher.
     */

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }

    /* Setter method for the salary. */

    public void setSalary(int salary){
        this.salary = salary;
    }

    /*Adds to salary.
     * Removes from the total money earned by the school.
     * Adds to the total money spent by the school.
     */
    public void receiveSalary(int salary){
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString(){
        return "Teacher's name: "+name+". Total salary earned so far: $"+salaryEarned;
    }

    

}
