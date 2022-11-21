package org.example;

public class Main {
    public static void main(String[] args) {

        LineReader value = new LineReader();
        value.Reader();
        Validator validator = new Validator();
        Calculator calculator = new Calculator();
        if(validator.validateInputNumber(value.getNumFirst()).equals("ARABIC") && validator.validateInputNumber(value.getNumSecond()).equals("ARABIC")){

            if(validator.validateSymbol(value.getMathSymbol())){
            int numOne = Integer.parseInt(value.getNumFirst());
            int numTwo= Integer.parseInt(value.getNumSecond());
            calculator.makeCalculation(numOne, numTwo, value.getMathSymbol());}}
            else{

        if(validator.validateInputNumber(value.getNumFirst()).equals("ROMAN") && validator.validateInputNumber(value.getNumSecond()).equals("ROMAN")){

            if(validator.validateSymbol(value.getMathSymbol())){
            RomanNumber numOne = RomanNumber.valueOf(value.getNumFirst());
            RomanNumber numTwo = RomanNumber.valueOf(value.getNumSecond());
            calculator.makeCalculation(numOne, numTwo, value.getMathSymbol());
            }}
            else{
                throw new IllegalArgumentException("Вычисление может быть выполенено только между однотипными переменными. Введите римские или арабские цифры");
            }}


    }
}