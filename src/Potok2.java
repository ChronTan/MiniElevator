import java.util.Scanner;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executor;

public class Potok2 implements Runnable {

    Main main=new Main();
    Potok2(){
    }

    public void run() {
        System.out.println("start 2");
        while (main.flag == true) {
            for (int i = 0; i < main.arrStage.size(); i++) {
                System.out.println("mas:" + main.arrStage.get(i));
            }
        }
    }
}
