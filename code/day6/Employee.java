import java.time.LocalDate;

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDate;
    //获取员工的信息
    public Employee(String n, double s,int year,int month,int day)
    {
        name=n;
        salary=s;
        hireDate=LocalDate.of(year,month,day);
    }
    public double getSalary()
    {
        return salary;
    }
    public  LocalDate getHireDate()
    {
        return hireDate;
    }
    public  String getName()
    {
        return name;
    }

    public double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        return salary;
   }
}
