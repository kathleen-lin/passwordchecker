package password;

public class Password {
    
    public String pw;


    public Password(String pw) {
        this.pw = pw;
    }


    public Boolean checkCondition (Character target, char[] condition){
        Boolean inList = false;

        for (int i = 0; i < condition.length; i++){
            if (target.equals(condition[i])){
                inList = true;
            }
        }

        return inList;
    }
}
