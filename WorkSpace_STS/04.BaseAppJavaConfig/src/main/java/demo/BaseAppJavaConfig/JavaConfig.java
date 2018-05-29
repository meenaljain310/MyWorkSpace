package demo.BaseAppJavaConfig;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.beans.Customer;
import demo.repo.WalletRepoImp;

@Configuration
//@ComponentScan
public class JavaConfig {
	@Bean(value="data")
	public Map<String,Customer> getMap()
	{
		return new HashMap<String,Customer>();
	}
	  @Bean(name="repo")
	    public WalletRepoImp getRepo()
	    {
	    	WalletRepoImp repo = new WalletRepoImp(getMap());
	    	return repo;
	    }
	
	


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
    	
    
    
	
	
	
	
	
	
}
