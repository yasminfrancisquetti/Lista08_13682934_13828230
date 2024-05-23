package ex01;

import java.math.BigInteger;

public class Fatorial {
    public static BigInteger calcularFatorial(BigInteger numero) {
        if (numero.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }

        BigInteger resultado = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(numero) <= 0; i = i.add(BigInteger.ONE)) {
            resultado = resultado.multiply(i);
        }
        return resultado;
    }
}
