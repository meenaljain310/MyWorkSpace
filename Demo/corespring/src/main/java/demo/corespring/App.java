package demo.corespring;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("demo/corespring/beanconfig.xml");
    	MessageService service = ctx.getBean("msg",MessageService.class);
    	MessageService service1 = ctx.getBean("msg",MessageService.class);
    	/*System.out.println(service);
    	System.out.println(service1);*/
    //	System.out.println(service==service1);
    	
        service.printMessage();
    
        
    }
}