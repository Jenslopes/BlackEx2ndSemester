/**
 * Created by Jennes on 13-11-2016.
 */

import java.util.Random;

/**
 * This thread finds the sum of a subsection of an array.
 */
public class MaxValue extends Thread {
    private int lo, hi;
    private int[] arr;
    private int ans = 0;

    public MaxValue(int[] arr, int lo, int hi) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    @Override
    public void run() {
        int max = 0;
        for (int i = lo; i < hi; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        ans = max;
    }
        public int max () {
            int max = 0;
            for (int i = 0; i <= arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        /**
         * Sum the elements of an array.
         *
         * @param arr array to sum
         * @return sum of the array's elements
         * @throws InterruptedException shouldn't happen
         */
        public static int max ( int[] arr) throws InterruptedException {
            int len = arr.length;
            int ans = 0;

            // Create and start 4 threads.
            MaxValue[] ts = new MaxValue[4];

            for (int i = 0; i < 4; i++) {
                ts[i] = new MaxValue(arr, (i * len) / 4, ((i + 1) * len / 4));
                ts[i].start();
            }

            // Wait for the threads to finish and sum their results.
            int max = 0;
            for (int i = 0; i < 4; i++) {
                ts[i].join();
                if (ts[i].ans > max) {
                    max = ts[i].ans;
                }
                ans = max;
            }

            return ans;
        }

        public static void main (String[]args) throws InterruptedException {
            int[] arr = new int[]{99, 4, 165, 4, 23};
            Random rand = new Random();
            /*for (int i = 0; i < arr.leng  th; i++) {
                arr[i] = rand.nextInt(100);
            }*/

            int max = max(arr);
            System.out.println("max: " + max);
        }
    }