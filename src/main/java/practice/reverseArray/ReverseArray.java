package practice.reverseArray;

public class ReverseArray {

    public static void main(String[] args) {
        String[] toReverse = {"1", "2", "3", "4", "5","6","7"};
        for(String test : reverse(toReverse)) {
            System.out.println(test);
        }

    }

    public static String[] reverse(String[] arrInter){
        String[] result = new String[arrInter.length];
        int haf = arrInter.length/2;
        if(haf*2 != arrInter.length){result[haf]=arrInter[haf];}
        int buffer = arrInter.length;
        for (int i = 0; i < arrInter.length/2; i++) {
            --buffer;
            result[buffer] = arrInter[i];
            result[i] = arrInter[buffer];
        }
        return result;
    }
}
