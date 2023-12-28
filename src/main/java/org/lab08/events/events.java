package org.lab08.events;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/edina/OneDrive/Desktop/Folder/OOP/github/oop/week10/task3.txt";

        final int numOfRecords = 1000000;
        generateEventsFile(filePath, numOfRecords);
        readEventsFile(filePath);
    }

    public static void generateEventsFile(String filePath, int n) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));

        bufferedWriter.write("");
        for(int i = 0; i < n; i++){
            bufferedWriter.write(randomTimeStamp() + "-" + randomEventType() + " - " + randomId()+"\n");
        }
        bufferedWriter.close();
    }

    public static void readEventsFile(String filePath) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String tempLine;
        while((tempLine = bufferedReader.readLine()) != null){
            System.out.println(tempLine);
        }
        bufferedReader.close();
    }

    public static String randomTimeStamp(){
        Instant currentTimestamp = Instant.now();
        Instant oneYearAgo = currentTimestamp.minusSeconds(365 * 24 * 60 * 60);
        long randomEpochSecond = ThreadLocalRandom.current().nextLong(oneYearAgo.getEpochSecond(), currentTimestamp.getEpochSecond());
        return (Instant.ofEpochSecond(randomEpochSecond)).toString();
    }

    public static String randomEventType(){
        String[] eventTypes = {"Login", "Log out", "Purchase", "View Page", "Error"};
        int arrayLength = eventTypes.length;
        Random random = new Random();
        return eventTypes[random.nextInt(arrayLength)];
    }

    public static String randomId(){
        Random random = new Random();
        return String.valueOf(random.nextInt(1000));
    }
}
