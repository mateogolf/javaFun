public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        //Trim the spaces before and after string
        String newStr = "";
        // char space = " ";
        for(int i = 0; i<str1.length();i++){
            if(str1.charAt(i) != ' '){
                newStr = newStr + str1.charAt(i);
            }
        }
        for(int j = 0; j<str2.length();j++){
            if(str2.charAt(j) != ' '){
                newStr = newStr + str2.charAt(j);
            }
        }
        return newStr;
    }
    public Integer getIndexOrNull(String str, char c){
        //Looks inside str to find c
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == c){
                return i;
            }
        }
        return null;
    }
    public Integer getIndexOrNull(String str1, String str2){
        //Looks inside str1 to find str2
        int found;
        for(int i = 0; i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(0)){
                found = i;
                boolean match = true;
                //loop to check whether the chars in str1 and str2 matchup
                for(int j=0;j<str2.length();j++,i++){
                    if(str1.charAt(i) != str2.charAt(j)){
                        i = found;
                        match = false;
                        break;
                    }
                }
                if(match){
                    return found;
                }
            }
        }
        return null;
    }
    public String concatSubstring(String str1, int start, int end, String str2){
        //Take a substring of str1 from start to end indeces, concat with str2
        if(start >= end){
            return "First index must be less than second index";
        }
        String newStr = "";
        for(int i=start;i<end;i++){
            newStr = newStr + str1.charAt(i);
        }
        newStr = newStr + str2;
        return newStr;
    }
}