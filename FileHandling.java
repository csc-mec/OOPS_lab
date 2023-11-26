import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {
    public static void main(String[] args) throws Exception{
        
        //Open a file 
        File file = new File("demo.txt");

        //try creating file if exists already print so
        if(file.createNewFile()){
            System.out.println("File created");
        }
        else{
            System.out.println("File already exits");
        }

        //Set a string to be written into file
        String toWrite = "Hello world";

        //Create FileOutputStream object with opened file
        FileOutputStream fos = new FileOutputStream(file);
        
        //FileOutputStream Can only Write one character at a time so create a loop to assign characters one by one
        for(int i=0 ; i<toWrite.length() ; i++){
            fos.write(toWrite.charAt(i));
        }

        System.out.println();

        
        //Close FileOutputStream object
        fos.close();


        //Create FileInputStream object with opened file
        FileInputStream fis = new FileInputStream(file);

        /*
         * Read each character with a loop
         * since read() method reads ASCII use int to store current character 
         * when current character is -1 (End of File) exit the loop
         * typecast the int to char while printing 
        */
        while(true){
            int c = fis.read();
            if(c==-1){
                break;
            }
            System.out.print((char)c);
        }

        //Close FileInputStream
        fis.close();
    }
}
