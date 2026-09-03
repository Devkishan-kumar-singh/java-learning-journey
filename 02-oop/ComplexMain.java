//Addition of complex number.
class Complex {
    private double real;
    private double img;
    Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }
     public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

   
    public static Complex addComplex(Complex c1, Complex c2) {
       
        double totalReal = c1.getReal() + c2.getReal();
        double totalImg = c1.getImg() + c2.getImg();
        return new Complex(totalReal, totalImg);
    }

    
    public void display() {
        if (this.img >= 0) {
            System.out.println((int)this.real + "+" + (int)this.img + "i");
        } else {
           
            System.out.println((int)this.real + "" + (int)this.img + "i");
        }
    }
}


public class ComplexMain {
    public static void main(String args[]) {
        
        Complex num1 = new Complex(4, 5);
        Complex num2 = new Complex(1, -2);

        System.out.print("First Number: ");
        num1.display();

        System.out.print("Second Number: ");
        num2.display();

        
        Complex result = Complex.addComplex(num1, num2);

        System.out.print("Resulting Sum: ");
        result.display();
    }
}
