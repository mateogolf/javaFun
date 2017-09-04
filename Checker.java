class NotIntException extends ClassCastException{}

class Checker {
    public boolean isInteger(Object obj) throws NotIntException{
        if (obj instanceof Integer){
            return true;
        }
        throw new NotIntException();
    }
}