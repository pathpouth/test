/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testa;

/**
 *
 * @author yosr
 */
public class NewClass {
int a ;
int b ;
int c ;

    public NewClass() {
    }

    public NewClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "NewClass{" + "a=" + a + "b=" + b + "c=" + c + '}';
    }


}
