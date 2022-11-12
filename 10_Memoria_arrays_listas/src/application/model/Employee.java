package application.model;

public class Employee {
    
    private Integer id;
    private String name;
    private Double salary;
    
    public Employee() {}

    public Employee(Integer id, String name, Double salary) {
        setId(id);;
        setName(name);
        setSalary(salary);
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void incrementById(int id, double percent) {
        
    }
    public void incrementSalary(double value) {
        this.salary += (this.salary * value) / 100.0;
    }
    @Override
    public String toString() {
        return this.getId()+", "
                +this.getName()+", "
                +String.format("%.2f", this.getSalary());
    }
    
    
}
