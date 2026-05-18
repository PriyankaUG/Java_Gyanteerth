
public class PrimeSeries
{
    
    public static boolean isPrime(int n){
        if(n==1 || n==2) return true;
        
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void primeSeries(int n){
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
	public static void main(String[] args) {
// 		System.out.println(isPrime(49));
        primeSeries(15);
	}
}
