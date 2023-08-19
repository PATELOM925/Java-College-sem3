import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class module_3{

    public static void main(String[] args) {
        try
        {
            filereader fr;
            fr = new filereader("lower.rtf");
            bufferedreader br;
            br = new bufferedreader(fr);
            filewriter fw = new filewriter("upper.rtf");
            printwriter pw;
            pw = new printwriter(String.valueOf(fw));

            boolean l;
            while ((l = br.readline() != null) ){
            System.out.println(l.toUppercase());
        }
            br.close();
            pw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

