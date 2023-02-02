
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int teamcounter = 0;
        int wins = 0;
        int loses = 0;

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        try (Scanner scf = new Scanner(Paths.get(file))) {
            while (scf.hasNextLine()) {
                String row = scf.nextLine();

                String parts[] = row.split(",");
                String local = parts[0];
                String visitor = parts[1];
                int localpoints = Integer.valueOf(parts[2]);
                int visitorpoints = Integer.valueOf(parts[3]);

                if (parts[0].contains(team) || parts[1].contains(team)) {
                    teamcounter += 1;
                    if (parts[0].contains(team)) {
                        if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                            wins += 1;
                        } else {
                            loses += 1;
                        }
                    } else if (parts[1].contains(team)) {
                        if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                            wins += 1;
                        } else {
                            loses += 1;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }

        System.out.println("Games: " + teamcounter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
    }
}
