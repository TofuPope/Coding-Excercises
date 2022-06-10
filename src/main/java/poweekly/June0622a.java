package poweekly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class June0622a {
    static Scanner input = new Scanner(System.in);
    static final Logger log = LoggerFactory.getLogger(June0622a.class);

    public static void secondMax() {
        String answer = "";
        int N = input.nextInt();
        Integer[][] numbers = new Integer[N][3];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < 3; j++){
                numbers[i][j] = input.nextInt();
            }
            Arrays.sort( numbers[i], Comparator.naturalOrder());
        }

        for (int i = 0; i < N; i++){
            if (i == 0)
                answer += numbers[i][1];
            else
            answer += "\n"+numbers[i][1];
        }
        System.out.print(answer);
    }
}
