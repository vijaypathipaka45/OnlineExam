package com.posidex.test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;


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
//
//	public void robotActions(String str) {		
//		//A robot can only move in four directions , UP(U), DOWN(D),LEFT(L),RIGHT(R). Given a string consisting of instructions to move , output the co-ordinates of robot after the executing the instructions. Initial position of robot is at origin(0,0).
//
//		//	LURLDRURLD
//		str="LURLDRURL";
//		str.chars().forEach(c->{if(c=='L') {
//			System.out.println("robot moving to Left");
//		}else if(c=='U') {
//			System.out.println("robot moving to UP");
//		}else if(c=='R') {
//			System.out.println("robot moving to Right");
//		}
//		else{
//			System.out.println("robot moving to Down");
//		}});
//		
//	}
//	public void main(String []args) {
// List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//		 
//		 List<Integer> evenlist=list.stream().filter(evenint-> evenint%2==0).collect(Collectors.toList());
//		 
//		 List<Integer> emultivenlist= evenlist.stream().map(i->i*10).collect(Collectors.toList());		 
//		 
//		 emultivenlist.forEach(System.out::println);
//		
//		LocalDate dateOfBirth = LocalDate.of(2021, Month.JULY, 25);
//	     LocalDate currentDate = LocalDate.now();
//	     long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
//	     
//	     System.out.println("noof days"+diffInDays);
//	     List<Integer> list=new ArrayList<Integer>();
//	 	list.add(12);
//		list.add(11);
//		list.add(15);
//		list.add(14);
//		list.add(14);
//		list.add(18);
//		list.add(1);
//		list.add(22);
//		
//		
//		Stream<Integer> intstream=list.stream();
//		
//		list.stream().count();
//		
//	int a=	list.stream().max(Integer::compare).get();
//	System.out.println("jbdkjbfjd  "+a);
//	int b=list.stream().max(Integer::compare).get()-2;
//	System.out.println("==============  "+b);
//	
//	int arr[]={1,2,9,8,7,6,5,4,3}; 
//	
//	Arrays.sort(arr);
//	
//	System.out.println("fgnkfdjgkdf========= "+arr[arr.length-2]);
//	
//	//int max = (list).stream().max((i1,i2)->(i1>i2)?1:(i1<i2)-1:0).get();
//	Arrays.stream(arr) 
//    .sorted() 
//    .limit(arr.length-5) 
//    .skip(arr.length-6) 
//    .forEach(System.out::println);
//	
//	getfrequencyNumbers();
//		
//	}
//	
//	public static  void getfrequencyNumbers() {
//		   //Initialize array  
//        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
//        //Array fr will store frequencies of element  
//        int [] fr = new int [arr.length];  
//        
//        int visited = -1;  
//        for(int i = 0; i < arr.length; i++){  
//            int count = 1;  
//            for(int j = i+1; j < arr.length; j++){  
//                if(arr[i] == arr[j]){  
//                    count++;  
//                    //To avoid counting same element again  
//                    fr[j] = visited;  
//                }  
//            }  
//            if(fr[i] != visited)  
//                fr[i] = count;  
//        }  
//  
//        //Displays the frequency of each element present in array  
//        System.out.println("---------------------------------------");  
//        System.out.println(" Element | Frequency");  
//        System.out.println("---------------------------------------");  
//        for(int i = 0; i < fr.length; i++){  
//            if(fr[i] != visited)  
//                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
//        }  
//        System.out.println("----------------------------------------");  
//    }
//
//
//}
public static void main(String[] args) {
		
		
	
	Test t=new Test();
	
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
 
