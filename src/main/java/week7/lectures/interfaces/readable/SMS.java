package week7.lectures.interfaces.readable;

import java.lang.Readable;

public class SMS implements Readable {
    private String sender;
    private String content;

    public SMS(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    @Override
    public String read() {
        return this.content;
    }
}
