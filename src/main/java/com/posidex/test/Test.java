package com.posidex.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Test {
	
	
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
 
