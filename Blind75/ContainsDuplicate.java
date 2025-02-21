import java.util.*;
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        Set<Integer> set = new HashSet<Integer>();
        for (int j : arr) {
            if (!set.add(j)) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);

    }
}
