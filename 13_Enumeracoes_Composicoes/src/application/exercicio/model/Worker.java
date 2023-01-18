package application.exercicio.model;

import java.util.List;

import application.exercicio.enums.WorkerLevel;

public class Worker {
    
    private String name;
    private Double baseSalary;
    private WorkerLevel level;
    private Department department;
    private List<HourContract> contract;
    
    public Worker() {}

    

    public Worker(String name, Double baseSalary, WorkerLevel level,
            Department department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public void addContract(HourContract contract) {
        this.contract.add(contract);
    }
    public void removeContract(HourContract contract) {
        this.contract.remove(contract);
    }
    
    public Double income(String mesAno) {
        Integer year = retornaNum(mesAno, 1);
        Integer month =  retornaNum(mesAno, 2);
        Double valorContract = 0.0;
        for (HourContract hourContract : contract) {
            if(hourContract.getDate().getYear() == year && (hourContract.getDate().getMonth()+1) == month) {
                valorContract += hourContract.getValuePerHour();
            }
        }
        
        return valorContract;
    }
    
    public Integer retornaNum(String n, int posicaoRetorno) {
        String[] arr = n.split("/");
        return Integer.valueOf(arr[posicaoRetorno]);
    }
    
}
