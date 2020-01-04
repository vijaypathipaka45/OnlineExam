package com.posidex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.posidex.api.dto.ExamQuestionAndOptions;
import com.posidex.api.dto.QuestionAndAnswerOptions;

@RestController
public class ExamController {

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value="getAllExamQuestions",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<ExamQuestionAndOptions> getAllExamQuestions() {
		
		List<ExamQuestionAndOptions> examquestionList=new ArrayList<ExamQuestionAndOptions>();
		ExamQuestionAndOptions first=new ExamQuestionAndOptions();//both
		first.setQuestion("What is ReactJS?");
		first.setFirstOption("Server-side Framework");
		first.setSecondOption("User-interface framework");
		first.setThirdOption("Both");
		first.setFourthOption("None");
		ExamQuestionAndOptions second=new ExamQuestionAndOptions();//this.state
		second.setQuestion("How can you access the state of a component from inside of a member function ?");
		second.setFirstOption("this.getState()");
		second.setSecondOption("this.prototype.stateValue");
		second.setThirdOption("this.state");
		second.setFourthOption("this.values");
		ExamQuestionAndOptions third=new ExamQuestionAndOptions();//second
		third.setQuestion("How can you access the state of a component from inside of a member function");
		third.setFirstOption("Mounting, Unmounting");
		third.setSecondOption("getInitialState, componentWillMount");
		third.setThirdOption("Before, After");
		third.setFourthOption("did,will");
		ExamQuestionAndOptions fourth=new ExamQuestionAndOptions();//correct
		fourth.setQuestion("Once you create an element, React you can’t change its children or attributes?");
		fourth.setFirstOption("Correct");
		fourth.setSecondOption("Wrong");
		fourth.setThirdOption("Either fisrt or Second");
		fourth.setFourthOption("Neither firt nor second");
		ExamQuestionAndOptions fifth=new ExamQuestionAndOptions();//FB
		fifth.setQuestion("Who Develop React.js?");
		fifth.setFirstOption("Google");
		fifth.setSecondOption("FaceBook");
		fifth.setThirdOption("Twitter");
		fifth.setFourthOption("Micrisoft");
		ExamQuestionAndOptions sixth=new ExamQuestionAndOptions();//No One
		sixth.setQuestion("React.s focuses on which of the following part when considering MVC?");
		sixth.setFirstOption("M");
		sixth.setSecondOption("V");
		sixth.setThirdOption("No One");
		sixth.setFourthOption("C");
		ExamQuestionAndOptions seventh=new ExamQuestionAndOptions();//setState
		seventh.setQuestion("Which is used to update the state?");
		seventh.setFirstOption("setState");
		seventh.setSecondOption("setInitialnumber");
		seventh.setThirdOption("setnumber");
		seventh.setFourthOption("setnumber");
		ExamQuestionAndOptions eighth=new ExamQuestionAndOptions();//store
		eighth.setQuestion("Which is used to keep the value of components unique?");
		eighth.setFirstOption("Ref");
		eighth.setSecondOption("Key");
		eighth.setThirdOption("Store");
		eighth.setFourthOption("Data");
		ExamQuestionAndOptions nineth=new ExamQuestionAndOptions();//prop
		nineth.setQuestion("Which is used to keep the value of components unique?");
		nineth.setFirstOption("State");
		nineth.setSecondOption("Props");
		nineth.setThirdOption("render");
		nineth.setFourthOption("renderComponent");
		ExamQuestionAndOptions ten=new ExamQuestionAndOptions();//getInitialState
		ten.setQuestion("Which is used to keep the value of components unique?");
		ten.setFirstOption("getDefaultProps");
		ten.setSecondOption("getPropsValue");
		ten.setThirdOption("getInitialState");
		ten.setFourthOption("getWillState");
		
		
		examquestionList.add(first);
		examquestionList.add(second);
		examquestionList.add(third);
		examquestionList.add(fourth);
		examquestionList.add(fifth);
		examquestionList.add(sixth);
		examquestionList.add(seventh);
		examquestionList.add(eighth);
		examquestionList.add(nineth);
		examquestionList.add(ten);
		return examquestionList;
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value="submitAnswers")
	public Map<String,String> submitExam() {
	
	List<QuestionAndAnswerOptions> list =new ArrayList<QuestionAndAnswerOptions>();
		
		System.out.println("the answers are ");
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("1","3");
		map.put("3","2");
		map.put("2","4");
		map.put("5","1");
		
		return map;
	}
	int count=0;
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(value="submitPostAnswers",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String submitPostExam(@RequestBody Map<String,String> submittedAnswers) {
	
		count=0;
		
		
		System.out.println("the answers are "+submittedAnswers.get("string"));
		
		String str="asdf";
		str.equals(str);
				
		ObjectMapper mapper = new ObjectMapper();
		 
		 
        /**
         * Read JSON from a file into a Map
         */
        try {
            Map<String, String> carMap = mapper.readValue(submittedAnswers.get("string"), new TypeReference<Map<String, String>>() {
            });
 
          
            carMap.forEach((key,value)->{
            
            	System.out.println("for each loop++++++++++++++++++++++++++++++++++++++++++++++");
            	
            	
            	
            
            	if(key.equals("0")&&value.equals("3")) {
            		
            		count++;
            		System.out.println("0 question "+count);
            	}
            	
            	else if(key.equals("1")&&value.equals("3")) {
            		count++;
            		System.out.println("1 question "+count);
            	}
 
            	else if(key.equals("2")&&value.equals("2")) {
            		count++;
            		System.out.println("2 question "+count);
            	}
            
            	else if(key.equals("3")&&value.equals("1")) {
            		count++;
            		System.out.println("3 question "+count);
            	}
            
            	else if(key.equals("4")&&value.equals("2")) {
            		count++;
            		System.out.println("4 question "+count);
            	}
            	
            	else if(key.equals("5")&&value.equals("3")) {
            		count++;
            		System.out.println("5 question "+count);
            	}
            
            	else if(key.equals("6")&&value.equals("1")) {
            		count++;
            		System.out.println("6 question "+count);
            	}
            
            	else if(key.equals("7")&&value.equals("3")) {
            		count++;
            		System.out.println("7 question "+count);
            	}
            
            	else if(key.equals("8")&&value.equals("2")) {
            		count++;
            		System.out.println("8 question "+count);
            	}
            
            	if(key.equals("9")&&value.equals("3")) {
            		count++;
            		System.out.println("9 question "+count);
            	}
            /*switch(Integer.parseInt(key)) {
            case 0:
            	if(value.equals("3")) {
            		
            		count++;
            		System.out.println("0 question "+count);
            	}
            case 1:	
            	if(value.equals("3")) {
            		count++;
            		System.out.println("1 question "+count);
            	}
            case 2:	
            	if(value.equals("2")) {
            		count++;
            		System.out.println("2 question "+count);
            	}
            case 3: 	
            	if(value.equals("1")) {
            		count++;
            		System.out.println("3 question "+count);
            	}
            case 4:
            	if(value.equals("2")) {
            		count++;
            		System.out.println("4 question "+count);
            	}
            case 5:	
            	if(value.equals("3")) {
            		count++;
            		System.out.println("5 question "+count);
            	}
            case 6:	
            	if(value.equals("1")) {
            		count++;
            		System.out.println("6 question "+count);
            	}
            case 7:	
            	if(value.equals("3")) {
            		count++;
            		System.out.println("7 question "+count);
            	}
            case 8:	
            	if(value.equals("2")) {
            		count++;
            		System.out.println("8 question "+count);
            	}
            case 9:	
            	if(value.equals("3")) {
            		count++;
            		System.out.println("9 question "+count);
            	}
            }*/
            
            
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
 	
		
		return String.valueOf(count);
	}
}
