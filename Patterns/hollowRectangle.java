public class hollowRectangle {
    public static void main(String[] args) {
        int n=4;
        int m =6;
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=m;col++) {
                if(row==1 || row==n) {
                    System.out.print("* ");
                } else {
                    if(col==1 || col==m) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");

                    }
                }


            }
            System.out.println();
        }
    }
}