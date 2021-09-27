package com.posidex.test;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;


//
//import java.time.LocalDate;
//import java.time.Month;
//import java.time.temporal.ChronoUnit;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
public class Test {

	
	public void robotActions() {		
		//A robot can only move in four directions , UP(U), DOWN(D),LEFT(L),RIGHT(R). Given a string consisting of instructions to move , output the co-ordinates of robot after the executing the instructions. Initial position of robot is at origin(0,0).
		//	LURLDRURLD
		String str="LURLDRURL";
		int leftCount=0;
		int rightCount=0;
		int upCount=0;
		int downCount=0;

		for(int i=0;i<str.length();i++)	{
		if(str.charAt(i)=='L') {
			//System.out.println("robot moving to Left");
			leftCount++;
		}else if(str.charAt(i)=='U') {
			//System.out.println("robot moving to UP");
			upCount++;
		}else if(str.charAt(i)=='R') {
			//System.out.println("robot moving to Right");
			rightCount++;
		}
		else{
			//System.out.println("robot moving to Down");
			downCount++;
		}
		}
		
		System.out.println("the robot position ("+(rightCount-leftCount)+","+(upCount-downCount)+")");
				
	}
	
	public void filteringmultiflyingUsingJava8() {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		 
		List<Integer> evenlist=list.stream().filter(evenint-> evenint%2==0).collect(Collectors.toList());
		 
		List<Integer> emultivenlist= evenlist.stream().map(i->i*10).collect(Collectors.toList());		 
		 
		emultivenlist.forEach(System.out::println);
		
	}
	
	public void twoDatesBetweenNoofDaysJava8() {
		
		LocalDate dateOfBirth = LocalDate.of(2021, Month.JULY, 25);
		LocalDate currentDate = LocalDate.now();
		long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
		System.out.println("noof days"+diffInDays);
		
	}
	
	public void streamExamplewithNumbersJava8() {
	    
	    List<Integer> list=new ArrayList<Integer>();
	 	list.add(12);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(14);
		list.add(18);
		list.add(1);
		list.add(22);
		
				
		System.out.println("stream count :: "+list.stream().count());
		
		
	int a=	list.stream().max(Integer::compare).get();
	System.out.println("max number fromlist or stream   "+a);
	int b=list.stream().max(Integer::compare).get()-2;
	System.out.println(" maxnumber -2 is  "+b);
	
	int arr[]={1,2,9,8,7,6,5,4,3}; 
	
	Arrays.sort(arr);

	System.out.println("second highest number from array "+arr[arr.length-2]);
	
	//int max = (list).stream().max((i1,i2)->(i1>i2)?1:(i1<i2)-1:0).get();
	System.out.print("applyikng skip and length on the array  ");
	Arrays.stream(arr).sorted().limit(arr.length-5).skip(arr.length-6).forEach(System.out::println);
	

	}

	public void getfrequencyNumbers() {
		   //Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }

public void secondHiestNumberwithoutusingPredefinedTechniques() {
	int arr[]= {1,4,6,8,9,7,3,2};
	
	int first=0,second=0;
	for(int i=0;i<arr.length;i++){
	if(first<arr[i]){
	second=first;
	first=arr[i];
	}
	}
	System.out.println("first number "+first+" second number "+second);
}

public void findingLargestPlindrome() {
	String strarr[]={"aa","aba","bb","ababa","baba","babababab"};
	List<String> li=new ArrayList<String>();

	for(int i=0;i<strarr.length;i++){
	StringBuffer sb=new StringBuffer(strarr[i]);
	String rev=new String(sb.reverse());
	if(strarr[i].equals(rev)){
	li.add(strarr[i]);
	}
	}
	int length=0;
	String polindromeString="";
	for(String str:li){
	if(length<str.length()){
		length=str.length();
		polindromeString=str;
		System.out.println(str);
	}
	}
	System.out.println(length);
	System.out.println("longest polindrom is "+polindromeString);
	
}

public void sumofTwoElementsAs7InAnArray() {
	System.out.println("sumofTwoElementsAs7InAnArray indexes");
	int[] numArr={1,2,3,4,5,6,7,8,9,10,6,5};
	Map<Integer,String> map=new HashMap<>();
	int num=1;
	for(int i=0;i<numArr.length;i++){

	  for(int j=i+1;j<numArr.length;j++){
	  
	  if(numArr[i]+numArr[j]==7){
	  
	  map.put(num,"{"+i+","+j+"}");
	  num++;
	  }
	  
	  }
	}
	map.entrySet().forEach(System.out::println);
	map.entrySet().forEach(m->{
		System.out.println("index::"+m.getValue());

		});
}

public void printingFizzBuzz() {
	
	//Write a program to Print the integers from 1 to 100,
	//but for the multiples of 3, print "Fizz" instead of number and
	//for multiples of 5, print "Buzz" instead of number and
	//for multiples of both 3 and 5, print "FizzBuzz"
	System.out.println("printingFizzBuzz");
	for(int i=1;i<=100;i++) {
				if(i%3==0&&i%5==0) {
					System.out.print("FizzBuzz");
				}
				else if(i%3==0) {
					System.out.print("Fizz");
				}
				else if(i%5==0) {
					System.out.print("Buzz");
				}
				else {
					System.out.print(i);
				}
				
				System.out.print(" - ");
			}
		
}

public void creatingMapfromListModifyingDataBasedonSudentMarks() {
//creating Map from list and desendingorder modifying data based on marks:	student =>marks,name and id
	List<Student> slist=new ArrayList<Student>();
	Student s1=new Student();
	
	List<Student> updatedStudentList =			
			slist.stream().map(s->{	
				if(s.getMarks()<30){
					s.setMarks(s.getMarks()+30);
				 }
				else{
					s.setMarks(s.getMarks()+20);
					}
				return s;
	}).collect(Collectors.toList());
	
	Map<Integer,Student> updatedmap=
			updatedStudentList.stream().sorted(Comparator.comparingInt(Student::getMarks)).collect(
					Collectors.toMap(Student::getId,Function.identity(),(newvalue,oldValue) -> newvalue, TreeMap::new));
	
	
	
		updatedmap.entrySet().forEach(entry->{System.out.println(entry.getKey()+"  "+entry.getValue());});
	
}

private Student getStudent(Student s) {
	
	if(s.getMarks()<30) {
		
		s.setMarks(s.getMarks()+30);
	}else {
		
		s.setMarks(s.getMarks()+20);
	}
	
	return s;
}

public static void main(String[] args) {
	Test t=new Test();
	t.robotActions();
	System.out.println("=================================================");
	t.java8featuremessagableAndAdd();
	System.out.println();
	System.out.println("=================================================");
	t.filteringmultiflyingUsingJava8();
	System.out.println("=================================================");
	t.twoDatesBetweenNoofDaysJava8();
	System.out.println("=================================================");
	t.streamExamplewithNumbersJava8();
	System.out.println("=================================================");
	t.getfrequencyNumbers();
	System.out.println("=================================================");
	t.secondHiestNumberwithoutusingPredefinedTechniques();
	System.out.println("=================================================");
	t.findingLargestPlindrome();
	System.out.println("=================================================");
	t.sumofTwoElementsAs7InAnArray();
	System.out.println("=================================================");
	t.printingFizzBuzz();
	System.out.println("=================================================");
	}

		
public void java8featuremessagableAndAdd() {
	
	BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
	int result = adder.apply(10, 20);  
	System.out.println(result); 
	
	 Messageable hello = Message::new;  
     hello.getMessage("Hello"); 
}	
	
public static void hello() {
		
		
	}
	
public  void hello1() {
		
		
	}

	}
class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}

public static List getresult() {
	
	return new ArrayList<String>();
}

}

interface arith{
	public static List getresult() {
		
		return new ArrayList<String>();
	}
	
}


interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
 
