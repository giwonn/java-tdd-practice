package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();

       Computer computer = new Computer();

       List<String> answer = computer.getNums();

       while(true) {
       }



    }

    List<Integer> numberGenerator() {
        List<Integer> nums = new ArrayList<>();
        while(nums.size() < 3) {
            int num = new Random().nextInt(9) + 1;
            if (!nums.contains(num)) {
                nums.add(num);
            }
        }
        return nums;
    }


}
