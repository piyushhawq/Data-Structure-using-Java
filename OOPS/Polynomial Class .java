public class Polynomial {

    int[] coeffArr;

    public Polynomial() {
        coeffArr = new int[5];
    }

    public void setCoefficient(int degree, int coeff) {
        if (degree >= coeffArr.length - 1) {
            int temp[] = new int[coeffArr.length];
            temp = coeffArr;
            coeffArr = new int[degree + 1];

            for (int i = 0; i < temp.length; i++)
                coeffArr[i] = temp[i];
        }
        coeffArr[degree] = coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed)
    // in increasing order of degree.
    public void print() {
        for (int i = 0; i < coeffArr.length; i++) {
            if (coeffArr[i] != 0)
                System.out.print(coeffArr[i] + "x" + i + " ");
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        Polynomial a = this;
        Polynomial poly = new Polynomial();
        poly.coeffArr = new int[Math.max(a.coeffArr.length, p.coeffArr.length)];
        for (int i = 0; i < a.coeffArr.length; i++) {
            poly.coeffArr[i] += a.coeffArr[i];
        }
        for (int i = 0; i < p.coeffArr.length; i++) {
            poly.coeffArr[i] += p.coeffArr[i];
        }
        return poly;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        Polynomial a = this;
        Polynomial poly = new Polynomial();
        poly.coeffArr = new int[Math.max(a.coeffArr.length, p.coeffArr.length)];
        for (int i = 0; i < a.coeffArr.length; i++) {
            poly.coeffArr[i] += a.coeffArr[i];
        }
        for (int i = 0; i < p.coeffArr.length; i++) {
            poly.coeffArr[i] -= p.coeffArr[i];
        }

        return poly;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial a = this;
        Polynomial poly = new Polynomial();
        poly.coeffArr = new int[a.coeffArr.length + p.coeffArr.length - 1];

        for (int i = 0; i < a.coeffArr.length; i++) {
            for (int j = 0; j < p.coeffArr.length; j++) {
                poly.coeffArr[i + j] += a.coeffArr[i] * p.coeffArr[j];
            }
        }
        return poly;
    }

}
