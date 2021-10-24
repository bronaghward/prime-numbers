/* 
This class is all about prime numbers  
(1) Method to determine if a number is a prime 
(2) Method to convert a list of numbers into a list containing only the prime numbers
*/ 

import java.util.ArrayList; 

public class Prime {

// Method to determine if a number is a prime number:
public boolean isPrime(int number){ 

if(number <=1){
return false; 
}  

  else if(number >1) {
    for(int i = (number - 1); i> 1; i--){

        if(number % i == 0 ){
        return false;
        }
  }

}  
return true; 
}

/* 
Method to convert an array list of numbers
to an array list of only prime numbers 
*/ 

public ArrayList<Integer> onlyPrimes(int[] numbers){
ArrayList<Integer> primes = new ArrayList<Integer>(); 

for(int number : numbers){
if(isPrime(number) == true){
primes.add(number); 
}

}   
return primes; 
}

/* 
Method to count every number before the specified number
and add only the prime numbers in a list
*/ 

public ArrayList<Integer> primeCounter(int value){

ArrayList<Integer> everyNumberBeforeValue = new ArrayList<>(); 
for(int i = 0; i<value; i++){

if (isPrime(i) == true) {  
everyNumberBeforeValue.add(i); 
}

}
return everyNumberBeforeValue; 

}

// MAIN METHOD
public static void main(String[] args) {

// Use isPrime method
System.out.println("Let's check if numbers are prime numbers!");
Prime pd = new Prime();
int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
System.out.println(pd.isPrime(7));
System.out.println(pd.isPrime(28));
  
// Use onlyPrimes method  
System.out.println(pd.onlyPrimes(numbers)); 
   
// Use the primeCounter method
System.out.println(pd.primeCounter(10)); 
ArrayList<Integer> primesBefore1000 = new ArrayList<Integer>(); 
primesBefore1000 = pd.primeCounter(1000-1); 
System.out.println("Here are the prime numbers below 1000: \n " + primesBefore1000);    
}  

}
