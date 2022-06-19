public class Pallindrom
{
    void palindrome(int n) {
        int r, sum = 0, temp;

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("pallindrom");
        else
            System.out.println("not pallindrom");
    }

    public static void main(String[] args) {
        Pallindrom pallindrom=new Pallindrom();
        pallindrom.palindrome(121);

    }
}
