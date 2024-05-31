/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
class Propagate {
    public static void main(String[] args)
    {
        try
        {
        System.out.println(reverse());
        }
        catch(Exception e)
        {
        System.out.println("The String was blank");
        }
        finally
        {
        System.out.println("All done");
        }
    }
    public static String reverse(String s) throws Exception
    {
        if(s.length()==0)
        {
        throw new Exception();
        }
        String reverseStr = "";
        for(int i=s.length()-1 ; i>=0 ; --i){
        reverseStr+=s.charAt(i);
        }
        return reverseStr;
    }
}