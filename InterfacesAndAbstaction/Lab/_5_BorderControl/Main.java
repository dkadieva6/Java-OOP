package OOP.InterfacesAndAbstaction.Lab._5_BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> citizenAndRobotIdMap = new HashMap<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] inputData = input.split("\\s+");
            if (inputData.length == 2) {
                String robotName = inputData[0];
                String robotId = inputData[1];
                citizenAndRobotIdMap.put(robotName, robotId);
            } else if (inputData.length == 3) {
                String citizenName = inputData[0];
                String citizenId = inputData[2];
                citizenAndRobotIdMap.put(citizenName, citizenId);
            }

            input = scanner.nextLine();
        }

        String fakeIdToRemove = scanner.nextLine();

        for (String value : citizenAndRobotIdMap.values()) {
            if (value.endsWith(fakeIdToRemove)) {
                System.out.println(value);
            }
        }
    }

}
/*
Peter 22 9010101122
MK-13 558833251
MK-12 33283122
End
122

Teo 31 7801211340
Anna 29 8007181534
IV-228 999999
Simon 54 3401018380
KKK-666 80808080
End
340
 */