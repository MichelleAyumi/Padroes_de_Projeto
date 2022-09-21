package padraodecorator;

import java.io.IOException;

public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;
        InputStream in =
                new LowerCaseInputStrem(
                        new BufferedInputStream(
                                new FileInputStream("teste.txt") {}));
        while ((c=in.read())>=0){
            System.out.print((char )c);
        }
        in.close();
}
}
