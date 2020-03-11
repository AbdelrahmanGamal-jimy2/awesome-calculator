/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mano
 */

public class CalculatorControler {
    
    private static CalculatorControler single_instance = null;
    private CalculatorControler()
    {
        
    }
    public static CalculatorControler getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new CalculatorControler(); 
  
        return single_instance; 
    } 
    
    public double  addition(double  firstNum, double  secondNum)
    {       
        return Math.round(firstNum + secondNum);
    }
    double  subtraction(double firstNum, double secondNum)
    {  
        return Math.round(firstNum - secondNum);
    }
    double multiplication(double firstNum, double secondNum)
    {
        return Math.round(firstNum * secondNum);
    }
    double division(double numerator , double denominator)
    {
        return Math.round(numerator / denominator);
        
    }
    double power(double number, double toThePower)
    {
       if (toThePower == 1)
       {
           return number;
       }
       return Math.round(number * power( number,  toThePower-1));
    }
    double tan(double number)
    {
       return Math.round(Math.tan(Math.toRadians(number)));
    }
    int factorial(int number)
    {
        if (number == 1)
        {
            return 1;
        }
        return Math.round(number * factorial(number - 1));
    }
    
}

