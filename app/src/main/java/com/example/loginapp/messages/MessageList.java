package com.example.loginapp.messages;

public class MessageList {

    private String name, lastMessage, profile;

    private int unseenMessages;

    public MessageList(String name, String lastMessage, String profile, int unseenMessages) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.profile = profile;
        this.unseenMessages = unseenMessages;
    }

    public String getName() {
        return name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getProfile() {
        return profile;
    }

    public int getUnseenMessages() {
        return unseenMessages;
    }
}
