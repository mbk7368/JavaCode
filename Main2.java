import java.io.File;

public class Main2 {
        
    public static boolean moveTheFile( File file) {

        String sep = File.separator;
        String path = sep + "C:" + sep + "DE" + sep;
        path = path + file.getName();

        File newLocation = new File(path);
        return file.renameTo(newLocation);
    }


    public static void main(String[] args) {

    File Neo = new File("C:\\JavaCode\\Neo.txt"); 

    moveTheFile(Neo);
    }

}
