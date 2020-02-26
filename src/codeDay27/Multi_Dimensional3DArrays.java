package codeDay27;
import java.util.*;
public class Multi_Dimensional3DArrays {
    public static void main(String[] args) {

        int [][][] ard3D = {{{10,11,123,19}, {13,144,16,}},{{10,12,13},{1,2,3}}};
        for (int i = 0; i < ard3D.length; i++) {
            for (int j = 0; j < ard3D[i].length; j++) {
                for (int k = 0; k < ard3D[i][j].length; k++) {
                    System.out.print(ard3D[i][j][k]+ " ");
                }
            }
        }


    }
}
