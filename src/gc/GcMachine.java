package gc;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GcMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<GarbageCollectorMXBean> gs = ManagementFactory.getGarbageCollectorMXBeans();
		for(GarbageCollectorMXBean g:gs){
			System.out.println(g.getName());
		}

	}

}
