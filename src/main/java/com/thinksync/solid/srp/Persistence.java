package com.thinksync.solid.srp;

/***
 *  This class is responsible for storing and fetching journals
 *  I haven't implemented. This is just kept it to show how we can achieve SRP
 *
 */
public abstract class Persistence {
    public void save(Journal journal, String fileName){}
    public Journal fetchJournals( String fileName){
        return null;
    }
}
