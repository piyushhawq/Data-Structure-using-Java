public class ComplexNumbers {
	// Complete this class
    private int real;
    private int imaginary;
    
    
    public ComplexNumbers(int real, int imaginary){
        this.real = real;
        // if(imaginary == 0){
        //     return real;
        // }
        this.imaginary = imaginary;
    }
    
    public int getReal(){
        return real;
    }
    
    public int getImaginary(){
        return imaginary;
    }
    
    public void setReal(int real){
        this.real = real;
    }
    
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }
    
    public void plus(ComplexNumbers c2){
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    
    public static ComplexNumbers plus(ComplexNumbers c1, ComplexNumbers c2){
    	int real = c1.real + c2.real;
    	int imaginary = c1.imaginary + c2.imaginary;
        
        return new ComplexNumbers(real, imaginary);
    }
    
    
    public void multiply(ComplexNumbers c2){
        int real= this.real * c2.real - this.imaginary * c2.imaginary;
		int imaginary= this.real * c2.imaginary + c2.real * this.imaginary;
		this.real=real;
		this.imaginary=imaginary;
    }
    
    public static ComplexNumbers multiply(ComplexNumbers c1, ComplexNumbers c2){
        int real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        int imaginary = c1.real * c2.imaginary + c2.real + c1.imaginary;
      
        return new ComplexNumbers(real, imaginary);
    }
    
    public ComplexNumbers conjugate(){
        int imaginary = -this.imaginary;
        int real = this.real;
        
        return new ComplexNumbers(real, imaginary);
    }
    
    public void print(){
        System.out.println(this.real + " + i" + this.imaginary);
    }
	
}
