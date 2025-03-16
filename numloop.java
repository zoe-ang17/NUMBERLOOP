import java.util.Scanner;

public class numloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NEXTLINE = System.lineSeparator();
        
        System.out.print("Counting numbers from 1 to 10." + NEXTLINE + "Enter 1 to start: ");
        String x = sc.next();
        
        int COUNT = 1;
        if (COUNT == 1) {
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i);

            if (i == 7) { 
                System.out.println("The number reached 7. Continue? (YES or NO):");
                String y = sc.next(); 

                if (y.equals("NO")) {
                    i = 0; 
                    System.out.println("Restarting count from 1...");
                } else if (!y.equals("YES")){

                }}}}}}