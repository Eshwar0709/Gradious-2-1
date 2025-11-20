//*
//**
//***
//**
//*
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                result+="*";
            }
            result+="\n";
        }
        for(int i=3-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                result+="*";
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
