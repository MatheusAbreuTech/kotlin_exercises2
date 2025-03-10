/*Crie um programa que mostre na tela a seguinte contagem, usando a estrutura “faça enquanto”
0 3 6 9 12 15 18 21 24 27 30 Acabou!*/

fun main() {
    var i = 0

    do {
        println(i)
        i += 3
    } while (i <= 30)

    println("Acabou!")
}

/*• Faça um programa usando a estrutura “faça enquanto” que leia a
idade de várias pessoas. A cada laço, você deverá perguntar para o
usuário se ele quer ou não continuar a digitar dados. No final,
quando o usuário decidir parar, mostre na tela:
• Quantas idades foram digitadas
• Qual é a média entre as idades digitadas
• Quantas pessoas tem 21 anos ou mais.*/

fun idade() {
    var totalIdades = 0
    var somaIdades = 0
    var maisDe21 = 0
    var continuar: String

    do {
        print("Digite a idade: ")
        val idade = readLine()?.toIntOrNull() ?: 0

        somaIdades += idade
        totalIdades++

        if (idade >= 21) {
            maisDe21++
        }

        print("Quer continuar? (s/n): ")
        continuar = readLine()?.lowercase() ?: "n"
    } while (continuar == "s")

    val media = if (totalIdades > 0) somaIdades.toDouble() / totalIdades else 0.0

    println("Quantidade de idades digitadas: $totalIdades")
    println("Média das idades: %.2f".format(media))
    println("Quantidade de pessoas com 21 anos ou mais: $maisDe21")
}

/*• Crie um programa usando a estrutura “faça enquanto” que leia
vários números. A cada laço, pergunte se o usuário quer continuar
ou não. No final, mostre na tela:
• O somatório entre todos os valores
• Qual foi o menor valor digitado
• A média entre todos os valores
• Quantos valores são pares*/

fun Equacao() {
    var soma = 0
    var menor: Int? = null
    var totalNumeros = 0
    var totalPares = 0
    var continuar: String

    do {
        print("Digite um número: ")
        val numero = readLine()?.toIntOrNull() ?: 0

        soma += numero
        totalNumeros++

        if (menor == null || numero < menor) {
            menor = numero
        }

        if (numero % 2 == 0) {
            totalPares++
        }

        print("Quer continuar? (s/n): ")
        continuar = readLine()?.lowercase() ?: "n"
    } while (continuar == "s")

    val media = if (totalNumeros > 0) soma.toDouble() / totalNumeros else 0.0

    println("Somatório dos valores: $soma")
    println("Menor valor digitado: $menor")
    println("Média dos valores: %.2f".format(media))
    println("Quantidade de valores pares: $totalPares")
}
