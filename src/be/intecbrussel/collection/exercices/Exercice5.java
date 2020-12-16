package be.intecbrussel.collection.exercices;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exercice5 {
    public static void main(String[] args) {
        BurgerOrder bo1 = new BurgerOrder("Big Mac", 4869546);
        BurgerOrder bo2 = new BurgerOrder("Bicky Chicken", 4786);
        BurgerOrder bo3 = new BurgerOrder("BigMacMenu", 94378);
        BurgerOrder bo4 = new BurgerOrder("BigPc", 37896);
        BurgerOrder bo5 = new BurgerOrder("Fish Manu", 378644);
        BurgerOrder bo6 = new BurgerOrder("KidsMenu", 378644);
        BurgerOrder bo7 = new BurgerOrder("BegiMeny", 378644);
        BurgerOrder bo8 = new BurgerOrder("ChickenMenu", 378644);
        BurgerOrder bo9 = new BurgerOrder("ChickenDips", 378644);

        Queue<BurgerOrder> theMertQueue = new PriorityQueue<>(List.of(bo1,bo2,bo3,bo4,bo5,bo6,bo7,bo8,bo9));

        while(!theMertQueue.isEmpty()) {
            BurgerOrder myBo = theMertQueue.poll();
            System.out.printf("Order: %s - OrderNumber: %d%n", myBo.getName(), myBo.getNumber());
        }


    }
}
