import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String numberChar) {
        Set<Integer> primes = new HashSet<>();
		List<Integer> numbers = numberChar.chars()
				.map(c -> c - '0')
				.boxed()
				.collect(Collectors.toList());
		getPrimes(0, numbers, primes);
		return primes.size();
    }
    
    private void getPrimes(int acc, List<Integer> numbers, Set<Integer> primes){
		
		if(isPrime(acc)) primes.add(acc);
		
		for(int i = 0; i < numbers.size(); i++) {
			int nextAcc = acc * 10 + numbers.get(i);
			List<Integer> nextNumbers = new ArrayList<>(numbers);
			nextNumbers.remove(i);
			getPrimes(nextAcc, nextNumbers, primes);
		}
		
	}
	
	private boolean isPrime(int n) {
		if(n <= 1) return false;
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}