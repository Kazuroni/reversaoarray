package reversaoarray;

import java.util.Random;

public class reversaoarray {

    public static void main(String[] args) {
        // Tamanho do array
        int tamanhoArray = 10;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array para armazenar os números aleatórios
        int[] numerosAleatorios = new int[tamanhoArray];

        // Preenche o array com números aleatórios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1;
        }

        // Imprime o array original
        System.out.println("Array original:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }

        // Imprime o array em ordem reversa
        System.out.println("\nArray em ordem reversa:");
        for (int i = tamanhoArray - 1; i >= 0; i--) {
            System.out.print(numerosAleatorios[i] + " ");
        }
    }
}
