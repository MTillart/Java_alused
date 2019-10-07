package com.company;
import java.util.Scanner;
import nhlstats.NHLStatistics;


public class NHL1 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\n Top 25 by penalty amount");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\n Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\n PHI statistics sorted by penalties ");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\n ANA players");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
