package application.exercicio.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import application.exercicio.enums.WorkerLevel;

public class Worker {
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private Double baseSalary;
    private WorkerLevel level;
    private Department department;
    private List<HourContract> contract = new ArrayList<>();
    
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
        Integer month =  retornaNum(mesAno, 0);
        Double valorContract = this.baseSalary;
        Calendar cal = Calendar.getInstance();
        
        for (HourContract hourContract : contract) {
            cal.setTime(hourContract.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(c_year == year && c_month == month) {
                valorContract += hourContract.totalValue();
            }
        }
        return valorContract;
    }
    
    public Integer retornaNum(String n, int posicaoRetorno) {
        String[] arr = n.split("/");
        return Integer.valueOf(arr[posicaoRetorno]);
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: ");
        sb.append(this.name);
        sb.append("\nDepartment: ");
        sb.append(this.department.getName());
        
        return sb.toString();
    }
    
}
