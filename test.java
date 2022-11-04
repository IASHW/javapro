import java.util.*;
public class test{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  int sayi, s = 0, i = 0, basamak; // Değişkenlerin tanımlanması
  sayi = input.nextInt(); // Sayının girilmesi 
  while (sayi > 0){
   // Çevirme işleminin yapılması   
   basamak = (int)((sayi % 2) * Math.pow(10, i));
   i++;
   sayi = sayi / 2;
   s = s + basamak;
  }
  // Çevrilen sayının ekrana yazdırılması
  System.out.println(s); 
  input.close();
    }
    
}