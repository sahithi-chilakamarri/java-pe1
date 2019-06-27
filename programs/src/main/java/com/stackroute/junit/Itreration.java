package com.stackroute.junit;

public class Itreration {
public static String loop(int number){
    String string="";
    for(int i=1;i<=number;i++)
    {
        for(int j=1;j<=i;j++){
            string=string+i;
        }
    }
if(number<0) {
    string = "Error";
    return string;
}
return string;


}

}

