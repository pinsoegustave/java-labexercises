public class Prime {
  public static boolean isPrime(int num) {
    
    if (num <= 1) return false;
    
    if (num == 2) return true;
    
    if (num % 2 == 0)  {
      return false;
    }
    
    for (int x = 3; x * x <= num; x+=2 ) {
      if (num % x == 0) {
                return false;
            }
    }
    
    return true; //TODO
  }
}