package ZeroForEachLoop;

public class OddOrEven {

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        int even = 0;
        int odd = 0;

        for (int each : nums) {
            if (each %2 == 0){
                even++;

            }else {
                odd++;
            }
        }

        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }
}
