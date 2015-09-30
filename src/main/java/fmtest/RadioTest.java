package fmtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * Created by dfn on 15/9/28.
 */
@Component
public class RadioTest {

    @Autowired
    private RadioOperatorMapper radioOperatorMapper;

    @PostConstruct
    public void main(String[] args) throws IOException {
        System.out.println("radioOperatorMapper:"+radioOperatorMapper);

        InputStream inputStream = RadioTest.class.getResourceAsStream("radio.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String line;

        while ( (line = br.readLine()) != null) {
            String[] fields = line.replaceAll("^\\s+","").split("\\s+");
            if (fields.length == 1) {
                System.out.println("save city"+fields[0]);
            } else if (fields.length == 3) {
                System.out.println("save fm" + fields[ 0 ] + "," + fields[1]+","+fields[2] );
            } else {
                System.err.printf("row data error:%s\n", line);
            }
        }
    }
}
