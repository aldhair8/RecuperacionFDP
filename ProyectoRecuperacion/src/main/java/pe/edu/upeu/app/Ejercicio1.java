package pe.edu.upeu.app;
public class Ejercicio1 {
    public static int[][] matriz;

    public static  void imprimirMatriz(int[][] matriz){
            Ejercicio1.matriz = matriz;
            for (int[] element : Ejercicio1.matriz) {
            for (int columSubInd = 0; columSubInd < matriz[0].length; columSubInd++) {
                System.out.print(element[columSubInd] + "\t");
            }
            System.out.println();
        }
            }   
        public static void main(String[] args) {
            int[][] matrizX =new int[][]{
                {6,12,24},
                {36,48,60},
                {12,30,18},  
        };
        int[][] matrizR =new int[][]{
            {matrizX[0][0]*3,matrizX[0][1]*3,matrizX[0][2]*3},
            {matrizX[1][0]*3,matrizX[1][1]*3,matrizX[1][2]*3},
            {matrizX[2][0]*3,matrizX[2][1]*3,matrizX[2][2]*3},
        };
    System.out.println("Matrices Filas:="+ matrizX.length+"  Matrices Columnas:="+matrizX[0].length)
    ; imprimirMatriz(matrizR);
        }}
    

 


