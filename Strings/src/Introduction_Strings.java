import java.lang.reflect.Array;
import java.util.Arrays;



public class Introduction_Strings {
    static boolean isPalindrome(String str){
        int start = 0 ;
        int end= str.length()-1;
        str = str.toLowerCase();
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {

//        String str = new String("Atharva");
//
//        String str2 = new String("Atharva");
//
//        System.out.println(str==str2);

//
//        String str = "Hello";
//        System.out.println(str);
//
//        StringBuilder builder = new StringBuilder();
//
//        for(int i=0;i<str.length();++i){
//            builder.append(str.charAt(i));
//        }
//
//
//        System.out.println(builder.reverse());
//
//        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(isPalindrome("abaa"));

    }


}



