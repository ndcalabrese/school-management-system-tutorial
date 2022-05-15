package school.management.system;

/**
 * Created by Nick on 5/12/2022.
 * This class is responsible for keeping track of
 * the teacher's name, id, and salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher (int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return name of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return salary of the teacher
     */
    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    /**
     * Set the salary.
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salary.
     * Removes from the total money earned by the School
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name +
                "\nTotal salary earned so far: $" + salaryEarned;
    }
}
