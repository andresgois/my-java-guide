package application.exercicio.model;

import application.exercicio.enums.WorkerLevel;

public class Worker {
    
    private String name;
    private Double baseSalary;
    private WorkerLevel level;
    
    public Worker() {}

    public Worker(String name, Double baseSalary, WorkerLevel level) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    
}
