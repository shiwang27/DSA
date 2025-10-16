package Recursion;

public class RemoveDuplicatesFromString {
    public static void  RemoveDuplicate(String str, StringBuilder newStr, int index, boolean map[]){

        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(index);

        if(map[currchar-'a'] == true){
            RemoveDuplicate(str, newStr, index + 1 , map);

        }else{
            map[currchar-'a']= true;
            RemoveDuplicate(str, newStr.append(currchar), index+1, map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        RemoveDuplicate(str, new StringBuilder(""), 0, new boolean[26]);
    }
}
