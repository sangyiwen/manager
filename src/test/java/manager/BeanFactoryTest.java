/**
 * 
 */
package manager;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.winwho.common.id.uc.IdWorker;

/**
 * Entity AdvOwner
 * @copyright {@link winwho.com}
 * @author simon.sang<Auto generate>
 * @version  2014-04-13 10:02:46
 */
public class BeanFactoryTest {

	public static void main(String[] args) {
		
		ResourcePatternResolver res = new PathMatchingResourcePatternResolver();
		
		Resource resource = res.getResource("classpath:applicationContext.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		IdWorker idWorker = beanFactory.getBean("idWorker", IdWorker.class);
		
		System.out.println(idWorker.nextId());
		
	}
	
}
