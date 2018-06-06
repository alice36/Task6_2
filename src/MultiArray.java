import java.util.Arrays;
import java.util.Random;

public class MultiArray{
    int[][] tab;

    MultiArray(int n, int m){
        this.tab = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            for (int j = 0; j <m; j++){
                tab[i][j] = rand.nextInt(100);
            }
        }
    }

    int[][] randomize(){
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j <tab[1].length; j++){
                tab[i][j] = rand.nextInt(100);
            }
        }
        return tab;
    }

    int findMin(){
        int foundMin = tab[0][0];
        for (int i = 0; i <tab.length; i++){
            for (int j = 0; j <tab[1].length; j++){
                if (tab[i][j]<foundMin) foundMin=tab[i][j];
            }
        }
        return foundMin;
    }

    int findMax(){
        int foundMax = 0;
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j <tab[1].length; j++){
                if (tab[i][j]>foundMax) foundMax=tab[i][j];
            }
        }
        return foundMax;
    }

    void print(){
        for (int i = 0; i < tab.length; i++) {
            String toArray = Arrays.toString(tab[i]);
            System.out.println(toArray);
        }
    }
}