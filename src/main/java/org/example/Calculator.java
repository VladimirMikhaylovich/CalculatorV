package org.example;

public class Calculator {

    public void makeCalculation(int a, int b, String symbol){
      //  System.out.println("Готово: "+a+" "+symbol+" "+b);
      if(a<=10 && a>=0 && b<=10 && a>=0){
          switch (symbol){
              case "+":
                  System.out.println(a+b);
                  break;
              case "-":
                  System.out.println(a-b);
                  break;
              case "*":
                  System.out.println(a*b);
                  break;
              case "/":
                  System.out.println(a/b);
                  break;
          }
      }else {
          throw new IllegalArgumentException("Вводимые значения должны бать от 0 до 10");
      }
    }

    public void makeCalculation(RomanNumber a, RomanNumber b, String symbol){
       // System.out.println("Готово: "+a.name()+" "+symbol+" "+b.name());
        if(a.getValue()<=10 && a.getValue()>=0 && b.getValue()<=10 && a.getValue()>=0){
            switch (symbol){
                case "+":
                   int result1 = a.getValue()+b.getValue();

                   System.out.println(getRomanNumberByValue(result1));
                    break;
                case "-":
                    int result2 = a.getValue()-b.getValue();
                    if(result2<0)
                        throw new IllegalArgumentException();
                    System.out.println(getRomanNumberByValue(result2));
                    break;
                case "*":
                    int result3 = a.getValue()*b.getValue();
                    System.out.println(getRomanNumberByValue(result3));
                    break;
                case "/":
                    int result4 = a.getValue()/b.getValue();
                    System.out.println(getRomanNumberByValue(result4));
                    break;
            }
        }else {
            throw new IllegalArgumentException("Вводимые значения должны бать от 0 до 10");
        }
    }

    private String getRomanNumberByValue(int value){

        for(RomanNumber number : RomanNumber.values())
        if(number.getValue() == value)
            return number.name();
        return null;
    }

}
