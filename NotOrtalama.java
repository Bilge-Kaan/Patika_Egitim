import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Matematik sınav puanınız: ");
                double matematik = input.nextDouble();

                System.out.print("Fizik sınav puanınız: ");
                double fizik = input.nextDouble();

                System.out.print("Kimya sınav puanınız: ");
                double kimya = input.nextDouble();

                System.out.print("Türkçe sınav puanınız: ");
                double turkce = input.nextDouble();

                System.out.print("Tarih sınav puanınız: ");
                double tarih = input.nextDouble();

                System.out.print("Müzik sınav puanınız: ");
                double muzik = input.nextDouble();

                double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

                System.out.println("Not ortalamanız: " + ortalama);

                System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
            }
        }
    

