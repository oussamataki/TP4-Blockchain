package org.example;

import org.apache.commons.codec.digest.DigestUtils;

import java.sql.Timestamp;
import java.util.Date;

public class Block {
    private long index;
    private String data;
    private Timestamp timestamp;
    private String currentHash;
    private String previousHash;
    public Block(long index, String data, String previousHash) {
        this.index = index;
        this.data = data;
        this.timestamp = new Timestamp(new Date().getTime());
        this.currentHash = calculateHash();
        this.previousHash = previousHash;
    }

    private String calculateHash(){
        String calculatedHash = DigestUtils.sha256Hex(index+data+timestamp.toString()+previousHash);
        return calculatedHash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "index=" + index +
                ", data='" + data + '\'' +
                ", timestamp=" + timestamp +
                ", currentHash='" + currentHash + '\'' +
                ", previousHash='" + previousHash + '\'' +
                '}';
    }

    public String getCurrentHash() {
        return currentHash;
    }

    public String getPreviousHash() {
        return previousHash;
    }
}
