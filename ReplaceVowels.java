import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
          String str=s.nextLine();
          String str2=" ";
          for(char ch:str.toCharArray()){
              if(ch=='o'){
                   str2+='*';
              }
              else{
                str2+=ch;
              }
          }
          System.out.println(str2);
        }
    }
