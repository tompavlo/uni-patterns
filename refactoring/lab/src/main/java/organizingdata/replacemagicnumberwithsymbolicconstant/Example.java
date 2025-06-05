package organizingdata.replacemagicnumberwithsymbolicconstant;

import java.util.ArrayList;
import java.util.List;

public class Example {
    static final int MAX_AMOUNT_OF_ITEMS = 100;
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        for (int i = 0; i < MAX_AMOUNT_OF_ITEMS; i++) {
            items.add("Item " + i);
        }
    }
}
