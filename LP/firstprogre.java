
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class firstprogre{
    public static void main(String[] args ){
        String path = "C:\\Users\\admin\\Desktop\\prathamesh\\input.txt";
        try{
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream buff = new BufferedInputStream(fis);

            int temp = 0;
            while(true){
                temp = buff.read();
                if(temp == -1){
                    break;
                }
                System.out.print((char)temp);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        
    }
}