package JavaTraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Scanner;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java06StringIOText {
    Logger logger = LoggerFactory.getLogger(Java06StringIOText.class);


    public static void main(String[] args){
        String path = "/home/phirayu/text/text.txt";
        Java06StringIOText java06StringIOText = new Java06StringIOText();
        java06StringIOText.writeFile(path);
        //java06StringIOText.ReadFile(path);



    }
    private void ReadFile(String path){

        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                logger.info("Read File : {}",line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(String path){
        Scanner input  = new Scanner(System.in);
        logger.info("input  ");
        String name = input.next();

        File file = new File(path);
        if(new File(file.getParent()).mkdirs()){
            logger.info("Create Directory");
        }
        if(!file.exists()){
            try {
                file.createNewFile();
                logger.info("Create File");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(name);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
