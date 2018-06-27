package P10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_10 {

    public static List<Employee> employees = new ArrayList<>();
    public static List<Department> departments = new ArrayList<>();

    public static void addEmployee(Scanner scanner){
        Employee e = new Employee();
        System.out.println("ID: " + employees.size()); e.setId(employees.size()+"");
        System.out.print("NAME: "); e.setName(scanner.nextLine());
        System.out.print("DESCRIPTION: "); e.setDescription(scanner.nextLine());
        System.out.print("DEPARTMENT ID: "); String idDep = scanner.nextLine();
        for(Department dep : departments){
            if(dep.getId().equals(idDep)){
                e.setDep(dep);
            }
        }
        if (e.getDep()==null){
            System.out.println("Department ID is not exit!");
        } else{
            employees.add(e);
        }
   }

    public static void addDepartment(Scanner scanner){
        Department d = new Department();
        System.out.println("ID: " + departments.size()); d.setId(departments.size()+"");
        System.out.print("NAME: "); d.setName(scanner.nextLine());
        System.out.print("DESCRIPTION: "); d.setDescription(scanner.nextLine());
        departments.add(d);
    }

    public static void readEmployee(String id){
        int i =0;
            for (Employee e : employees) {
                if (e.getId().equals(id)) {
                    System.out.println("NAME: " + e.getName());
                    System.out.println("ID: " + e.getId());
                    System.out.println("DESCRIPTION: " + e.getDescription());
                    System.out.println("DEPARTMENT: " + e.getDep().getId());
                    i++;
                }
            }
        if (i==0){
                System.out.println("Employee Id is not exit!");
        }
    }

    public static void readDepartment(String id){
        int i=0;
            for (Department d : departments) {
                if (d.getId().equals(id)) {
                    System.out.println("ID: " + d.getId());
                    System.out.println("NAME: " + d.getName());
                    System.out.println("DESCRIPTION: " + d.getDescription());
                    i++;
                }
            }
        if (i==0)
            System.out.println("Department ID is not exit!");
    }

    public static void deleteEmployee(String id){
        employees.removeIf(e -> e.getId().equals(id));
    }

    public static void deleteDepartment(String id){
        employees.removeIf(e -> e.getDep().getId().equals(id));
        departments.removeIf(d -> d.getId().equals(id));
    }

    public static void showAll(String id){
        int i=0;
        for(Employee e : employees){
            if(e.getDep().getId().equals(id)){
                System.out.println("NAME: " + e.getName());
                System.out.println("ID: " + e.getId());
                System.out.println("DESCRIPTION: " + e.getDescription());
                System.out.println("DEPARTMENT: " + e.getDep().getId());
                i++;
            }
        }
        if (i==0)
            System.out.println("This department don't have employee!");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do{
            System.out.println("-----------------------------");
            System.out.println("0. Exit");
            System.out.println("1. Add employee");
            System.out.println("2. Read employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Add department");
            System.out.println("5. Read department");
            System.out.println("6. Delete department");
            System.out.println("7. Show all employee of a department");
            System.out.print("> ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 0:
                    System.out.println("Exit!");
                    break;
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    System.out.print("Enter employee id: ");
                    readEmployee(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter employee id: ");
                    deleteEmployee(scanner.nextLine());
                    break;
                case 4:
                    addDepartment(scanner);
                    break;
                case 5:
                    System.out.print("Enter department id: ");
                    readDepartment(scanner.nextLine());
                    break;
                case 6:
                    System.out.print("Enter department id: ");
                    deleteDepartment(scanner.nextLine());
                    break;
                case 7:
                    System.out.print("Enter department id: ");
                    showAll(scanner.nextLine());
                    break;
                default:
                    System.out.println("Invalid! Please enter a valid value");
            }
        }while(choose != 0);
    }

}