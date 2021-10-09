import jdk.jshell.SourceCodeAnalysis;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StopWatch {
    public static void main(String args[])
    {


        Scanner sc = new Scanner(System.in);


        System.out.println("Choose following option:");
        System.out.println("Enter 1: To start watch");
        System.out.println("Enter 2: To stop watch");
        LocalDateTime startTime=null;
        int option = sc.nextInt();

        if(option == 1) {
             startTime = LocalDateTime.now();
        }
        System.out.println("Stopwatch started. Enter 2 to stop it");
        int option1 = sc.nextInt();
        if(option1 == 2) {
            System.out.println("Stopwatch stopped");
            LocalDateTime endTime = LocalDateTime.now();
            Duration timeElapsed = Duration.between(startTime, endTime);

            System.out.println("Time taken: "+ timeElapsed.toSeconds() +" seconds");
        }
        }
    }

