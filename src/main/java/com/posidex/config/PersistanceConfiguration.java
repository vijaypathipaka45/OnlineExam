package com.posidex.config;


import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource({"daoSqlScripts.properties","application.yml"})
public class PersistanceConfiguration {
	
		    @Autowired
		    private Environment env;
		    
		 
		    @Bean
		    public JdbcTemplate jdbcTemplate(DataSource dataSource)
		    {
		        return new JdbcTemplate(dataSource);
		    }
		 
		    @Bean
		    public PlatformTransactionManager transactionManager(DataSource dataSource)
		    {
		        return new DataSourceTransactionManager(dataSource);
		    }
		 
		
/*		    @Bean
		    public DataSource jndiDataSource() throws IllegalArgumentException, NamingException 
		    {
		        JndiObjectFactoryBean bean = new JndiObjectFactoryBean();    
		        bean.setJndiName("java:/comp/env/jdbc/posidex");

		        bean.setProxyInterface(DataSource.class);
		        bean.setLookupOnStartup(false);
		        bean.afterPropertiesSet();
		        
		        return (DataSource) bean.getObject();
		    }
*/		 
		 //if you want to use embeded tomcat as server and resource configure below configurations one of them
		 
		   
		   @Bean
			 public TomcatEmbeddedServletContainerFactory tomcatFactory() {
			        
				 return new TomcatEmbeddedServletContainerFactory() {
			          
			           @Override
			           protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(Tomcat tomcat) 
			           {
			                tomcat.enableNaming();
			                return super.getTomcatEmbeddedServletContainer(tomcat);
			            }
			        	
			            @Override
			            protected void postProcessContext(Context context) 
			            {
			                ContextResource resource = new ContextResource();

			                resource.setType(DataSource.class.getName());
			                resource.setName("jdbc/posidex");

			                resource.setProperty("factory", "spring.datasource.");

			                //resource.setProperty("driverClassName", "com.mysql.jdbc.Driver");

			                resource.setProperty("url", "spring.datasource.url");

			                resource.setProperty("username", env.getProperty("spring.datasource.username"));

			                resource.setProperty("password", env.getProperty("spring.datasource.password"));

			                
			                context.getNamingResources().addResource(resource);
			            }
			        };
			    }
		    
		 /*   @Bean
			public TomcatEmbeddedServletContainerFactory tomcatFactory() {
			  *//**
			   * if datasouce defind in tomcat xml 
			   * configuration then no need to create this bean
			   *//*
			    return new TomcatEmbeddedServletContainerFactory() {
			   	@Override
			   	public TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(Tomcat tomcat) {
			   		tomcat.enableNaming();
			   		return super.getTomcatEmbeddedServletContainer(tomcat);
			   	}
			   	@Override                         //create JNDI resource
			   	protected void postProcessContext(Context context) {
			   		ContextResource resource = new ContextResource();
			                            resource.setName("jndiDataSource");
			                            resource.setType(DataSource.class.getName());
			                            resource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
			                            resource.setProperty("driverClassName", "oracle.jdbc.driver.OracleDriver");
			                            resource.setProperty("url", "jdbc:oracle:thin:@192.168.1.148:1524:pdborcl");
			                            resource.setProperty("username", "rbl_dev_one");
			                            resource.setProperty("password", "posidex");
			            context.getNamingResources().addResource(resource);
			   	}
			   	
			   	protected void postProcessContext(Context context) {
			   		ContextResource resource = new ContextResource();
			                            resource.setName("jndiDataSource");
			                            resource.setType(DataSource.class.getName());
			                            resource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
			                            resource.setProperty("driverClassName", "org.h2.Driver");
			                            resource.setProperty("url", "jdbc:h2:tcp://localhost/~/test");
			                            resource.setProperty("username", "sa");
			                            resource.setProperty("password", "sa");
			            context.getNamingResources().addResource(resource);
			   	}
			    };
		   }
		   
		 */
		    
		    /*  
		    
			   //if you want to use basicdatasource or drivermanagerdatasource or any other datasource use below code
			   
			    @Bean
			    public DataSource dataSource() throws DecoderException, PosidexException
			    {
			    	BasicDataSource dataSource = null;
			    	//DriverManagerDataSource dataSource=null;
			       try { 
			    	   dataSource=new BasicDataSource();
			    	    dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
				        dataSource.setUrl(env.getProperty("jdbc.url"));
				        dataSource.setUsername(env.getProperty("jdbc.username"));
				      dataSource.setPassword(env.getProperty("jdbc.password"));
				        //dataSource.setPassword(StringEncrypter.decrypt(env.getProperty("jdbc.password.encript")));
				      abc=new  posidex.aqjms.spring.OracleAqConnectionFactoryInitialiser();
				      abc.setURL(env.getProperty("jdbc.url"));
				      abc.setUserName(env.getProperty("jdbc.username"));
				      abc.setPassword(env.getProperty("jdbc.password.encript"));
				      
				     
			       }
			       catch(Exception e) {
			    	   e.printStackTrace();
			    	   logger.error("while getting datasource got an exception:"+e.getMessage());
			       }
						
			        return dataSource;
			    }*/
		    
		/*
		  
		    //If you want to use external tomcat jndi resource please configure below <Resouce> tag in context.xml file (context.xml file path Tomcat/conf/context.xml)
		    
		    <Resource auth="Container" driverClassName="oracle.jdbc.driver.OracleDriver" 
	                maxActive="20" 
	                maxIdle="0" 
	                maxWait="10000" 
	                name="jdbc/posidex" 
	                password="posidex" 
	                username="reliance_mig"
	                type="javax.sql.DataSource" 
	                url="jdbc:oracle:thin:@192.168.1.148:1524:pdborcl"/>*/
		    
	}


