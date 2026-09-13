import java.util.ArrayList;

public class CoreJavaBrushUp2 {
    public static void main(String[] args){
        int[] arr2 = {1,2,3,4,5,6,7,87,89,90};

        for(int i=0; i < arr2.length; i++){
            if (arr2[i] % 2 == 0){
                System.out.println(arr2[i]);
                break;
            }
            else {
                System.out.println(arr2[i] + " Is not multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList<String>();
        a.add("shetty");
        a.add("selenium");
        a.add("rahul");
        a.add("dfdfdfđf");
        System.out.println(a.get(0));
    }
}
