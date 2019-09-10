import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class Main {

    int stage =1;
    int num=0;
    boolean flag=true;
    ArrayList<Integer> arrStage=new ArrayList<>();


    public static void main(String[] args) {
        Main main=new Main();
        Potok1 potok1=new Potok1();
        Potok2 potok2=new Potok2();
        Thread t1=new Thread(potok1);
        Thread t2=new Thread(potok2);
        t1.start();
        t2.start();

    }
}
