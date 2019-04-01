/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam_week4;

/**
 *
 * @author RGUKT
 */
import java.util.*;


 class Solution {

   static Stack<Integer> s=new Stack<Integer>();
    static void remove()
    {
        if(!s.empty())
            s.remove(0);
    }
    static void printtop()
    {
        if(!s.empty())
            System.out.println(s.firstElement());
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int choice=scan.nextInt();
            switch(choice)
                    {
                case 1:s.push(scan.nextInt());
                        break;
                case 2: remove();
                        break;
                case 3: printtop();
                        break;
                    }
        }
    }
}