public class Trabajo1 {
    public static void main (String[] args) {
        int[] numeros = new int[] { 28, 50, 40, 200, 20, 44, 100, 153 };
        // Asumir que el mayor es el primero
        int indiceDelMayor = 0;
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > numeros[indiceDelMayor]) {
                indiceDelMayor = x;
            }
        }
        // Ahora podemos obtener el mayor usando la posición
        int mayor = numeros[indiceDelMayor];
        System.out.println("El mayor es: " + mayor + " y se encuentra en el índice " + indiceDelMayor);
    }
}
}
