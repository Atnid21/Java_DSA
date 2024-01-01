public class WrapperClass {
    public static void main(String[] args) {

        Integer a=20,b=10;
        swap(a,b);
        System.out.println(a +" "+b);
    }



    static void swap(Integer a ,Integer b){
        a=a^b;
        b=a^b;
        a=a^b;

    }
}
