import java.util.*;

public class PuzzlingJava {

	public ArrayList<Integer> greaterThanTen(int[] givenArray){
		ArrayList<Integer> filteredList = new ArrayList<Integer>();
		int sum = 0;

		for(int val : givenArray){
	  		sum += val;

	  		if(val > 10){
	  			// adding values as Integers into the filtered array
	    		filteredList.add(Integer.valueOf(val));
	  		}
		}

		System.out.println(sum);
		return filteredList;
	}

	public ArrayList<String> longNames(String[] givenArray){
		ArrayList<String> longNamesArray = new ArrayList<String>(Arrays.asList(givenArray));
		ArrayList<String> copyArray = new ArrayList<String>(longNamesArray);
		// shuffle array using the Collections class
		Collections.shuffle(longNamesArray);
		
		for(String val : longNamesArray){
		 	System.out.println(val);
		  	
		  	if(val.length() <= 5){
		    	copyArray.remove(val);
			}
		}
		return copyArray;
	}
	
	public void isVowel()
	{
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] vowels = {"a", "e", "i", "o", "u"};
		ArrayList<String> listAlphabet = new ArrayList<String>(Arrays.asList(alphabet));
		ArrayList<String> listVowels = new ArrayList<String>(Arrays.asList(vowels));
		// shuffle array using the Collections class
		Collections.shuffle(listAlphabet);

		String first = listAlphabet.get(0);
		String last = listAlphabet.get(listAlphabet.size() - 1);

		if(Arrays.asList(vowels).contains(first)) {
			System.out.println("The first letter is a vowel!");
		}

		System.out.println(first);
		System.out.println(last);
	}

	public ArrayList<Integer> genTen() {
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		Random randomGenerator = new Random();

		for(int i = 0; i < 10; i++) {
			resultArray.add(randomGenerator.nextInt(101 - 55) + 55);
		}

		return resultArray;
	}

	public ArrayList<Integer> getTenSorted(ArrayList<Integer> list) {
		ArrayList<Integer> copyArray = new ArrayList<Integer>(list);
		Collections.sort(copyArray);

		System.out.println(copyArray.get(0));
		System.out.println(copyArray.get(copyArray.size() - 1));

		return list;
	}	

	// static helper function
	public static String randomStringHelper() {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		ArrayList<String> listAlphabet = new ArrayList<String>(Arrays.asList(alphabet));

		Random randomGenerator = new Random();
		String randomString = "";

		for(int i = 0; i < 5; i++) {
			randomString = randomString.concat(listAlphabet.get(randomGenerator.nextInt(listAlphabet.size())));
		}

		return randomString;
	}

	public String genRandomString() {
		return PuzzlingJava.randomStringHelper();
	}

	public ArrayList<String> gen10RandString() {
		ArrayList<String> resultArray = new ArrayList<String>();

		for(int i = 0; i < 10; i++){
			resultArray.add(PuzzlingJava.randomStringHelper());
		}

		return resultArray;
	}
}			 
