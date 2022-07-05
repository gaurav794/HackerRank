package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HurdleRace {

    public static int hurdleRace(int k, List<Integer> hurdles)
    {
        int numOfDoses = 0;
        //sort and find maximum hurdle height from list. It would be last element
        Collections.sort(hurdles);
        int maxHurdleHeight = hurdles.get(hurdles.size()-1);
        numOfDoses = maxHurdleHeight - k; 
        return numOfDoses <= 0 ? 0 : numOfDoses;
    }

    public static  void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        List<Integer> hurdles = new ArrayList<>();
        int numOfHurdles = input.nextInt();
        int jumpByPlayer = input.nextInt();
        for(int i=0;i<numOfHurdles;i++)
        {
            hurdles.add(input.nextInt());
        }
        System.out.println(HurdleRace.hurdleRace(jumpByPlayer, hurdles));
        input.close();
    }
    
}
