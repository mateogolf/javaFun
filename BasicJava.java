import java.util.ArrayList;

public class BasicJava{
    public static void main(String args[]){
        //Test all methods here
        BasicJava bj = new BasicJava();
        // bj.print1To255();// Write a method that prints all the numbers from 1 to 255.
        // bj.printOdds1To255();// Print odd numbers between 1-255
        // bj.printSum0To255();// Print Sum from 0 to 255,
        // // Iterating through an array
        // int[] x = {1,3,5,7,9,13};
        // bj.iterArray(x);
        // //Print Max
        // bj.printMax(x);
        // bj.printAvg(x);// Get Average
        // //Array with Odd Numbers
        // ArrayList<Integer> myArray = bj.arrayOdd1Tos55();
        // System.out.println(myArray);
        // //Greater Than Y
        // int[] arr = {1, 3, 5, 7};
        // bj.greaterThanY(arr,3);
        // Square the values
        // int[] x = {1, 5, 10, -2};
        // System.out.println(bj.squareArray(x));
        // // Eliminate Negative Numbers
        // int[] x = {1, 5, 10, -2};
        // int[] newArr = bj.removeNeginArray(x);
        // bj.iterArray(newArr);
        // // Max, Min, and Average
        // double[] mma = bj.findMaxMinAvg(x);
        // bj.iterArray(mma);
        // // Shifting the Values in the Array
        int[] x = {1, 5, 10, 7, -2};
        int[] newArr = bj.shiftVals(x);
        bj.iterArray(newArr);
    }

    //Print 1-255
    public void print1To255(){
        // Write a method that prints all the numbers from 1 to 255.
        for(int i=1;i<=255;i++){
            System.out.println(i);
        }
    }
    // Print odd numbers between 1-255
    public void printOdds1To255(){
        // Write a method that prints all the odd numbers from 1 to 255.
        for(int i=1;i<=255;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    // Print Sum
    public void printSum0To255(){
        // Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. 
        int sum = 0;
        for(int i=0;i<=255;i++){
            sum = sum + i;
            System.out.println("New number: "+ i +" Sum: "+ sum);
        }
    }
    // Iterating through an array
    public void iterArray(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    public void iterArray(double[] x){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    //Find Max
    public void printMax(int[] x){
        int max = x[0];
        for(Integer val: x){
            if(max < val){
                max = val;
            }
        }
        System.out.println(max);
    }
    // Get Average
    public void printAvg(int[] x){
        double sum = 0;
        for(Integer val: x){
            sum = sum + val;
        }
        System.out.println(sum/x.length);
    }
    // Array with Odd Numbers
    public ArrayList arrayOdd1Tos55(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=0;i<256;i++){
            if(i % 2 != 0){
                y.add(i);
            }
        }
        return y;
    }
    // Greater Than Y
    public void greaterThanY(int[] x, int y){
        //Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
        for(Integer i:x){
            if(i>y){
                System.out.println(i);
            }
        }
    }
    // Square the values
    public ArrayList squareArray(int[] x){
        // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i=0;i<x.length;i++){
            newArr.add(x[i]*x[i]);
        }
        return newArr;
    }
    // Eliminate Negative Numbers
    public int[] removeNeginArray(int[] x){
        // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
        for(int i=0;i<x.length;i++){
            if(x[i] < 0){
                x[i] = 0;
            }
        }
        return x;
    }
    // Max, Min, and Average
    public double[] findMaxMinAvg(int[] x){
        // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
        double[] result = {x[0],x[0],0};// max,min,avg
        for(Integer i: x){
            result[2] = result[2] + i;
            if(result[0] < i){//if max < val replace
                result[0] = i;
            }
            if(result[1] > i){//if min > val replace
                result[1] = i;
            }
        }
        result[2] = result[2] / x.length;
        return result;
    }
    // Shifting the Values in the Array
    public int[] shiftVals(int[] x){
        // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0].
        // ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i=0;i<x.length-1;i++){
            x[i] = x[i+1];
        }
        x[x.length-1] = 0;
        return x;
    }
}