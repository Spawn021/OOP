package com;

import com.historical.History;
import com.process.Process;

public class Main {
    public static void main(String[] args) {
//        new CrawlData();
        History history = new Process().getHistory();
        history.write();
       // new App(history);
    }
}