abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //encapsulation: restrict direct access to variable
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    //abstract method
    public abstract double calculateSalary();

    //polymorphism
    //toString() is predefined java method
    @Override
    public String toString(){
        return "Employee[Name="+name+", Id="+id+", Salary="+calculateSalary()+"]";
    }

}
