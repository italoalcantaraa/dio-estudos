package repetição;

public class ForAndArrays {
    public static void main(String[] args) {
        int[] array = new int[3]; // Array de tamanho 3
        int[] array1 = new int[]{}; // Array sem tamanho declarado inicialmente 
        int[] array2 = {1,2,3,4,5,6}; // Array com valores já atribuídos

        //Percorrendo o array para verificar os valores
        for(int i = 0; i < array2.length; i ++){
            System.out.println("Valor do array do índice " + i + ": " + array2[i]);
        }

        //Atribuir valores a um array de acordo com seu determinado índice
        for(int i = 0; i < array.length; i ++){
            array[i] = i; 
        }

        //foreach
        for(int i : array2){
            System.out.println("Valor: " + i);
        }
        
    }
}
