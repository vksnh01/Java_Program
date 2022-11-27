import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<=*=*=*=*=*=*=*=*=*=*=*=*=*=*=MINI PROJECT=*=*=*=*=*=*=*=*=*=*=*=*=*=*=>\n");
        System.out.println("<*****************************MAIN MENU*****************************>");
        System.out.println("1.Basic Program");
        System.out.print("Enter A Value In The Above List: ");
        int choose = sc.nextInt();
        projectSwitch projectSwitchHandler = new projectSwitch();
        projectSwitchHandler.Project_Switch(choose);
        sc.close();
    }
}
