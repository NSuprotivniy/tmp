package main.java;

public class Main {

    public static void main(String[] args) {
        BinaryStreamsHandler bHandler = new BinaryStreamsHandler("input.txt", "output1.txt");
        bHandler.keywordWriter();
        TextStreamHandler tHandler = new TextStreamHandler("input.txt", "output2.txt");
        tHandler.keywordWriter();
    }

}
