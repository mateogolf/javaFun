import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava{
    public static void main(String args[]){
        PuzzleJava puzzler = new PuzzleJava();
        //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        int[] numbers = {3,5,1,2,7,9,8,13,25,32};
        //Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
        System.out.println(puzzler.valsGreaterThan10(numbers));
        //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        //Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
        System.out.println(puzzler.shuffleAndNameLongerThan5(names));

        //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        //Shuffle the array and display the last letter of the array. 
        //Have it also display the first letter of the array. 
        //If the first letter in the array is a vowel, have it display a message
        puzzler.alphabeticScramble();

        //Generate and return an array with 10 random numbers between 55-100.
        ArrayList<Integer> rand10 = puzzler.rand10bet55And100();
        System.out.println(rand10);

        //Generate and return an array with 10 random numbers between 55-100 -use rand10 above
        //have it be sorted (showing the smallest number in the beginning). 
        puzzler.rand10Play(rand10);
        //Display all the numbers in the array. 
        //Next, display the minimum value in the array as well as the maximum value.

        //Create a random string that is 5 characters long.

        //Generate an array with 10 random strings that are each 5 characters long
    }
    public ArrayList valsGreaterThan10(int[] x){
        //printall
        ArrayList<Integer> greaterTen = new ArrayList<Integer>();
        int sum = 0;
        for(Integer i:x){
            sum = sum + i;
            if(i>10){//add values that are greater than 10 to new ArrayList
                greaterTen.add(i);
            }
        }
        System.out.println(sum);
        return greaterTen;//return array of values greater than 10
        
    }
    public ArrayList shuffleAndNameLongerThan5(ArrayList<String> x){
        ArrayList<String> shuffled = new ArrayList<String>();
        ArrayList<String> longer5 = new ArrayList<String>();
        //shuffle
        while(x.size() > 0){//shuffle loop until
            //find random index between 0 and x.length-1
            Random rand = new Random();
            int i = rand.nextInt(x.size());
            //Add string @ random index to suffled
            shuffled.add(x.get(i));
            //if string @ random index longer than 5, then add to longer5
            // String str = 
            if(x.get(i).length() > 5){
                longer5.add(x.get(i));
            }
            //remove string from x
            x.remove(i);
        }
        //Print shuffled
        for(String str:shuffled){
            System.out.println(str);
        }
        //return array of strings longer than 5 chars
        return longer5;
    }
    public void alphabeticScramble(){
        //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<Character> x = new ArrayList<Character>();
        for(int i=0;i<alphabet.length;i++){
            x.add(alphabet[i]);
        }
        ArrayList<Character> shuffled = new ArrayList<Character>();
        while(x.size() > 0){//Shuffle the array
            
            Random rand = new Random();
            int i = rand.nextInt(x.size());//find random index between 0 and x.size()
            shuffled.add(x.get(i));//add to shuffled
            x.remove(i);
        }
        System.out.println(shuffled.get(25));//display the last letter of the array.
        System.out.println(shuffled.get(0));//Have it also display the first letter of the array.
        //If the first letter in the array is a vowel, have it display a message
        char[] vowels = "aeiou".toCharArray();
        for(int i=0;i<vowels.length;i++){
            if(shuffled.get(0) == vowels[i]){
                System.out.println("The First letter in shuffled alphabet is a vowel!");
            }
        }
    }
    public ArrayList rand10bet55And100(){
        ArrayList<Integer> randomTen = new ArrayList<Integer>();
        //Generate and return an array with 10 random numbers between 55-100.
        for(int i=0;i<10;i++){
            Random rand = new Random();
            int num = rand.nextInt(100-55)+55;
            randomTen.add(num);
        }
        return randomTen;
    }
    public void rand10Play(ArrayList arr){
        //Generate and return an array with 10 random numbers between 55-100
        //have it be sorted (showing the smallest number in the beginning). 
        // Collections
        Collections.sort(arr);
        //Display all the numbers in the array. 
        for(Integer i:arr){
            System.out.println(i);
        }
        //Next, display the minimum value in the array as well as the maximum value.
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
    }
}