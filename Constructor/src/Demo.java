class God{  
God(){System.out.println("All Mighty");}  
}  
class Lord extends God{  
Lord(){  
super();  
System.out.println("Creator of World");  
}  
}  
class Demo{  
public static void main(String args[]){  
Lord mighty=new Lord();  
}}  

