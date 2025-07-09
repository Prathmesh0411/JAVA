import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class firstprogwte {
    public static void main(String[] args) throws IOException {
        FileOutputStream Fb = new FileOutputStream("C:\\Users\\admin\\Desktop\\prathamesh\\input.txt",true);
        BufferedOutputStream Bo = new BufferedOutputStream(Fb);
        String S = "\nHeyy, im Prathmesh";
        byte[]arr = S.getBytes();
        Bo.write(arr);

        Bo.close();
        Fb.close();

    }
    
}

