package springcor;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class One {
	public static void main( String[] args )
    {
    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("applicationC.xml");  
        ActBankC obj=(ActBankC)applicationcontext.getBean("Obj");  
        obj.withdraw();     
        }
	
	
}
	


