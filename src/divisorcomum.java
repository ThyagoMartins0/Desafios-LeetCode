class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

/*
Este método recebe duas strings, str1 e str2, e retorna o maior divisor comum das duas strings.
Primeiro, verifica se a concatenação das duas strings (str1 + str2) é igual à concatenação na ordem inversa (str2 + str1). Se não forem iguais, retorna uma string vazia "", porque isso significa que não há um divisor comum que forme ambas as strings.
Se a concatenação for igual, determina o tamanho do maior divisor comum entre o comprimento de str1 e str2 usando a função gcd.
Finalmente, retorna uma substring de str1 começando do índice 0 até o tamanho do MDC encontrado.
Método gcd:

É um método privado que utiliza o Algoritmo de Euclides para encontrar o maior divisor comum entre dois números inteiros a e b.
Retorna o MDC de a e b.
Por exemplo, se str1 fosse "abcabc" e str2 fosse "abc", a função retornaria "abc
 */