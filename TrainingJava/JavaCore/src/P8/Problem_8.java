package P8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_8 {

    public static List<String> studentNames = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("------------------------------");
            System.out.println("0. Exit");
            System.out.println("1. Add student name to list");
            System.out.println("2. Show all student name in list");
            System.out.println("3. Delete student name in list");
            System.out.print(">: ");
                choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 0:
                    System.out.println("Exit!");
                    break;
                case 1:
                    System.out.print("Enter student name: ");
                    studentNames.add(scanner.nextLine());
                    break;
                case 2:
                    if (studentNames.size()==0) {
                        System.out.println("Student list is empty!");
                    }else {
                        System.out.println("Student list: ");
                        for (String studentName : studentNames) {
                            System.out.println(studentName);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    if (!studentNames.contains(studentName)){
                        System.out.println("Student name is not exit!");
                    }else{
                        studentNames.removeIf(s -> s.equals(studentName));
                    }
                     break;
                default:
                    System.out.println("Invalid! Please enter a valid value");
            }
        }while(choose != 0);
    }

}
