package com.mentsik.blog.jmss.models;

public class EchoReply {
    private String reply;

    public EchoReply(String msg) {
        this.reply = msg;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
