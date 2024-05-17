class FullTimeEmployee extends Employee{
    private double monthlySalary;

    //Due to inheritance, variables of Employee class(name, id) can be used in constructor
    //To use parent/super class constructor we use super() method
    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
