package com.example.daniel.chat;

/**
 * Created by Daniel on 10/03/2017.
 */

public class Message {
    protected String text_sent;
    protected String time_sent;

    public Message(String text_sent, String time_sent) {
        this.text_sent = text_sent;
        this.time_sent = time_sent;
    }
}
