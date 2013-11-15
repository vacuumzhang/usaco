import java.util.*;
import java.io.*;

public class gift1{
    public static void main(String [] args) throws Exception{
        File theFile = new File("gift1.in");
        Scanner x = new Scanner(theFile);
        PrintWriter pw = new PrintWriter("gift1.out");
        int np = x.nextInt();
        String name[] = new String[np];

        for(int i = 0; i < np; i++){
            name[i] = x.next();
            }
                int[] account = new int[np];

                while(x.hasNext()){

                String giver = x.next();

                for(int k=0; k<np; k++){
                    if(giver.equals(name[k])){

                    int n;
                    n = x.nextInt();
                    int m;
                    m = x.nextInt();

                    if(m != 0){
                        account[k] =account[k]-n/m*m;
                    }else{
                        account[k] += 0;
                    }
                    for(int j=0; j<m; j++){

                    String receive = x.next();
                        for(int l=0; l<np; l++){
                            if(receive.equals(name[l])){
                                account[l] = account[l]+(n/m);
                                }
                            }
                        }
                    }
                }
            }

                for(int u=0; u<np; u++) {
                    pw.println(name[u]+" "+account[u]);
                }
                pw.close();

    }
}
