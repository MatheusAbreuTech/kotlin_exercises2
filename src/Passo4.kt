//PASSO 4
//
//• Escreva um programa que mostre na tela a seguinte contagem:
//6 7 8 9 10 11 Acabou!//
//
//fun main (){
//    var i = 6
//    while (i <= 11){
//        print(i)
//        i ++
//    }
//    println("Acabou!")
//}
//
//
//
//• Faça um algoritmo que mostre na tela a seguinte contagem:
//10 9 8 7 6 5 4 3 Acabou!//
//
//fun main (){
//    var i = 10
//    while (i >= 3){
//        print(i)
//        i --
//    }
//    print("Acabou!")
//}
//
//
//
//• Crie um aplicativo que mostre na tela a seguinte contagem:
//0 3 6 9 12 15 18 Acabou!//
//
//fun main(){
//    var i = 3
//    while (i <= 18){
//        print(i)
//        i += 3
//    }
//    print("Acabou!")
//}
//
//
//
//• Desenvolva um programa que mostre na tela a seguinte contagem:
//100 95 90 85 80 ... 0 Acabou!
//
//fun main (){
//    var i = 100
//    while (i >= 80){
//        print(i)
//        i -= 5
//    }
//    print("Acabou!")
//}
//
//
//
//• Faça um algoritmo que pergunte ao usuário um número
//inteiro e positivo qualquer e mostre uma contagem até esse
//valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
//
//fun main (){
//    println("Digite um número inteiro positivo: ")
//    val n = readLine()!!.toInt()
//    var i = n
//    while ( i >= 1){
//        print(i)
//        i --
//    }
//    print("Acabou!")
//}
//
//
//
//• Desenvolva um algoritmo que mostre uma contagem regressiva de
//////30 até 1, marcando os números que forem divisíveis por 4,
//////exatamente como mostrado abaixo:
//////30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
//
//fun main(){
//    var i = 30
//    while (i >= 1){
//        if( i % 4 == 0){
//            print("[$i]")
//        }else{
//            print(i)
//        }
//        i --
//    }
//}
//
//
//
//• Crie um algoritmo que leia o valor inicial da contagem, o
//valor final e o incremento, mostrando em seguida todos os
//valores no intervalo:
//Ex: Digite o primeiro Valor: 3
//Digite o último Valor: 10
// Digite o incremento: 2
//Contagem: 3 5 7 9 Acabou!
//
//fun main(){
//    var primeiroValor = 3
//    var ultimoValor = 10
//    var incremento = 2
//    while  (primeiroValor <= ultimoValor){
//        print(primeiroValor)
//        primeiroValor += incremento
//    }
//    print("Acabou!")
//}
//
//
//
//• O programa acima vai ter um problema quando digitarmos o
//primeiro valor maior que o último. Resolva esse problema com um
//código que funcione em qualquer situação.
//
//fun main() {
//    println("Digite seu primeiro valor: ")
//    var primeiroValor = readLine()!!.toInt()
//    println("Digite seu último valor: ")
//    var ultimoValor = readLine()!!.toInt()
//    println("Digite seu incremento: ")
//    var incremento = readLine()!!.toInt()
//
//    if (primeiroValor > ultimoValor) {
//        print("Ocorreu um erro!! o primeiro valor não pode ser maior que o ultimo!")
//    }else{
//        while  (primeiroValor <= ultimoValor){
//        print(primeiroValor)
//        primeiroValor += incremento
//    }
//    print("Acabou!")
//    }
//}
//
//
//
//• Crie um programa que calcule e mostre na tela o resultado da
//soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
//
//fun main (){
//    var i = 8
//    var soma = 0
//    while (i <= 100){
//        print(i)
//        soma += i
//
//        if (i < 100){
//            print("+")
//        }
//        i += 2
//    }
//    println(" = $soma")
//}
//
//
//
//• Desenvolva um aplicativo que mostre na tela o resultado da
//expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
//
//fun main(){
//    var soma = 0
//    var i = 500
//    while (i >= 0){
//        print(i)
//        soma += i
//
//        if (i > 0){
//            print("+")
//        }
//        i -= 50
//    }
//    print("= $soma")
//}
//
//
//
//• Faça um programa que leia 7 números inteiros e no final
//mostre o somatório entre eles.
//
//fun main (){
//    var qtd = 0
//    var soma = 0
//    while (qtd < 7){
//        print("Digite um numero: ")
//        val numero = readLine()!!.toInt()
//        soma = numero + qtd
//        qtd ++
//    }
//    print("soma $soma")
//}
//
//
//
//• Crie um programa que leia 6 números inteiros e no final mostre
//quantos deles são pares e quantos são ímpares.
//
//fun main(){
//    var par = 0
//    var impar = 0
//    var qtd = 0
//    while (qtd <= 6){
//        print("Digte um numero inteiro: ")
//        val numero = readLine()!!.toInt()
//        if (numero %2 == 0){
//            par += 1
//        }else{
//            impar += 1
//        }
//        qtd ++
//    }
//    print("numeros impares: $impar numeros pares: $par")
//}
//
//
//
//• Desenvolva um programa que faça o sorteio de 20 números
//entre 0 e 10 e mostre na tela:
//
//• Quais foram os números sorteados
//• Quantos números estão acima de 5
//• Quantos números são divisíveis por 3
//
//import kotlin.random.Random
//
//fun main(){
//    var numerosAcimaDe5 = 0
//    var numerosDivisiveisPor3 = 0
//    var qtd = 0
//    while (qtd < 20){
//        val numero = Random.nextInt(0 , 11)
//        println("numero aleatório: $numero ")
//
//        if (numero >  5){
//            numerosAcimaDe5 ++
//        }
//
//        if (numero %3 ==0 ){
//            numerosDivisiveisPor3 ++
//        }
//        qtd ++
//    }
//    println("Numero acima de 5: $numerosAcimaDe5")
//    println("Numero dividido por 3: $numerosDivisiveisPor3")
//}
//
//
//
//• Faça um aplicativo que leia o preço de 8 produtos. No final,
//mostre na tela qual foi o maior e qual foi o menor preço
//digitados.
//
//fun main (){
//    print("Digite um numero: ")
//    var numero1 = readLine()!!.toInt()
//    var maiorPreco = numero1
//    var menorPreco = numero1
//    var qtd = 0
//    while (qtd < 8){
//        print("Digite 0 $qtd numero: ")
//        var numero2 =  readLine()!!.toInt()
//
//        if(numero2 > maiorPreco){
//            maiorPreco = numero2
//        }
//
//        if(numero2 < menorPreco){
//            menorPreco  = numero2
//        }
//        qtd ++
//    }
//    println("Maior preço : $maiorPreco")
//    println("Menor preço : $menorPreco")
//}
//
//
//
//• Crie um algoritmo que leia a idade de 10 pessoas, mostrando no
//final:
//• Qual é a média de idade do grupo
//• Quantas pessoas tem mais de 18 anos
//• Quantas pessoas tem menos de 5 anos
//• Qual foi a maior idade lida


