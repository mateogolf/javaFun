import java.util.*;

class GenericLists{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        // Checker check = new Checker();
        for(int i=0;i<myList.size();i++){//(Object value: myList){
            try{
                // check.isInteger(myList.get(i));
                Object value = myList.get(i);
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            }
            catch(ClassCastException e){
                System.out.println("ERROR ON INDEX {"+i+"}");//String.format("ERROR ON INDEX {%}", i));
            }
        }
    }
}
