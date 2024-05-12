

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();//Yığında girdi metinindeki karakterleri saklamak için.
        int length = input.length();//girdinin uzunluğunu hesaplıyoruz.
        int mid = length / 2;//Kullanıcıdan veri almak için gerekli sınıf tanımlamalarını yapıyoruz.

        for (int x = 0; x < length; x++) {
            if (x < mid) {//Eğer  indis x küçük mid yığına ekler  
                stack.push(input.charAt(x));//Değeri tutuyoruz
            } else if (length % 2 == 0 && x >= mid) {//Eğer metinin uzunluğu çift ise x büyük veya eşit ise 
            	// Yığından bir karakter çıkartılır Girdi ile karşılaştırılır 
                if (input.charAt(x) != stack.pop()) {
                    return false;//Eğer eşleşmezse palindrome değildir 
                }
            } else if (length % 2 != 0 && x > mid) {//Eğer metin uzunluğu tekse ve indis x büyük mid ise kontrol edilir
                if (input.charAt(x) != stack.pop()) {//Eğer eşleşmezse ,metin bir palindrome değildir 
                    return false;
                }
            }
        }

        return true;//Eğer eşit ise true döndürür 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Kullanıcıdan girdi almak için gerekli sınıf tanımlamaları yapıyoruz.

        System.out.print("Metini giriniz: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " Bir palindromedur.");
        } else {
            System.out.println(input + " Bir palindrome değildir.");
        }
    }
}


