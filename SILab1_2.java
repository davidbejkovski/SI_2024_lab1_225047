import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
<<<<<<< HEAD
            if (el.length() >= minLength) {
=======
            if (el.length() >= minLength) {//popravena e
>>>>>>> 94231645f00a01275854a2c5e02834f78cc2187f
                sb.append(el);
            }
        }
        return sb.toString();
    }
}