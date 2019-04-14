package com.company;
import Hand.Hand;
import Head.Head;
import Human.Human;
import Leg.Leg;

public class Main {
    public static void main(String[] args) {
        Human man = new Human(175.00, 67.23);
        Leg leg = new Leg("короткие");
        Hand hand = new Hand("мускулистые");
        Head head = new Head("рыжие", "голубые");
        man.printHuman();
        head.printHead();
        hand.printHand();
        leg.printLeg();
    }
}
