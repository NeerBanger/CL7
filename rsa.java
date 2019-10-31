/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neer
 */
import java.util.*;
import java.util.Scanner.*;
 
public class rsa {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter two prime numbers e and M:");
        int p=in.nextInt();
        int q=in.nextInt();
        int e=in.nextInt();
        int M=in.nextInt();
        int phi=(p-1)*(q-1);
        int i=1;
        int d;
        if(((phi*i)+1)%e ==0)
            d=((phi*i)+1)/e;
            
        else    
        {
            i=i+1;
            while(true)
            {
                if((((phi*i) + 1) % e)==0)
                {
                    d=((phi*i)+1)/e;
                    break;
                }
                else{
                    i=i+1;
                }
            }
        }
        System.out.println("value of phi is:" +phi);
        System.out.println("value of d is:" +d);
        
        System.out.println("value of public key is:{"+e+","+(p*q)+"}");
        System.out.println("value of private key is:{"+d+","+(p*q)+"}");
        double C=Math.pow(M,e)%(p*q);
        int C1= (int) C;
        System.out.println("value of C is:"+C1);
        System.out.println("value of M is:"+M);
        
	}

}
        
/* …OUTPUT…

Enter two prime numbers e and M: 17
11
7
88
value of phi is:160
value of d is:23
value of public key is:{7,187}
value of private key is:{23,17,11}
value of C is:11
value of M is:88
*/
