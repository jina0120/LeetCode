import java.util.*;

public class FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> r = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if (i % 15 == 0) {
                r.add("FizzBuzz");
            } else if (i % 5 == 0) {
                r.add("Buzz");
            } else if (i % 3 == 0) {
                r.add("Fizz");
            } else {
                r.add(String.valueOf(i));
            }
        }
        return r;
    }
}
