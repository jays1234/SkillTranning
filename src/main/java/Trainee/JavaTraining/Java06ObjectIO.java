package Trainee.JavaTraining;

import Trainee.model.DataWriteFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by phirayu on 7/17/15.
 */
public class Java06ObjectIO {
    Logger logger = LoggerFactory.getLogger(Java06ObjectIO.class);
    public static void main(String[] args){
        String path = "/home/phirayu/text/Object.ser";
        Java06ObjectIO java06ObjectIO = new Java06ObjectIO();
        //java06ObjectIO.writeObject(path);
       java06ObjectIO.readObject(path);


    }
    private void readObject(String path){
        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            DataWriteFile dataWriteFile  = (DataWriteFile)objectInputStream.readObject();

            logger.info("Read Object DataWriteFile , name ={} , lastname ={}", dataWriteFile.getName(), dataWriteFile.getLastname());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void writeObject(String path){

        DataWriteFile dataWriteFile = new DataWriteFile("phirayu","Songyothin");

        File file = new File(path);

        try {
            logger.info(file.getParent());
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(dataWriteFile);
            dataWriteFile = new DataWriteFile("aaaa", "bbbb");
            objectOutputStream.writeObject(dataWriteFile);
            objectOutputStream.close();
            logger.info("Write Success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
