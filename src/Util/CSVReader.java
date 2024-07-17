package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Abrigo;

public class CSVReader {

    public static List<Abrigo> lerAbrigos() throws Exception{
        String path = "C:\\Users\\Alberto\\OneDrive\\Documentos\\Java Projects\\RSProject\\csv\\abrigos.csv";
        List<Abrigo> abrigosCSV = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                try{
                    String [] abrigoLine = line.split(";");
                    //abrigosCSV.add(new Abrigo(abrigoLine[0], abrigoLine[1], abrigoLine[2], abrigoLine[3], abrigoLine[4], abrigoLine[5], abrigoLine[6]));
                    line = br.readLine();
                }
                catch (Exception e){
                    System.out.println("CSV incompátivel!");
                    line = null;
                    abrigosCSV.clear();
                }
            }
            return abrigosCSV;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
