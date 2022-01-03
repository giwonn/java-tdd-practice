package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    private final List<String> nums;

    Computer() {
        nums = new ArrayList<>();
        numberGenerator();
    }

    private void numberGenerator() {
        while(nums.size() < 3) {
            int num = getRandomNumber();
            if (isDistinct(num)) {
                nums.add(num.toString());
            }
        }
    }

    private int getRandomNumber() {
        return new Random().nextInt(9) + 1;
    }

    private boolean isDistinct(int num) {
        return nums.contains(num);
    }

    public List<String> getNums() {
        return nums;
    }
}
