import java.util.Arrays;

public class Polynomial {

    private float[] Poly = {0};

    // Constructor per defecte. Genera un polinomi zero
    public Polynomial() {

    }

    // Constructor a partir dels coeficients del polinomi en forma d'array
    public Polynomial(float[] cfs) {
        Poly = new float[cfs.length];
        for (int i = cfs.length-1, j = 0; i >= 0; i--, j++){
            Poly[i] = cfs[j];
        }

        //this.Poly = prueba;
        System.out.println(Arrays.toString(Poly));
    }

    // Constructor a partir d'un string
    public Polynomial(String s) {
    }

    // Suma el polinomi amb un altre. No modifica el polinomi actual (this). Genera un de nou
    public Polynomial add(Polynomial p) {
        return null;
    }

    // Multiplica el polinomi amb un altre. No modifica el polinomi actual (this). Genera un de nou
    public Polynomial mult(Polynomial p2) {
        return null;
    }

    // Divideix el polinomi amb un altre. No modifica el polinomi actual (this). Genera un de nou
    // Torna el quocient i també el residu (ambdós polinomis)
    public Polynomial[] div(Polynomial p2) {
       return null;
    }

    // Troba les arrels del polinomi, ordenades de menor a major
    public float[] roots() {
        return null;
    }

    // Torna "true" si els polinomis són iguals. Això és un override d'un mètode de la classe Object
    @Override
    public boolean equals(Object o) {
        return false;
    }

    // Torna la representació en forma de String del polinomi. Override d'un mètode de la classe Object
    @Override
    public String toString() {
        System.out.println(Arrays.toString(Poly));

        //Cremos dos variables enteros coef(coheficiente) y exp(exponente)
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (int i = Poly.length-1; i>=0 ; i--) {
            int coef = (int) Poly[i]; //el coheficiente sera entero
            int exp = (int) i; //El exponenten igual

            //Si es menor que cero, le agregamos un " - "
            if (!first) {
                if (coef < 0) sb.append(" - ");
                else sb.append(" + ");
            }
            first = false;
            if (coef != 1) sb.append(coef);
            if (exp != 0) sb.append("x");
            if (exp > 1) sb.append("^" + exp);
            boolean cero = true;
            for (int j=Poly.length-1; j>= 0; j--) {
                if (Poly[j] != 0){
                    cero = false;
                }
            }
            if (cero == true) return "0";

//              if(Poly[i] == 0){
//                  continue;
//              }
//              if((i == this.Poly.length-1) && (Poly[i]) < 0){
//                  sb.append("-");
//              }
        }
        return sb.toString();
    }
}
