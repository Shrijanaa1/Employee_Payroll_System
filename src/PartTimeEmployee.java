class PartTimeEmployee extends Employee{
    private int workedHours;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int workedHours, double hourlyRate){
        super(name, id);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workedHours*hourlyRate;
    }
}
