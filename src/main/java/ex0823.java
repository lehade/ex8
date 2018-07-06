import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex0823 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();



            String word;
            for (int i = 0; i < s.length(); i++) {
                int l=s.indexOf(" ", i);

                word=s.substring(0,l+1)+ s.substring(l+1, l+2).toUpperCase()+s.substring(l+2) ;

                s=word;
            }
            System.out.print(s);

        }

}