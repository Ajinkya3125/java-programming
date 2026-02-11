import java.util.Arrays;

class ArrayExample {
    public static void main(String[] args) {
        // 1D array
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 2D array
        int[][] a = {
                { 1, 2 },
                { 3, 4 }
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array
        int[][] jagged = new int[2][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];

        jagged[0][0] = 10;
        jagged[0][1] = 20;

        jagged[1][0] = 30;
        jagged[1][1] = 40;
        jagged[1][2] = 50;

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Arrays.toString()
        int[] ar = { 3, 2, 1, 5, 4 };
        Arrays.sort(ar);// Arrays.sort()
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.binarySearch(ar, 1));

        // Arrays.equals()
        int[] x = { 1, 2 };
        int[] y = { 1, 2 };
        System.out.println(Arrays.equals(x, y));

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("Original array:" + Arrays.toString(arr1));
        System.out.println("Copied array:" + Arrays.toString(arr2));

        Arrays.fill(arr1, 3);
        System.out.println(Arrays.toString(arr1));
    }
}