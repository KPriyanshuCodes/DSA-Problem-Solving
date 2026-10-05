class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int prime[]=new int[n];
        for(int i=3;i<n;i+=2){
            prime[i]=1;
        }
            for(int i=3;i*i<n;i+=2){
                if(prime[i]==1){
                    for(int j=i*i;j<n;j+=2*i){
                        prime[j]=0;
                    }
                }
            }
            int count=1;
            for(int i=3;i<n;i+=2){
                if(prime[i]==1)
                count++;
            }
            return count;
        }
}
