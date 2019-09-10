import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class Potok1 implements Runnable {

    Main main=new Main();
    Potok1(){
    }

    public void run() {
        chooseStage();
            while ( main.flag) {
                if(main.num==-1) {
//                    main.flag=false;
                    System.exit(0);
                }
                if(main.num>5)
                    main.num=5;
                if(main.num<1 && main.num!=-1)
                    main.num=1;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("stage= " + main.stage);
                if(main.stage==main.num){
                    System.out.println("Этаж: "+ main.stage+ " Вы приехали!" );
//                   delArr(main.num);
                    chooseStage();
                }
                if(main.stage>main.num){
                    napVniz();
                }else{
                    napVverh();
                }
            }
    }


    public void napVverh(){
        main.stage++;
    }
    public void napVniz(){
        main.stage--;
    }
    public void chooseStage(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ВВедите число меньше или равное 5: ");
        main.num=scanner.nextInt();
        main.arrStage.add(main.num);
    }

    public void delArr(int a){
        for(int i=0;i<main.arrStage.size();i++){
            if(main.arrStage.get(i)==a)
                main.arrStage.remove(i);
        }
    }
}