import java.util.Arrays;
import java.util.ArrayList;
public class StringSplit{
    public static void main(String[] args) {
        String newTags= "java, array, string test spaces     , split ";
        String[] old = {"java","split","javascript"};
        ArrayList<String> oldTags = new ArrayList<String>();//Arrays.asList(old));

        //split and trim newTags
        // String[] tagArr = newTags.split("\\,");
        ArrayList<String> tagList = new ArrayList<String>(Arrays.asList(newTags.split("\\,")));
        ArrayList<String> result = new ArrayList<String>();//ArrayList<Tag> qTags = new ArrayList<Tag>();
        for(int i=0;i<tagList.size();i++){
            String testStr = tagList.get(i).trim();
            // tagList.set(i, newTag);
        // }
        //Compare newTags with oldTags
        // for(int input=0;input<tagList.size();input++){//Loop through the new tags
            boolean found = false;
            // String testStr = tagList.get(input);//string to be looked for
            System.out.println("Checking[" +testStr+"]");
            
            for(String oldTag:oldTags){//for(Tag oldTag:oldTags){//Loop through oldTags
                //if newTag present in oldTag
                if(testStr.equals(oldTag)){//if(testStr.equals(oldTag.subject)){
                    System.out.println("Found in database&Added to returned ArrayList");
                    //add to ArrayList to be returned
                    result.add(oldTag);//qTags.add(oldTag);
                    found = true;
                }
            }
            //if !found(outside loop for oldTags)
            if(!found){
                System.out.println("NOT in database added to database and returned in list");
                //add to oldTags
                //Tag newTag = new Tag(testStr);
                oldTags.add(testStr);//Tag saved = repo.save(newTag);
                //add to ArrayList to be returned
                result.add(testStr);//qTags.add(saved);
            }
        }
        System.out.println("Database Array:");
        System.out.println(oldTags);
        System.out.println("Returned Array:");
        System.out.println(result);
    }
}