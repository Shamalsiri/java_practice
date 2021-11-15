package com.shamal.test;

import java.io.*;

public class fileOperations {
    protected fileOperations()
    {
        System.out.println("Creating Sub folder structure");
        String dirPath = "folder"+File.separator+"subFolder";
        File dir = new File(dirPath);
        if(!dir.exists())
        {
            dir.mkdirs();
        }

        //Creating a File
        File file = new File(dir + File.separator + "file.txt");
        //File file = new File("file.txt");
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("File Information: ");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println("File Can Write: "+ file.canWrite()+"\n");

/*        //Writing a File
        System.out.println("Writing to file running...");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("This is the first line!");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading a File
        System.out.println("Reading from file running...");
        try {
            FileReader fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1)
            {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // Using output stream to write to file
        System.out.println("File Output Stream Writing running...");
        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "File Output Stream write";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using Input stream to read from file
        System.out.println("File Input Stream Reading running...");
        try {
            FileInputStream is = new FileInputStream(file);
            System.out.println("Printing from file:");
            int i;
            while ((i = is.read()) != -1)
            {
                System.out.print((char) i);
            }
            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nCan Delete File here");
        //file.delete();
    }
}
