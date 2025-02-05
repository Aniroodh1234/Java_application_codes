class Employee{
    public int id;
    public String name;
    public int salary;

    public void getDetails(){
        System.out.print("\nEmployee id is "+id);
        System.out.print("\nEmployee name is "+name);
        System.out.print("\nEmployee salary is "+salary);
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class Own_Class{
    public static void main(String[]args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.id = 1;
        emp1.name = "Aniroodh";
        emp1.salary = 100000;
        emp2.id = 2;
        emp2.name = "Abhighyan";
        emp2.salary = 50000;

        emp1.getDetails();
        emp2.getDetails();
        emp2.setName("Shayan");
        System.out.print("\nemployee name is " +emp2.getName());


    }
}