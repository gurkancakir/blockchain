package com.gurkan.transaction;

import java.util.HashMap;
import java.util.Map;

public class Transactions {
    private static Transactions instance = new Transactions();

    public  Map<String,TransactionOutput> UTXOs = new HashMap<String,TransactionOutput>(); //list of all unspent transactions.
    public static float minimumTransaction = 0.1f;

    public static Transactions getInstance() {
        return instance;
    }

    private Transactions() {
    }
}
