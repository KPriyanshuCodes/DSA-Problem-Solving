public class CheckArmstrong {
        public boolean Armstrong(int x) {
            int original=x;
            int num=0;
            int digits = String.valueOf(x).length();
            while(x>0){
                int lnum=x%10;
                num += (int)Math.pow(lnum,digits);
                x=x/10;
            }
            return num==original;
    }

    static void main(String[] args) {
        CheckArmstrong obj = new CheckArmstrong();
        System.out.println(obj.Armstrong(1634));

    }
}
