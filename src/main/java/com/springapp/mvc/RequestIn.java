package com.springapp.mvc;

public class RequestIn
{
    private String text;
    private String consoleArgs;

    RequestIn()
    {}

    public String getConsoleArgs() {

        return consoleArgs;
    }

    public void setConsoleArgs(String consoleArgs) {
        this.consoleArgs = consoleArgs;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
