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
        return Math.round((firstNum +secondNum) * 100.0) / 100.0;
    }
    double  subtraction(double firstNum, double secondNum)
    {  
        return Math.round((firstNum - secondNum) * 100.0) / 100.0;
    }
    double multiplication(double firstNum, double secondNum)
    {
        return Math.round((firstNum * secondNum) * 100.0) / 100.0;
    }
    double division(double numerator , double denominator)
    {
        return Math.round((numerator / denominator) * 100.0) / 100.0;
        
    }
    double power(double number, double toThePower)
    {
       if (toThePower == 0)
       {
           return 1;
       }
       return Math.round((number * power( number,  toThePower-1) * 100.0) / 100.0);
    }
    double tan(double number)
    {
       return Math.round((Math.tan(Math.toRadians(number))) * 100.0) / 100.0;
    }
    double factorial(double number)
    {
        if (number == 1)
        {
            return 1;
        }
        return Math.round((number * factorial(number - 1)) * 100.0) / 100.0;
    }
    
}

