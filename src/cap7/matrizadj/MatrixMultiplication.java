/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7.matrizadj;

/**
 *
 * @author Valdecs
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        int m1[][] = {{1,2,3},{4,5,6}};
        int m2[][] = {{2,1,1},{1,3,1}};
        
        int sum =0;
        int r[][] = new int [2][2];
        
        for(int i=0; i<m1.length; i++){
            for (int j=0; j<m2.length; j++){
                for(int k=0; k<r.length; k++){
                    sum += m1[i][j]* m2[k][j];
                }
                r[i][j] = sum;
                sum = 0;
            }
        }
        
        for(int i[] : r){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println("");
        }
    }
}
