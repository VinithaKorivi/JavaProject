package PracticePrograms;

strictfp class MathEngine {
 double compute(double a, double b) {
     double result = (a * b) / 3.141592653589793;
     result += Math.pow(a, 3) - Math.sqrt(b);
     return result;
 }
}

class FastEngine {
 double compute(double a, double b) {
     double result = (a * b) / Math.PI;
     result += Math.pow(a, 3) - Math.sqrt(b);
     return result;
 }
}

abstract class FPProcessor {
 abstract double process(double x, double y);
}

class PreciseProcessor extends FPProcessor {
 strictfp double process(double x, double y) {
     return new MathEngine().compute(x, y);
 }
}

class FastProcessor extends FPProcessor {
 double process(double x, double y) {
     return new FastEngine().compute(x, y);
 }
}

public class StrictFPMod {
 public static void main(String[] args) {
     FPProcessor p1 = new PreciseProcessor(); // strictfp
     FPProcessor p2 = new FastProcessor();    // non-strictfp

     double a = 1234567.8912345;
     double b = 98765.56789;

     System.out.println("StrictFP Result   = " + p1.process(a, b));
     System.out.println("Non-Strict Result = " + p2.process(a, b));
 }
}
