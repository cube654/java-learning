public class EmployeeTest
{
    public  static void main(String[] args)
    {
        Employee[]staff=new Employee[3];

        staff[0]=new Employee("taozheng",10000,2004,7,23);
        staff[1]=new Employee("wenjian",10000,2004,7,23);
        staff[2]=new Employee("pengwenju",15000,2004,12,24);

        for (int i=0;i<staff.length;i++)
        {
            staff[i].raiseSalary(5.0);
        }
        for (int i=0;i<staff.length;i++)
            System.out.println("name="+staff[i].getName()+",salary="+staff[i].getSalary()+",hireDay="+staff[i].getHireDate());
    }
}
