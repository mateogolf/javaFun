// 3=>Fizz, 5=>Buzz, 15=>FizzBuzz, otherwise, number
public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        if(number % 15==0){
            return "FizzBuzz";
        }else if(number % 3==0){
            return "Fizz";
        }else if(number % 5==0){
            return "Buzz";
        }else{
            return "" + number;
        }
    }
    public String fizzBuzz2(int number) {
        // fizzbuzz logic here
        String str = "";
        if(number % 3==0 || number % 5==0){
            if(number % 3==0){
                str = "Fizz";
            }
            if(number % 5==0){
                str = str + "Buzz";
            }
        }else{
            str = "" + number;
        }
        return str;
    }
}