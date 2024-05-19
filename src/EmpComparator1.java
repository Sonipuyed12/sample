import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpComparator1 {

    private String firstName;
    private String lastName;

    private  int id;

    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public EmpComparator1(String firstName, String lastName, int id, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "EmpComparator1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

class FirstnameComparator implements Comparator<EmpComparator1>
{
    @Override
    public int compare(EmpComparator1 o1, EmpComparator1 o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class Test1
{
    public static void main(String[] args) {
        List<EmpComparator1> list=new ArrayList<>();

        list.add(new EmpComparator1("soni","puyed",24,25000));
        list.add(new EmpComparator1("ohubham","more",30,30000));
        list.add(new EmpComparator1("pneha","jadhav",26,35000));
        list.add(new EmpComparator1("nujata","karale",25,50000));

        //Collections.sort(list);//this will not be get sorted becoz it will gwt confuse on which basis to do sorting

        FirstnameComparator f=new FirstnameComparator();

        Collections.sort(list,f);

        for(EmpComparator1 o:list)
        {
            System.out.println(o);
        }








    }
}
