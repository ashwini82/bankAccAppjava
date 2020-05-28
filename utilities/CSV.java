package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    public static List<String[]> readMe(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader brf = new BufferedReader(new FileReader(file));
            while ((dataRow = brf.readLine()) != null)

            {
                String[] datarec = dataRow.split(",");
                data.add(datarec);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File could not find");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File could not read");
            e.printStackTrace();
        }

        return data;
    }

}