package Case_study.utils.class_ReadAndWrite;

import Case_study.models.Booking;
import Case_study.utils.ReadAndWriteBooking;

import java.io.*;
import java.util.Collection;

public class ReadAndWriteBookingImp implements ReadAndWriteBooking {
    @Override
    public void writeFile(String path, Collection<Booking> collection) {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(collection);
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }

    @Override
    public Collection<Booking> readFile(String path) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Collection<Booking> collection = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            collection = (Collection<Booking>) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return collection;

    }
}
