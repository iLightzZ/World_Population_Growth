//Exeercise 4.40: Pg 215 (Java 11th Edition)
//World Population Growth
import java.util.Scanner;

public class World_Population_Growth
{
  public static void main(String[] args)
  {
    //create a Scanner object to access its methods
    Scanner input = new Scanner(System.in);
    
    System.out.printf("%s%n%n%s%n%n", 
    "\t\t\t\t\t~World Population Growth~",
    "The following program will calculate the world's population growth each year for the next 75 years.");
    
    long population = 7_828_280_735L; //Population as of November 27th 2020
    long populationDup = 7_828_280_735L; //population duplicate to aid in calculating the growth
    double rate = 0.0105; //1.05% growth rate as of 2020
    
    System.out.printf("Current world population (as of 2020, NOV 27): %,d%n", population);
    
    String start;
    System.out.print("Enter anything to start: ");
    start = input.nextLine();
    
    System.out.printf("%s%15s%n%n", "Year", "Population");
    
    for(int count = 1; count <= 75; ++count)
    {
      populationDup *= rate;
      population += populationDup;
      System.out.printf("%d%,21d%n", count, population);
      populationDup = population;
    }
  }//end main
}//end class