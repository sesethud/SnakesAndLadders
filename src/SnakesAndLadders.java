import java.util.HashMap;
import java.util.Map;

public class SnakesAndLadders {
    private int currentPosition=0;

    public  int getCurrentPosition(){
        return currentPosition;
    }
    public void setCurrentPosition(int currentPosition){
        this.currentPosition=currentPosition;
    }
    public void testForOverLoad(){


    }
    public static void main(String []args) {

        Map<Integer,Integer> snakesAndLadders=new HashMap<Integer, Integer>() ;
        snakesAndLadders.put(4,73);
        snakesAndLadders.put(3,37);
        snakesAndLadders.put(6,16);
        snakesAndLadders.put(14,32);
        snakesAndLadders.put(49,12);
        snakesAndLadders.put(88,37);
        snakesAndLadders.put(61,22);
        snakesAndLadders.put(39,44);
        snakesAndLadders.put(79,98);
        snakesAndLadders.put(15,9);
        snakesAndLadders.put(49,12);
        snakesAndLadders.put(58,45);
        snakesAndLadders.put(42,17);
        snakesAndLadders.put(97,65);

        SnakesAndLadders snakesAndLaddersObject=new SnakesAndLadders();

        int newPosition=snakesAndLaddersObject.getCurrentPosition();

        GAMEPLAY:while (newPosition<100){
            int diceRoll=(int)(Math.random()*6+1);
            if(snakesAndLadders.get(snakesAndLaddersObject.getCurrentPosition())==null){
                newPosition=snakesAndLaddersObject.getCurrentPosition()+diceRoll;
                if(newPosition==100){
                    System.out.println("play");
                    System.out.println("[diceRoll] ..."+diceRoll);
                    System.out.println("[newPosition] position "+newPosition);
                    System.out.println("Well Done!");
                    System.out.println();
                    break GAMEPLAY;
                }
                else{
                    System.out.println("play");
                    System.out.println("[diceRoll] ..."+diceRoll);
                    newPosition=100-(newPosition%100);
                    System.out.println("[newPosition] position "+newPosition);
                    snakesAndLaddersObject.setCurrentPosition(newPosition);
                    System.out.println();
                }

        }
            if(snakesAndLadders.get(snakesAndLaddersObject.getCurrentPosition())!=null){
                System.out.println("play");
                System.out.println("[newPosition] ...");
                newPosition=snakesAndLadders.get(snakesAndLaddersObject.getCurrentPosition());
                snakesAndLaddersObject.setCurrentPosition(newPosition);
                if(newPosition==100){
                    System.out.println("Well Done!");
                    break GAMEPLAY;
                }
                System.out.println("[on map] Roll... "+diceRoll);
                System.out.println("trigger, moved to "+newPosition);
            }
            if(newPosition+diceRoll>100 ){
                newPosition=100-((newPosition+diceRoll) %100);
                snakesAndLaddersObject.setCurrentPosition(newPosition);
                System.out.println("In last rule...");
            }



         }
    }

}
