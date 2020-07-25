package org.dxc.ioc.Junit;

import java.util.Scanner;

import org.dxc.ioc.Junit.Service.LoginService;
import org.dxc.ioc.Junit.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        User user=new User();
        System.out.println("enter user name");
        user.setUsername(scanner.nextLine());
        System.out.println("enter user name");
        user.setPassword(scanner.nextLine());
        LoginService loginservice=new LoginService();
        boolean result=loginservice.validateUser(user);
        if(result)
        	System.out.println("un and password is correct yar");
        else
        	System.out.println("un and password is not correct yar");
        
    }
}
