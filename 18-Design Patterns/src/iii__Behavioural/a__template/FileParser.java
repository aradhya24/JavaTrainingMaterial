package iii__Behavioural.a__template;

public abstract class FileParser {
    // Template Method
    public final void processFile() {
        openFile();
        parseData();
        closeFile();
    }

    // Common steps
    void openFile() {
        System.out.println("Opening file...");
    }

    void closeFile() {
        System.out.println("Closing file.");
    }

    // Step to be overridden
    abstract void parseData();
}

