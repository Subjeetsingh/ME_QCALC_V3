package com.crio.qcalc;


public class StandardCalculator
{
   public static void getVersion(){
       System.out.println("Standard Calculator 1.0");
   }


   private int result;


   public int getResult() {
       return result;
   }
      
   public void clearResult() {
       result = 0;
   }
  
//    public void printResult(int result){
//       // int res = getResult(result);
//        System.out.println("Standard Calculator Result:"+ res);
//    }




   private void setResult(int value) {
      this.result = value;
   }


   public void add(int num1, int num2){
       result =(num1+num2);
   }




   public void subtract(int num1, int num2){
       setResult(num1-num2);
   }
  
  
   public void multiply(int num1, int num2){
       setResult(num1*num2);
   }
  
  
   public void divide(int num1, int num2){
       if(num2!=0){
           setResult(num1/num2);
       }
       else{
           setResult(0);
       }
   }
}

