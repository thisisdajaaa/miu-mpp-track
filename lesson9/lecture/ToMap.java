package lesson9.lecture;


import lesson9.lecture.models.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1, 22, 1200.0), new Employee(2, 24, 1300.0));
        Map<Employee, Employee> map = list.stream().distinct().collect(Collectors.toMap(Function.identity(),employee -> employee));
        System.out.println(map.toString());

        String[] testList = new String[]{"Sticks", "Sticks", "Cobblestone", "Cobblestone", "Cobblestone"};
        System.out.println(stonePick(testList));

    }

    public static int stonePick(String[] arr) {
        final int PICK_AXE_COBBLE_REQ = 3;
        final int PICK_AXE_STICK_REQ = 2;
        final int WOOD_TO_STICKS = 4;

        int pickAxeCount = 0;
        int cobbleStoneCount = 0;
        int stickCount = 0;
        int woodCount = 0;

        for (String item : arr) {
            switch (item) {
                case "Cobblestone": {
                    cobbleStoneCount++;
                    break;
                }
                case "Sticks": {
                    stickCount++;
                    break;
                }
                case "Wood": {
                    woodCount++;
                    break;
                }
                default: {
                    break;
                }
            }
        }

        stickCount += woodCount * WOOD_TO_STICKS;

        System.out.println("cobbleStoneCount :" + cobbleStoneCount);
        System.out.println("stickCount :" + stickCount);
        System.out.println("woodCount :" + woodCount);

        while(cobbleStoneCount >= PICK_AXE_COBBLE_REQ && stickCount >= PICK_AXE_STICK_REQ) {
            cobbleStoneCount -= PICK_AXE_COBBLE_REQ;
            stickCount -= PICK_AXE_STICK_REQ;
            pickAxeCount++;
        }

        return pickAxeCount;
    }
}
