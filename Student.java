package SMS.school.management.system;

/*Created by Byron Gillana
 * This class is responsible for keeping the
 * track of the students fees, name, grade and fees paid.
 */

public class Student{

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /* To create a new student by initializing
     * @param id id for the student: unique.
     * @param name - name of the student.
     * @param grade - grade of the student.
     * Fees for every student is $30,000 dollars.
     * Fees paid initially is 0.
     */

    public Student(int id, String name, int grade){

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter student's name, student's ID.
    /* Add the fees to feespaid
     * Subtract fees from feesTotal
     */

    public void setGrade(int grade){
        this.grade = grade;
    }

    /*Make the updateTotalMoneyEarned into static to interact with it. */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }

    /*Getter methods for the private instance fields. */

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    
    public int getFeesPaid() {
        return feesPaid;
    }
    
     public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString(){
        return "Student's name: "+name+". Total fees paid so far: $ "+feesPaid;
    }
}