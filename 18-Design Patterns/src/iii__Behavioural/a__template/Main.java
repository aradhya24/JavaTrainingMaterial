package iii__Behavioural.a__template;

public class Main {
    public static void main(String[] args) {
        FileParser csvParser = new CSVParser();
        csvParser.processFile();
        System.out.println();

        FileParser jsonParser = new JSONParser();
        jsonParser.processFile();
    }
}

