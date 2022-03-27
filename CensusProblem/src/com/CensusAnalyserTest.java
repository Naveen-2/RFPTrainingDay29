package com;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class CensusAnalyserTest {
    private static final String CENSUS_CSV_FILE_PATH = "N:\\Bridgelabz\\Training\\RFPTrainingDay29\\CensusProblem\\data\\IndiaStateCensusData.csv";

    private static final String WRONG_CSV_FILE_PATH = "N:\\Bridgelabz\\Training\\RFPTrainingDay29\\CensusProblem\\data\\IndiaStateCode";


    @Test
    public void givenCensusCSVFile_shouldReturnsNumberOfCorrectRecords() throws IOException {

        List<CensusCSV> users = new ArrayList<>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(CENSUS_CSV_FILE_PATH));
        reader.readLine();
        int count = 0;
        while ((line = reader.readLine()) != null) {
            count += 1;
        }
        assertEquals(29,count);
    }

    //Wrong CSV
    @Test
    public void givenIndiaCensusData_WithWrongFile_ShouldThrowException() {
        List<CensusCSV> users = new ArrayList<>();
        String line = "";
        BufferedReader reader;
        int count1 = 0;
        try {
            reader = new BufferedReader(new FileReader(WRONG_CSV_FILE_PATH));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                count1 += 1;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        assertEquals(29,count1);

    }

}