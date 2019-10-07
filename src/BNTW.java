/**
 * @(#)BNTW.java
 *
 * BNTW application
 *
 * @author 
 * @version 1.00 2019/10/7
 */
 
import java.util.Scanner; //for user input

public class BNTW { // class name



        public static void main(String[] args) { //the main method
            int x = 0;//declaration for int
            Scanner sc = new Scanner(System.in); // the scanner named
            System.out.println("Please type a number between 0 and 999 OR type -1 to exit:  ");// instruction to the user
            x = sc.nextInt(); // so they can input a number and the value 
            while(x!=-1){ // to start a loop and set the boudary
                if(x>=0 && x<=1000){ // to make a sort of range
                    if(x==0){ // this is a special case for zero
                        System.out.println("Zero");// to print out zero
                    } if(x==1000){ // special case for 1000
                        	System.out.println("One Thousand"); // prints out 1000 in words
                        } else {//for other numbers
                        System.out.println("\t");// new tab? created to print the hundreds
                        numberToWord(((x / 100) % 10), " Hundred"); // for hundreds
                        numberToWord((x % 100), " ");// tens and ones
                    }

                } else{ // for other numbers
                    System.out.println("Number out of Range");// to let the user know that the number they had input is not encoded
                }
                System.out.println(""); // I just put it there so the answer isn't so attached to the next instruction
                System.out.println("\nPlease type a number between 0 and 999 OR type -1 to exit:  ");// start of another loop
                x = sc.nextInt();//scanner 
            }
        }

        public static void numberToWord(int y, String v) { // a sub method to organize created so the code isn't to messy and you can see what it is about
            String ones[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"}; // array of ones and the special teens
            String tens[] = {" ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"}; // the array of tens
            if (y > 19) { // condition if the number is below 19
                System.out.print(tens[y / 10] + " " + ones[y % 10]); // to print out the ten to nineteen
            } else {// if not fitting in the condition
                System.out.print(ones[y]);// they print out the ones
            }
            if (y > 0) {//if the number is above zero
                System.out.print(v); // it prints the value
            }
        }
    }

