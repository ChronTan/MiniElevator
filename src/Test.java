import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(3);
        arr.add(5);
        hm.put(1,2);
        hm.put(2,5);
        hm.put(3,3);
        hm.put(4,7);
//        for(int i=1;i<hm.size()+1;i++){
//            if(hm.get(i)==5)
//                hm.remove(i);
//        }
//        for(int i=1;i<hm.size()+1;i++){
//            System.out.println(hm.get(i));
//        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==3)
                arr.remove(i);
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
