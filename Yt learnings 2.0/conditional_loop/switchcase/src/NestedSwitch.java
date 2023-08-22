
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Employee id");
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("OM M PATEL");

            switch (department) {
                case "IT":
                    System.out.println("IT department");
                case "Mgm":
                    System.out.println("Management department");
                default:
                    System.out.println("Enter Valid Department");
            }

            case 2:
                System.out.println("Krishna S Patel");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                    case "Mgm":
                        System.out.println("Management department");
                    default:
                        System.out.println("Enter Valid Department");
                }
                break;
            case 3:
                System.out.println("Sneh A Solanki");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                    case "Mgm":
                        System.out.println("Management department");
                    default:
                        System.out.println("Enter Valid Department");
                }
                break;
            case 4:
                System.out.println("Nauman Z Patel");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                    case "Mgm":
                        System.out.println("Management department");
                    default:
                        System.out.println("Enter Valid Department");
                }
                break;
            case 5:
                System.out.println("Meet Prajapati");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                    case "Mgm":
                        System.out.println("Management department");
                    default:
                        System.out.println("Enter Valid Department");
                }
                break;
            default:
                System.out.println("Enter Valid Department");
        }


    }
}
