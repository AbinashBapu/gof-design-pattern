package com.thinksync.solid.srp;

public class SingleResponsibilityPrincipleApplication {
    public static void main(String[] args) {

        Journal J = new Journal();
        J.addJournal("Journal 1");
        J.addJournal("Journal 2");
        J.addJournal("Journal 3");
        J.addJournal("Journal 4");

        J.removeJournal(5);
    }
}
