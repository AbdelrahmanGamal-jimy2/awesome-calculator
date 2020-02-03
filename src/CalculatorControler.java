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
    
    double  addition(double  firstNum, double  secoundNum)
    {
        
        return firstNum + secoundNum;
    }
    double  subtraction(double firstNum, double secoundNum)
    {
        
        return firstNum - secoundNum;
    }
    double multiplication(double firstNum, double secoundNum)
    {
        
        return firstNum * secoundNum;
    }
    double division(double numerator , double denominator)
    {
        return numerator / denominator;
    }
    double Power(double number, double toThePower)
    {
       if (toThePower == 1)
       {
           return number;
       }
       return number * Power( number,  toThePower-1);
    }
    double tan(double number)
    {
       return Math.tan(Math.toRadians(number));
    }
    double Factorial(double number)
    {
        if (number == 1)
        {
            return 1.0;
        }
        return number * Factorial(number - 1);
    }
    
    
    
    
    
}
