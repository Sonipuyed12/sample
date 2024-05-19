package lambdaexpression;

import java.util.ArrayList;
import java.util.List;


//what is the avarage age of male and female employeee
public class Employee2 {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee2(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }




}




class TestEmployee3 {

    public static void main(String[] args) {


        List<Employee2> employeeList = new ArrayList<Employee2>();

        employeeList.add(new Employee2(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee2(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee2(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee2(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee2(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee2(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee2(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee2(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee2(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee2(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee2(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee2(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee2(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee2(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee2(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee2(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee2(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


//averahe of male and female
//        int sum1=0;
//        int sum2=0;
//        int cMale =0;
//        int cFemale=0;
//        for( Employee2 e:employeeList)
//        {
//            if(e.getGender()=="Female")
//            {
//                sum1=sum1+e.getAge();
//                cFemale++;
//
//
//            }
//else if(e.getGender()=="Male")
//       {
//           sum2=sum2+e.getAge();
//           cMale++;
//       }
//
//    }
//        double avgf=sum1/cFemale;
//        double avgm=sum2/cMale;
//        System.out.println(avgf);
//        System.out.println(avgm);
//}



        //get female
int countf=0;
int sum=0;

        for( Employee2 e:employeeList)
        {
            if(e.getGender()=="Female")
            {

              // sum=sum+e.getAge();//if there is integer present then we can do it very easly bt here strig is present thats why we have to count there sum by age
                countf++;
                System.out.println(e.getName());
            }
        }
        System.out.println(countf);

    }
}

