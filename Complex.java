import java.util.Scanner;

public class Complex {
    int real;
    int imaginary;

    
    public Complex(int real_get, int imag_get) {
        this.real = real_get;
        this.imaginary = imag_get;
    }

    
    public static Complex sum(Complex c1, Complex c2) {
        Complex temp = new Complex(0, 0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the real part of the first complex number:");
        int real1 = sc.nextInt();
        System.out.println("Enter the imaginary part of the first complex number:");
        int img1 = sc.nextInt();

        System.out.println("Enter the real part of the second complex number:");
        int real2 = sc.nextInt();
        System.out.println("Enter the imaginary part of the second complex number:");
        int img2 = sc.nextInt();

        Complex first = new Complex(real1, img1);
        Complex second = new Complex(real2, img2);

     
        Complex temp = sum(first, second);

        
        System.out.println("Sum is: " + temp.real + "+" + temp.imaginary + "i");

        sc.close(); 
    }
}

