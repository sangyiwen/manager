/**
 *
 */
package manager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.winwho.common.id.uc.IdWorker;

/**
 * Entity AdvOwner
 * @copyright {@link winwho.com}
 * @author simon.sang<Auto generate>
 * @version  2015年6月26日 下午3:20:59
 */
public class ApplicationContextTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IdWorker idWorker = ctx.getBean("idWorker", IdWorker.class);
		
		System.out.println(idWorker.nextId());
		
	}

}
