package model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimitiveRootCalculator {

	private static final BigInteger ONE = BigInteger.ONE;
	private static final BigInteger ZERO = BigInteger.ONE;

	public static List<BigInteger> calculate(BigInteger value) throws NotPrimeException {
		if (!isPrime(value)) {
			throw new NotPrimeException();
		}
		List<BigInteger> coprimes = coprimesOf(value);
		List<BigInteger> primitiveRoots = new ArrayList<BigInteger>();
		BigInteger aux = null;
		List<BigInteger> residues = new ArrayList<BigInteger>();
		for (BigInteger coprime : coprimes) {
			residues.clear();
			congruenceVerify: for (int k = 1; k < value.intValue(); k++) {
				aux = (coprime.pow(k)).mod(value);
				if (aux == ZERO || residues.contains(aux)) {
					break congruenceVerify;
				}
				residues.add(aux);
			}
			if (residues.size() == value.intValue() - 1) {
				primitiveRoots.add(coprime);
			}
		}
		return primitiveRoots;
	}

	private static List<BigInteger> coprimesOf(BigInteger value) {
		List<BigInteger> coprimes = new ArrayList<BigInteger>();
		BigInteger countdown = value.subtract(ONE);
		while (countdown.compareTo(ZERO) != 0) {
			if (countdown.gcd(value).compareTo(ONE) == 0) {
				coprimes.add(countdown);
			}
			countdown = countdown.subtract(ONE);
		}
		return coprimes;
	}

	private static boolean isPrime(BigInteger value) {
		return value.isProbablePrime(1);
	}

}
