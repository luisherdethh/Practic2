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
        //System.out.println(Arrays.toString(Poly));
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
        if (o instanceof Polynomial) {
            Polynomial polynomial = (Polynomial) o;
            return this.toString().equals(polynomial.toString());
        }
        return false;
    }

    // Torna la representació en forma de String del polinomi. Override d'un mètode de la classe Object
    @Override
    public String toString() {
        System.out.println(Arrays.toString(Poly));

        boolean first = true;
        StringBuilder sb = new StringBuilder();

        boolean cero = true;
        //Entra en el array y empieza por el final y va bajando
        for (int j=Poly.length-1; j>= 0; j--) {
            if (Poly[j] != 0){ //pregunta si es diferente de 0
                cero = false;//Si es diferete, pues que no es cero.
                break; //si hay un numero no continua.
            }
        }
        //Si es true, nos devuelve cero.
        if (cero == true) return "0";

        //Cremos dos variables enteros coef(coheficiente) y exp(exponente)
        for (int i = Poly.length-1; i>=0 ; i--) {
            int coef = (int) Poly[i]; //el coheficiente sera entero
            int exp = (int) i; //El exponenten igual

            if (coef == 0)continue;

            //Si es menor que cero, le agregamos un " - "
            if (!first) {
                if (coef < 0) sb.append(" - ");
                else sb.append(" + ");
            } else {
                if (coef < 0) sb.append("-");
            }
//            if (coef < 0) coef *=-1;
            coef = (int) Math.abs(coef);
            first = false;
            if (coef != 1) sb.append(coef);
            if (exp != 0) sb.append("x");
            if (exp > 1) sb.append("^" + exp);
        }
        return sb.toString();
    }
}
