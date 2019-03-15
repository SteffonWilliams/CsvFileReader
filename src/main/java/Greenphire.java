import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greenphire {

    public static void main(String[] args) {

        Person p = new Person();

        List<List<String>> info = readCSV("greenphire_sample_data.csv");

        System.out.println(info);


        for(int i = 1; i < info.size(); i++){

            List<String> data = info.get(i);

            String name = data.get(0);

            System.out.println(name.substring(0,1));
        }





    }

    public static List<List<String>> readCSV(String file) {


        List<List<String>> records = new ArrayList<List<String>>();
        try {
                CSVReader csvReader = new CSVReader(new FileReader(file));
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        }


        catch(IOException e){
            e.printStackTrace();
        }

        return records;

        }

}

