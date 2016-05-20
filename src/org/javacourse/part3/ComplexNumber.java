package org.javacourse.part3;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(2*Double.valueOf(re).hashCode()+3*Double.valueOf(im).hashCode()).hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof ComplexNumber) {
            ComplexNumber complexNumber = (ComplexNumber) obj;
            return ((this.re == complexNumber.getRe()) && (this.im == complexNumber.getIm()));
        }
        return false;
    }
}
