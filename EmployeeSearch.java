import java.util.Scanner;
class Employee
{
private int eNo;
private String eName;
private double eSalary;
public Employee(int eNo,String eName,double eSalary)
{
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
public int getENo()
{
return eNo;
}
public String getEName()
{
return eName;
}
public double getESalary()
{
return eSalary;
}
}
public class EmployeeSearch
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number of employees:");
int n=scanner.nextInt();
Employee[] employees=new Employee[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter details for employee"+(i+1)+":");
System.out.print("Employee number:");
int eNo=scanner.nextInt();
scanner.nextLine();
System.out.print("Employee name:");
String eName=scanner.nextLine();
System.out.print("Employee salary:");
double eSalary=scanner.nextDouble();
employees[i]=new Employee(eNo,eName,eSalary);
}
System.out.print("Enter the employee number to search:");
int searchENo=scanner.nextInt();
boolean found=false;
for(Employee emp:employees)
{
if(emp.getENo()==searchENo)
{
found=true;
System.out.println("Employee found:");
System.out.println("Employee number:"+emp.getENo());
System.out.println("Employee name:"+emp.getEName());
System.out.println("Employee salary:"+emp.getESalary());
break;
}
}
if(!found)
{
System.out.println("Employee not found!");
}
scanner.close();
}
}

