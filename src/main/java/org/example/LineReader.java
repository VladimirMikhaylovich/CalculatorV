package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineReader {

    private String numFirst;
    private String numSecond;
    private String mathSymbol;

    public void Reader(){
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputText = bufferedReader.readLine();
            if(inputText.length()>4 && inputText.length()<10){
                //System.out.println(inputText);
                char [] inputTextArray = inputText.toCharArray();
                MakeVariables(inputTextArray);

            }else{
                System.out.println("ввод строки не сответсвует требованиям а + в");
            }
        }catch (IOException e){
            System.out.println("Line is not read");
            e.getStackTrace();
        }
    }
    private  void MakeVariables(char[]c){
        StringBuilder numOne = new StringBuilder();
        StringBuilder symbol = new StringBuilder();
        StringBuilder numTwo = new StringBuilder();

        for(int i = 0;i<c.length;){
            if(c[i]!=' ' && symbol.isEmpty()){
                numOne.append(c[i]);
                i++;
            }else {
                if(c[i]==' '){
                    i++;
                    symbol.append(c[i]);
                    i++;
                }
                if(c[i]==' '){
                    i++;
                    numTwo.append(c[i]);
                    i++;
                }else {
                    numTwo.append(c[i]);
                    i++;
                }

            }
        }
        this.numFirst = numOne.toString();
        this.numSecond = numTwo.toString();
        this.mathSymbol = symbol.toString();

      //  System.out.println("test is done");

    }

    public String getNumFirst() {
        return numFirst;
    }

    public String getNumSecond() {
        return numSecond;
    }

    public String getMathSymbol() {
        return mathSymbol;
    }

}



