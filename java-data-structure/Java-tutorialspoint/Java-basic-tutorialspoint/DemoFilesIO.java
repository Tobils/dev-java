import java.io.IOException;

public class DemoFilesIO
{
    public static void main(String[] args) throws IOException
    {
        /**
         * declare new class for copy file and run method copy file
         */
        FilesIO filesio = new FilesIO();
        filesio.copyFile();

        filesio.readConsole();

        String dir_name = "Java-basic-tutorialspoint";
        filesio.createDirectory(dir_name);

        filesio.listDirectory();
    }
}

/**
 * catatan penting !!!!!!
 * wajib menambahkan throws IOException apabila menggunakan java.io.* 
 * jika tidak akan terjadi error karena tidak ada error handling
 * throws IOException di tempatkan pada main program dan pada method yang menggunakan io
 */