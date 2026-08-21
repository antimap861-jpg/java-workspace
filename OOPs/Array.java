// Multidimensional array
public class Array {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        // Loop 1: Only for assigning values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // Loop 2: Only for printing values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
