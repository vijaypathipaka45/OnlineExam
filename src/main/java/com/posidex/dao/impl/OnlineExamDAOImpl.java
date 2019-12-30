package com.posidex.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.posidex.api.dto.LoginDetails;
import com.posidex.api.dto.UserDetails;
import com.posidex.dao.OnlineExamDAO;
import com.posidex.exception.DAOException;

@Repository
public class OnlineExamDAOImpl implements OnlineExamDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Environment environament;
	
	@Override
	public void userRegistration(UserDetails userdetails) {
		
		System.out.println("inside dao" +userdetails);
		
		int i=jdbcTemplate.update(environament.getProperty("USERREGISTRATION_INSERT_QUERY"), new Object[]{
				
				userdetails.getUserName(),
				userdetails.getEmailId(),
				userdetails.getPassword(),
				userdetails.getFirstName(),
				userdetails.getMiddleNmae(),
				userdetails.getLastName()		
				
		});
		
	}
	
 
	public UserDetails getUserLoginDetails(LoginDetails loginDetails) throws DAOException {
		
		System.out.println("inside Userlogindetsils ");
		UserDetails userDetails=null;
		try {
		userDetails= jdbcTemplate.queryForObject(environament.getProperty("USERLOGIN_DETAILS_FETCHING_QUERY"),new Object[]{loginDetails.getEmailId(),loginDetails.getPassword()}, new RowMapper<UserDetails>(){
 
            public UserDetails mapRow(ResultSet rs, int rownum)
                    throws SQLException {
            	UserDetails user = new UserDetails();
            	
            	user.setEmailId(rs.getString("EMAILID"));
            	user.setFirstName(rs.getString("FIRSTNAME"));
            	user.setImage(rs.getString("PHOTO"));
            	user.setLastName(rs.getString("LASTNAME"));
            	user.setMiddleNmae(rs.getString("MIDDLENAME"));
            	user.setUserName(rs.getString("USERNAME"));
            	user.setMessage("login success");
                
                return user;
            }
            
        });
		}
		catch(Exception e) {
			System.out.print("while fetching login details got an error "+e.getMessage());
			if(e.getMessage().contains("ncorrect result size: expected 1, actual")) {
			throw new DAOException("given username or password incorrect");
			}
			else {
				
				throw new DAOException(e.getMessage());
			}
		}
				
		return userDetails;
	}


	

}
