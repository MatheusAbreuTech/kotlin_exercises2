/*• Desenvolva um programa usando a estrutura “para” que
mostre na tela a seguinte contagem:

0 5 10 15 20 25 30 35 40 Acabou!*/

fun main(){
    var numero = 0
    for (i in 1..19) {
        println("$numero")
        numero += 5
    }
}

/*• Desenvolva um programa usando a estrutura “para” que
mostre na tela a seguinte contagem:

100 90 80 70 60 50 40 30 20 10 0 Acabou!*/

fun sequencia(){
    for (i in 100 downTo 0 step 10){
        println("$i")
    }
}

/*• Escreva um programa que leia um número qualquer e mostre a
tabuada desse número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5*/

fun tabuada(){
    print("Digite um numero: ")
    val numero = readln().toInt()
    for (i in 1..10){
        val mult = i * numero
        println("$i * $numero = $mult")
    }
}

/*• Faça um programa usando a estrutura “para” que leia um
número inteiro positivo e mostre na tela uma contagem de 0
até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/

fun contagem(){
    print("Digite um numero: ")
    val numero = readln().toInt()
    for (i in 1..numero){
        println("$i")
    }
}

/*• Crie um programa que leia sexo e peso de 8 pessoas,
usando a estrutura “para”. No final, mostre na tela:
• Quantas mulheres foram cadastradas
• Quantos homens pesam mais de 100Kg
• A média de peso entre as mulheres
• O maior peso entre os homens*/

fun count_sex() {
    var mulheres = 0
    var homensAcima100kg = 0
    var somaPesoMulheres = 0.0
    var totalMulheres = 0
    var maiorPesoHomem = 0.0

    for (i in 1..8) {
        print("Pessoa $i - Digite o sexo (M/F): ")
        val sexo = readln().trim().uppercase()

        print("Pessoa $i - Digite o peso (kg): ")
        val peso = readln().toDoubleOrNull()

        if (peso == null || (sexo != "M" && sexo != "F")) {
            println("Entrada inválida. Tente novamente.")
            continue // Se houver entrada inválida, repete a iteração
        }

        if (sexo == "F") {
            mulheres++
            somaPesoMulheres += peso
            totalMulheres++
        } else if (sexo == "M") {
            if (peso > 100) {
                homensAcima100kg++
            }
            if (peso > maiorPesoHomem) {
                maiorPesoHomem = peso
            }
        }
    }

    val mediaPesoMulheres = if (totalMulheres > 0) somaPesoMulheres / totalMulheres else 0.0

    println("\nResultados:")
    println(" Quantidade de mulheres cadastradas: $mulheres")
    println(" Homens com mais de 100kg: $homensAcima100kg")
    println(" Média de peso entre as mulheres: %.2f kg".format(mediaPesoMulheres))
    println(" Maior peso entre os homens: %.2f kg".format(maiorPesoHomem))
}
