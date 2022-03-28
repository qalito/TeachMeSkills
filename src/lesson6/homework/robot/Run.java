package lesson6.homework.robot;

import lesson6.homework.robot.hands.SamsungHand;
import lesson6.homework.robot.hands.SonyHand;
import lesson6.homework.robot.hands.ToshibaHand;
import lesson6.homework.robot.heads.SamsungHead;
import lesson6.homework.robot.heads.SonyHead;
import lesson6.homework.robot.heads.ToshibaHead;
import lesson6.homework.robot.legs.SamsungLeg;
import lesson6.homework.robot.legs.SonyLeg;
import lesson6.homework.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SonyHand sonyHand = new SonyHand(false,111);
        SonyHead sonyHead = new SonyHead(333);
        SonyLeg sonyLeg = new SonyLeg(777);

        ToshibaHand toshibaHand = new ToshibaHand(true,666);
        ToshibaHead toshibaHead = new ToshibaHead(222);
        ToshibaLeg toshibaLeg = new ToshibaLeg( 999);

        SamsungHand samsungHand = new SamsungHand(false, 123);
        SamsungHead samsungHead = new SamsungHead(654);
        SamsungLeg samsungLeg = new SamsungLeg(789);

        int priseOne, priseTwo, priseThree;
        Robot robotOne = new Robot(samsungHead, toshibaHand, sonyLeg);
        robotOne.action();
        priseOne=robotOne.getPrice();
        System.out.println("Price robot 1 "+priseOne);
        Robot robotTwo = new Robot(toshibaHead, samsungHand, toshibaLeg);
        robotTwo.action();
        priseTwo=robotTwo.getPrice();
        System.out.println("Price robot 2 "+priseTwo);
        Robot robotThree = new Robot(sonyHead, sonyHand, samsungLeg);
        robotThree.action();
        priseThree=robotThree.getPrice();
        System.out.println("Price robot 3 "+priseThree);
        if (robotOne.getPrice() >= robotTwo.getPrice() && robotOne.getPrice() >= robotThree.getPrice()){
            System.out.println("Robot One has MAX price");
        }
        if (robotTwo.getPrice() >= robotThree.getPrice() && robotTwo.getPrice() >= robotOne.getPrice())
        {
            System.out.println("Robot Two has MAX price");
        }
        if (robotThree.getPrice() >= robotOne.getPrice() && robotThree.getPrice() >= robotTwo.getPrice())
        {
            System.out.println("Robot Two has MAX price");
        }
    }
}
