class pattern1{
    pattern1(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pattern2{
    pattern2(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pattern3{
    pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

class pattern4{
    pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

class pattern5{
    pattern5(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pattern6{
    pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern7{
    pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Patterns {
    static void main(String[] args) {
//        pattern1 obj1 = new pattern1(5);
//        pattern2 obj2 = new pattern2(5);
//        pattern3 obj3 = new pattern3(5);
//        pattern4 obj4 = new pattern4(5);
//        pattern5 obj5 = new pattern5(5);
//        pattern6 obj6 = new pattern6(5);
        pattern7 obj7 = new pattern7(5);
    }
}
