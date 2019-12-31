/**
 * source java files io : https://www.tutorialspoint.com/java/java_files_io.htm
 */

import java.io.*;
import java.nio.file.*;

public class FilesIO
{
    /**
    * copy file dari satu file ke file lain.
    */
    public void copyFile() throws IOException
    {
        // FileInputStream in = null;
        // FileOutputStream out = null;

        FileReader in = null;
        FileWriter out = null;
        
        try
        {
            // in = new FileInputStream("angka.txt");
            // out = new FileOutputStream("angka-copy.txt");

            in = new FileReader("angka.txt");
            out = new FileWriter("angka-copy.txt");

            int data_read;
            while ((data_read = in.read()) != -1)
            {
                out.write(data_read);
            }
        }finally
        {
            if(in != null)
            {
                in.close();
            }
            if(out != null)
            {
                out.close();
            }
        }
    }

    /**
    * readconsole atau membaca masukan dari keyboard.
    */
    public void readConsole() throws IOException
    {
        InputStreamReader cin = null;

        try
        {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter character, \"q\" to quit");
            char input_user;

            do
            {
                input_user = (char) cin.read();
                System.out.println(input_user);
            }while(input_user != 'q');
        }finally
        {
            if(cin != null)
            {
                cin.close();
            }
        }
    }

    /**
    * create directory
    */
    public void createDirectory(String dir_name)
    {
        File d = new File(dir_name);
        
        // create directory now
        d.mkdirs();
    }

    /**
    * Listing Directories
    */
    public void listDirectory()
    {
        File file = null;
        String[] paths;

        try
        {
            // get current paths
            Path currentRelativePath = Paths.get("");
            String current_path = currentRelativePath.toAbsolutePath().toString(); 

            // current paths
            file = new File(current_path);

            // arrays of files and directory
            paths = file.list();

            // prints all file and directory
            for(String path : paths)
            {
                System.out.println(path);
            }
        }catch (Exception e)
        {
            // if any errors occures
            e.printStackTrace();
        }
    }


}


/**
 * kita bisa menggunakan FileInputStream dan FileOutputStream
 * juga bisa menggunakan FileReader dan FileWriter
 * 
 * apa bedanya ?
 * FileInputStream dan FileOutputStream perform input output 8-bit bytes at a times
 * sedangkan
 * FileReader dan FileWriter perform input output 2-bit bytes at a times
 */