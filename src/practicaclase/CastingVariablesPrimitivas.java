package practicaclase;

/*
-	Declara e inicializa una variable de tipo int y luego declara una variable de tipo double e inicialízala con el valor de la variable int anteriormente creada.
-	Declara e inicializa una variable de tipo double y luego declara una variable de tipo int e inicialízala con el valor de la variable double anteriormente creada.
-	Declara e inicializa una variable de tipo double y luego declara una variable de tipo float e inicialízala con el valor de la variable double anteriormente creada.

 */

public class CastingVariablesPrimitivas {
    public static void main(String[] args) {
        //casting implícito
        int a = 12;
        double b = a;

        // casting explícito
        double c = 5.4;
        int d = (int) c;

        // casting explícito
        double e = 6.7;
        float f = (float) e;
    }
}
