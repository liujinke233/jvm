package conversion;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Conversion {

	//将inputstream转化为数组byte[]
	public static byte[] readStream(InputStream inStream) throws Exception{     
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();  
        byte[] buffer = new byte[1024];     
        int len = -1;     
        while((len = inStream.read(buffer)) != -1){     
          outStream.write(buffer, 0, len);      
        }       
        outStream.close();      
        inStream.close();  
        return outStream.toByteArray();     
      }  
}
