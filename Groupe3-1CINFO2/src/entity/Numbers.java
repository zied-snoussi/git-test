public class Numbers {
    int calculFactorielle (int x){
        if (x == 0) {
            return 1;
        } else {
            int res = 1;
            for (int i = 1; i <= x; i++) {
                res *= i;
            }
            return res;
        }
    }
    boolean verifierNombrePair (int n){
      return n % 2 == 0;
    }
    boolean verifierNombrePremier(){
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
    int CalculPuissance(int a,int b){
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }
}
