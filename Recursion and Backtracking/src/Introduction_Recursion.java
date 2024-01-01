public class Introduction_Recursion {
    public static void main(String[] args) {
//        printNumber(1);

        String[] types = {"Even","Odd"};

        int n=2;

        System.out.println(types[n%2]);

    }


    static void printNumber(int number){

        // base condition
        if(number==5){
            return;
        }

        System.out.println(number);
        printNumber(number+1);
    }

}
