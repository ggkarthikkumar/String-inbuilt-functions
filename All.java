package string;
 
import java.util.ArrayList;
import java.util.List;

import string.All;

    public class All {
	String str;
	
	
	public All(String str) 
	{
	    this.str=str;
	}
	
	public String concat(String str1)
	{
		return str+str1;
		
	}

	public char CharAt(int gg)
	{    
		char[] array= str.toCharArray();
		return array[gg] ;
	}

	public String toUpperCase()
	{ 
		int i;
		char array[]=str.toCharArray();
		for(i=0;i<str.length();i++) {	
	    if(array[i]>=97 && array[i]<=122){
	    array[i]= (char)(array[i]-32);
	                                     }
		                            }
		String s1=new String(array);
		return s1;
	}

	public String  toLowerCase()
	{
		int i;
		char array[]=str.toCharArray();
        for(i=0;i<str.length();i++){
        if(array[i]>=65 && array[i]<=90){ 
        array[i]=(char)(array[i]+32);
        		                        }
    		                       }
		String s1=new String(array);

		return s1;
	}
	
	public boolean isEmpty(String str1)
	
	{
	 char array[]= str1.toCharArray();
	 str1.length();
     if(str1.length()==0){
       return true;
     }
     else
     {
    	return false;
     }
    }
	
	public int length(String str1)
	{
	 int i=0; 	
	 char array[] = str1.toCharArray();	
	 for(char a:array)
	 {
		 i++;
	 }
	return i;	
	}
	
	public char[] tocharArray()
	{
		
		char[] array= new char[str.length()];
		for(int i=0;i<str.length();i++) {
			array[i] = str.charAt(i);
		}
		return array;	
	}
	
	public String replace(char a,char b)
    {
        char[]array=str.toCharArray();
        int i;
        for(i=0;i<str.length();i++)
        {
        	if(array[i]==a)
        	{
        		array[i]=b;
        	}
        }
        String str1=new String(array);
		return str1;
    }
	
	public boolean equals( String str1)
	{  
		char array[]=str.toCharArray();
		char array1[]=str1.toCharArray();
		int k=0;
		int m,n;
		if(array.length>=array1.length)
		{
			m=array.length;
			n=array1.length;
		}
		else
		{
			m=array1.length;
		    n=array.length;
	    }
		for(int i=0;i<n;i++)
		{
			if(array[i]==array1[i])
			{
				k++;
			}
			else
			{		
				return false;
			}
		}
		if(m==k)
		{
		 return true;
		}
		else
		{
		 return false;
		}
		}
	
	public int codePointAt(int ku)
	{  
		int kk;
		char[] array= str.toCharArray();
		kk= array[ku] ;
		return kk;
	}
	
	public int codePointBefore(int ka)
	{  
		int kk;
		char[] array= str.toCharArray();
		kk=array[ka-1];
		return kk;
	}
	
    public int codePointCount(int a,int b)
   {
	   int c=b-a;
	   return c;
   }
 	
    public boolean contentEquals(String str1)
    {
    	char array[]=str.toCharArray();
		char array1[]=str1.toCharArray();
		int l=0;
		int r,s;
		if(array.length>=array1.length)
		{
			r=array.length;
			s=array1.length;
		}
		else
		{
			r=array1.length;
		    s=array.length;
	    }
		for(int v=0;v<s;v++)
		{
			if(array[v]==array1[v])
			{
				l++;
			}
			else
			{		
				return false;
			}
		}
		if(r==s)
		{
		 return true;
		}
		else
		{
		 return false;
		}
		}
    
    public String copyValueOf(String str1)	
	
    {   
        int g;
        String str2="";
   	    char array[]= str1.toCharArray( );
		for(g=0;g<str1.length();g++) {	
			str2+=array[g];
		}
    	
		return str2;
    }

    public boolean contains(String str1) {

        
    	char array[]=str.toCharArray();
		char array1[]=str1.toCharArray();
		int i,j,k=0;
		for(i=0;i<array.length;i++) 
		{
			if(array[i]==array1[0]) 
			{
			for(j=0;j<array1.length;j++){
		if(array[i]==array1[j]) {
			k++;	
		    i++;
			}
		}
		}
		}
        if(array1.length==k)
        {
		return true;
        }
        else
        {
        return false;
        }
    }
    
    public boolean endsWith(String suffix)
    {
		
		char[] array = str.toCharArray();

		char[] sch = suffix.toCharArray();
		
		int j=1;
		
		for(int i= sch.length -1; i >= 0; i--) {

			if(array[array.length-j] == sch[i]) {
				j++;
				return true;
		}
		}
		return false;
    }
    
    public boolean startsWith(String prefix)
    {
		
		char[] array = str.toCharArray();
		
		char[] sch = prefix.toCharArray();
		
		for(int i=0; i<prefix.length(); i++) {
			if(array[i] == sch[i]) {
				return true;	
		}
		}
		return false;
    }
   
    public String substring(int x,int y) 
    {	   
          StringBuilder str1= new StringBuilder();
          
          for (int i = x; i < y; i++)
          { 
        	  str1.append(str.charAt(i));
      }
          String s1=new String(str1);
		  return s1;
    
    }
    
	public String[] split(char c) 
    {
    	char[]array=str.toCharArray();
    	String ss="";
    	List<String> al=new ArrayList<String>();
    	for(int i=0;i<array.length;i++)
        {
         if(array[i]!=c)
         {
        	 ss+=array[i];
        	
         }
         else
         {
        	al.add(ss);
        	ss="";
         }
          
        }
        al.add(ss);
        int k=0;
        String[] str1=new String [al.size()];

        for(int i=0;i<al.size();i++)
        {   
        	k++;

        	str1[i]=al.get(i);
        }
        System.out.println(k);
        
		return str1;
     
    }

    
    public static void main(String[] args) {
    All me=new All("karthik"); 
    
    System.out.println("Concat="+me.concat(" zoho corporation"));
    System.out.println("charAt="+me.CharAt(3));
    System.out.println("toupper="+me.toUpperCase());
	System.out.println("tolower="+me.toLowerCase());
	System.out.println("isempty="+me.isEmpty(""));
	System.out.println("Length="+me.length("zoho"));
	System.out.println(me.tocharArray());
    System.out.println("replace="+me.replace('k', 'o'));
	System.out.println("euqals="+me.equals("karthik"));
	System.out.println("codepoint="+me.codePointAt(2));
	System.out.println("codePointBefore="+me.codePointBefore(3));
	System.out.println("codePointCount="+me.codePointCount(0,3));
	System.out.println("contenteuqals="+me.contentEquals("karthik"));
	System.out.println("copyvalueof="+me.copyValueOf("zoho"));
	System.out.println("contains="+me.contains("thik"));
    System.out.println("endWith="+me.endsWith("ii"));
    System.out.println("startsWith="+me.startsWith("kar"));
    System.out.println("substring="+me.substring(0,7));
    String[]so=me.split('k');
    for(String s:so)
    System.out.print(s+" ");
    
    }
	}
