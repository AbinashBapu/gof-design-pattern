package com.thinksync.solid.srp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private static final Logger logger = LoggerFactory.getLogger(Journal.class);

    public static List<String> JOURNALS = new ArrayList<>();
    public static int NUMBER_OF_JOURNALS = 0;


    public void addJournal(String journalName){
        JOURNALS.add(journalName);
    }

    public void removeJournal(int index){
        try {
            JOURNALS.remove(index);
        }catch (IndexOutOfBoundsException ex){
            logger.error("Journal Not Found! Index: {}",index);
        }
    }


    public String toString(){
        return String.join(System.lineSeparator(),JOURNALS);
    }


}
