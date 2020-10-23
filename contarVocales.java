public class contarVocales {
 
    public static void main(String[] args) {
        contar("la casa azul esta encima de la montaña");
    }
 
    public static void contar(String cadena)
    {
        String vocales="aeiou";
        int contador[]={0,0,0,0,0};
 
        // recorremos la cadena recibida letra a letra
        for(int i=0;i<cadena.length();i++)
        {
            // recorremos las vocales para comparar con cada una de las letras
            for(int j=0;j<vocales.length();j++)
            {
                if(cadena.charAt(i)==vocales.charAt(j))
                {
                    // aumentamos el contador para la vocal encontrada
                    contador[j]++;
                }
            }
        }
 
        for(int i=0;i<vocales.length();i++)
        {
            System.out.println("Aparece la letra "+vocales.charAt(i)+": "+contador[i]+" veces");
        }
    }
 
}