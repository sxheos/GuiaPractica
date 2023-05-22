/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "ConversionSW")
public class ConversionSW {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroAdolar")
    public Double euroAdolar(@WebParam(name = "euros") double euros) {
        //TODO write your implementation code here:
        return euros*0.15;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
   
      public int suma(int num1, int num2) {
        return num1 + num2;
    }  //TODO write your implementation code here:

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
     public int resta(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicacion")
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "division")
     public double division(int num1, int num2) {
        return (double) num1 / num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(String username, String password) {
        
        if (username.equals("sandra") && password.equals("1234")) {
            return true; // Inicio de sesión válido
        }
        
        return false; // Inicio de sesión inválido
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcularAreaCirculo")
    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "convertirCelsiusAFahrenheit")
    public double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
   

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcularFuerza")
     public double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }
}
