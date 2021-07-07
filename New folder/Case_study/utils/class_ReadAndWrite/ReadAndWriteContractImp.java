package Case_study.utils.class_ReadAndWrite;

import Case_study.models.Contract;
import Case_study.utils.ReadAndWriteContract;

import java.io.*;
import java.util.Collection;

public class ReadAndWriteContractImp implements ReadAndWriteContract {

    @Override
    public void writeFile(String path, Collection<Contract> collection) {
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
    public Collection<Contract> readFile(String path) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Collection<Contract> collection = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            collection = (Collection<Contract>) objectInputStream.readObject();
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

    @Override
    public void clear(String path){
        try {
            File file = new File(path);
            if (file.delete()){
                System.out.println("file was deleted");
            }else {
                System.out.println("cannot delete");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
