class Subarray {

    public static void main(String args[]) {
        int[] array = {1, 2, 6, 2, 5, 2, 6, 8, 3};

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {

                // Print subarray from index i to j
                System.out.print("{"); 
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                }

                System.out.print("}");  // Move to the next line after printing the subarray
                System.out.println(""); 
            }
        }

        System.out.println("Hello Java, array length: " + array.length);
    }
}
