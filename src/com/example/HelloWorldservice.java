package com.example;

import javax.jws.*;

@WebService()
public class HelloWorldservice
{

@WebMethod()
public String hello(String name)
{
   String res= "Hi" + name;
 System.out.println(res);
	return res;
}

public static void main(String[] args) {
	
	HelloWorldservice service = new HelloWorldservice();
	service.hello("shamik");
	
}

}
