package padraodecorator;

import java.io.IOException;


public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super();
    }
    
   
    public int read() {
        int c = super.read();
        return (c==-1? c: Character.toLowerCase((char) c));
    }
   
    public int read(byte[] b, int offset, int len) {
        int result = super.read(b,offset,len);
        
        for(int i=offset; i<offset+result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
