import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public  static ArrayList<Race> winners = new ArrayList<Race>();
    /** This arraylist contains Race objects and takes
     its data from a csv file **/

    public static ArrayList<String> years=new ArrayList<>();
    /** This arraylist contains the year value from the
     csv file so that the user input for year can be checked **/

    public static ArrayList<String> grand_prix=new ArrayList<>();
    /** This arraylist contains the place the
     races were held (circuit value from the csv file) so that the user input for grand_prix can be checked **/


    static String path="C:/Users/athin/IdeaProjects/GP_Winner/gp_winners.csv";
    static String line="";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Race race = new Race(values[0], values[1], values[2], values[3]);
                winners.add(race);
                years.add(values[0]);
                grand_prix.add(values[1]);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** The data from the csv file are stored in the winners, years and grand_prix arraylists **/



        Scanner sc=new Scanner(System.in);

        String year;
        String circuit;
        boolean validYear = false;


        do {
            System.out.println("Please enter Year and Grand Prix");
            System.out.print("Year: ");
            year = sc.nextLine().trim();

            if (years.contains(year)) {
                validYear = true;
            } else {
                System.out.println("Data only available for the 2020-2022 seasons, please try again.");
            }
        } while (!validYear);

        boolean validCircuit = false;

        do {
            System.out.print("Grand Prix: ");
            circuit = sc.nextLine().trim();

            if (grand_prix.contains(circuit)) {
                validCircuit = true;
            } else {
                System.out.println("Please, enter valid Grand Prix name. ");
            }
        } while (!validCircuit);

        who_won(year, circuit);
    }

    /** The user is asked to provide input, the who_won method will only be called once the data requested
      are available in the csv file **/






    public static void who_won(String year, String circuit) {
        String driver = "";
        String team = "";
        Boolean found = false;

        for (Race stat : winners) {


            if (year.equals(stat.getYear()) && circuit.equals(stat.getCircuit())) {

                driver = stat.getDriver();
                team = stat.getTeam();
                found = true;
                System.out.println(driver + " with " + team);
                break;

            }


        }

        if (!found) {
            System.out.println("No race held in " + circuit + " in " + year);

            /** This condition is executed when the grand prix and year both exist in the csv file, but don't match **/


        }


    }

}
