package src.Day39_EncapsulationAndInheritancePractice.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");
    }
    /*
    Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
     */
}
