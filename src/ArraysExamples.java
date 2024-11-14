public class ArraysExamples {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i : arr) {
            System.out.println(i);
        }
        /*{
            arr[0]={1,2,3,4,5,6}
            arr[1]={7,8,9,10,11,12}
            arr[2]={12,14,15,16,17,18}
        }
        row=3,column=6
        size=3x6
        */

        int[][] ara = new int[3][6];
        for (int i = 0; i < ara[0].length; i++) {
            for (int j = 0; j < ara[i].length; j++) {
                ara[i][j] = j + 1;

            }
        }
        for (int[] arrayEg : ara) {
            System.out.println("--");
            for (int x : arrayEg) {
                System.out.print(x + " ");
            }
        }


    }
}
