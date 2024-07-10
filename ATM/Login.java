package N3;

import java.util.Scanner;

public class Login {
    public boolean login (Hesap hesap){
        
        Scanner s = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.println("Kullanıcı adı: ");
        kullanici_adi = s.nextLine();
        System.out.println("Parola: ");
        parola = s.nextLine();
        
        if (hesap.getKullanici_adi().equals(kullanici_adi) && (hesap.getParola().equals(parola))){
            
            return true;
        }
        else{
            return false;
        }
    }
}
