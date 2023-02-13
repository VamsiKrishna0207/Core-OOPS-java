public class constructor {
    int employeId;
    int salary;
    String dept;
    constructor(int empId,int sal,String d){
        employeId=empId;
        salary=sal;
        dept=d;
    }

    public static void main(String[] args) {
        constructor harsha=new constructor(101,300,"testing");
        constructor varsha=new constructor(123,6777,"enginerring");
        System.out.println(harsha.employeId + "salary"+ harsha.salary + " dept" +harsha.dept);
        System.out.println(varsha.employeId + "salary"+ varsha.salary + " dept" +varsha.dept);
    }
}
