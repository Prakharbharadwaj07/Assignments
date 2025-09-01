package assignment3;

public class EmpGroups {
	String[] employeenames = new String[3];
    int[] employeeids = new int[3];
    EmpGroups(Employees e) {
    	employeenames[0] = e.emp1Name;
    	employeeids[0] = e.emp1Id;
        employeenames[1] = e.emp2Name;
        employeeids[1] = e.emp2Id;
        employeenames[2] = e.emp3Name;
        employeeids[2] = e.emp3Id;
    }
    void printEmployees() {
        for(int i = 0; i < employeenames.length; i++) {
            System.out.println("Employee Name: " + employeenames[i] + ", Employee ID: " + employeeids[i]);
        }
    }
        
        public static void main(String[] args) {
            Employees employees = new Employees();
            EmpGroups groups = new EmpGroups(employees);
            groups.printEmployees();
        }
   

}
