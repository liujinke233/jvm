package classloader;

import java.util.concurrent.SynchronousQueue;

import gc.GcBean;

public class Loader {

	public static void main(String[] args) throws Exception {

			MyLoader myLoader = new MyLoader();
			Class<?> loadClass = myLoader.loadClass("classloader.t.LoaderBean");
			System.out.println(loadClass.newInstance());
			System.out.println(loadClass);
			System.out.println(loadClass.getClassLoader());
			
//			Class<?> forName = Class.forName("People", true, myLoader);
//			Object obj = forName.newInstance();
//			System.out.println(obj);  
//			System.out.println(obj.getClass().getClassLoader());
		
	}
	
}
