import java.util.*;
import java.io.*;
import java.util.*;

/**
 * CSCI 221, Summer 2022, Programming HW3
 * Name: <Jalena Austin>
 * 
 * <SalaryLookUp>.java
 * 
 * This main class is used to run practice sample tests on the methods
 * of PlayerSalary and PlayerSalaries. Simple changes to each will alter
 * them.
 * 
 * Certification of Authentication:
 * I certify that this assignment is entirely my own work.
 */
public class SalaryLookUp
{   
    public static void main(String[] args) throws FileNotFoundException {
        // Holds the sample runs done for PlayerSalary and PlayerSalaries
        
        PlayerSalary onePlayer = new PlayerSalary(1986, "LAN", "NL", "niedeto01", 531250);
        PlayerSalary twoPlayer = new PlayerSalary(2014, "BOS", "AL", "rossda01", 3100000);
         
        System.out.println(onePlayer);
        System.out.println();
        System.out.println(twoPlayer);
        System.out.println();
        
        PlayerSalaries testRun = new PlayerSalaries("Salaries.csv");
        System.out.println("Average salary for a year: $" + testRun.averageSalaryInYear(2012));
        System.out.println();
        
        System.out.println("Player for chosen year");
        System.out.println(testRun.findPlayerInYear("howest01", 1992));
        System.out.println();
        
        System.out.println("Highest player salary for a year");
        System.out.println(testRun.highestSalaryInYear(1985));
        System.out.println();
        
        System.out.println("Lowest player salary for a year");
        System.out.println(testRun.lowestSalaryInYear(1985));
        System.out.println();
        
        System.out.println("Highest player salary for a year in a team");
        System.out.println(testRun.highestSalaryInTeamInYear("PIT", 1993));
        System.out.println();
        
        System.out.println("Lowest player salary for a year in a team");
        System.out.println(testRun.lowestSalaryInTeamInYear("PIT",1993));
        System.out.println();
        
        System.out.println("Highest player salary for a year in a league");
        System.out.println(testRun.highestSalaryInLeagueInYear("AL",1985));
        System.out.println();
        
        System.out.println("Lowest player salary for a year in a league");
        System.out.println(testRun.lowestSalaryInLeagueInYear("AL",1985));
        System.out.println();
        
        System.out.println("Comparison of two players, and returning the highest salary player for a year");
        System.out.println(testRun.comparePlayersInYear("hornebo01", "forstte01", 1985));
        System.out.println();
    }
}
