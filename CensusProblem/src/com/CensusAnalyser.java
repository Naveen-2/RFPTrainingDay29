package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CensusAnalyser {

    public static void main(String[] args) throws IOException {

        CensusAnalyser read = new CensusAnalyser();
        read.readCSVData();

    }

    public void readCSVData() throws IOException {

        List<CensusCSV> users = new ArrayList<>();
        String line;
        String CSV_PATH = "N:\\Bridgelabz\\Training\\RFPTrainingDay29\\CensusProblem\\data\\IndiaStateCensusData.csv";
        BufferedReader reader = new BufferedReader(new FileReader(CSV_PATH));
        reader.readLine();
        int count = 0;
        while ((line = reader.readLine()) != null) {
            count += 1;
            String[] fields = ",".split(line);

            if (fields.length > 0) {
                CensusCSV user = new CensusCSV();
                user.setState(fields[0]);
                user.setPop(Integer.parseInt(fields[1]));
                user.setArea(Integer.parseInt(fields[2]));
                user.setDensity(Integer.parseInt(fields[3]));
                users.add(user);
            }
        }

        for (CensusCSV u : users) {
            System.out.printf("[state=%s, population=%d, area=%d, density=%d]\n", u.getState(), u.getPop(), u.getArea(),
                    u.getDensity());
        }

    }
}