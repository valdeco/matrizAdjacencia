package matrizadjacencia;

public class MultiplicarMatrizes {
    

    int[][] a;
    int[][] at;
    int[][] res;
    
    

    public void criarTransposta(int[][] a, int[][] at) {
        for (int linha = 0; linha < a.length; linha++) {
            for (int coluna = 0; coluna < a.length; coluna++) {
                at[coluna][linha] = a[linha][coluna];
            }
        }
    }

    public int calcularProdutoEscalar(int[] a, int[] b) {
        int soma = 0;
        for (int i = 0; i < a.length; i++) {
            soma += a[i] * b[i];
        }
        return soma;
    }

    public void calcularProdutoMatrizes(int[][] a, int[][] at, int[][] res) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                res[i][j] = calcularProdutoEscalar(a[i], at[j]);
            }
        }
    }
    
}

