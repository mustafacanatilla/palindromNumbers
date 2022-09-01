public class palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            /*System.out.println("==========");
            System.out.println("Sayi => " + temp);*/

            lastNumber = temp % 10;
            //System.out.println("Son Basamak => " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("Yeni Sayı => " + reverseNumber);

            temp /= 10;
            //System.out.println("Yeni Değer => " + temp);
        }
        if (number == reverseNumber) {

            System.out.println("Girilen Sayı Palindrom => " + reverseNumber);
            return true;

        } else {
            System.out.println("Girilen Sayı Palindrom Değil => " + reverseNumber);
            return false;

        }
    }

    public static void main(String[] args) {
        isPalindrom(101);
    }
}
