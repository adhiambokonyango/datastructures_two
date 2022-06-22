public class Main {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] height = {1, 1};
        System.out.println(containerWithMostWater.maxArea(height));

        IntegerToRoman integerToRoman = new IntegerToRoman();
        /**
         * D
         * 393
         * DC
         * 293
         * DCC
         * 193
         * DCCC
         * 93
         * DCCCXC
         * 3
         * DCCCXCI
         * 2
         * DCCCXCII
         * 1
         * DCCCXCIII
         * 0
         * DCCCXCIII
         */
        System.out.println(integerToRoman.intToRoman(893));
    }
}
