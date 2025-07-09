import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class firstdynamic{
    public static void main(String[] args) throws IOException {
        Scanner se = new Scanner(System.in);
        String S =  se.nextLine();
        FileOutputStream Fb = new FileOutputStream("C:\\Users\\admin\\Desktop\\prathamesh\\input.txt",true);
        BufferedOutputStream Bo = new BufferedOutputStream(Fb);
        byte[]arr = S.getBytes();
        Bo.write(arr);

        Bo.close();
        Fb.close();

    }
    
}
