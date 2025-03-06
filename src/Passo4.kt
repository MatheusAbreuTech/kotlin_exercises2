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

//fun main(){
//    var mais18 = 0
//    var menos5 = 0
//    var somaIdade = 0
//    var maiorDeIdade = 0
//    var qtd = 0
//
//    while(qtd <= 10){
//        print("Digite sua idade: ")
//        val idade = readln()!!.toInt()
//        somaIdade  += idade
//
//        if(idade >= 18){
//            mais18 ++
//        }
//
//        if(idade < 5){
//            menos5 ++
//        }
//
//        if(idade > maiorDeIdade){
//            maiorDeIdade = idade
//        }
//        qtd++
//    }
//    val media = somaIdade.toDouble() / qtd
//    println("Media de idade do grupo de pessoas: $media")
//    println("Quantidade de pessoas com maior de 18 anos: $mais18")
//    println("Quantidade de pessoas menores de 5 anos: $menos5")
//    println("Maior idade citada: $maiorDeIdade")
//}



//• Faça um programa que leia a idade e o sexo de 5 pessoas,
//mostrando no final:
//• Quantos homens foram cadastrados
//• Quantas mulheres foram cadastradas
//• A média de idade do grupo
//• A média de idade dos homens
//• Quantas mulheres tem mais de 20 anos

//fun main() {
//    var Homen = 0
//    var Mulher= 0
//    var somaIdades = 0
//    var somaIdadeHomens = 0
//    var qtdMulheresMais20 = 0
//    var qtd = 0
//
//    while (qtd < 5) {
//        print("Digite a idade: ")
//        val idade = readLine()!!.toInt()
//
//        print("Digite o sexo (M/F): ")
//        val sexo = readLine()!!
//
//        somaIdades += idade
//
//        if (sexo == "M" || sexo == "m") {
//            Homen++
//            somaIdadeHomens += idade
//        } else if (sexo == "F" || sexo == "f") {
//            Mulher++
//            if (idade > 20) {
//                qtdMulheresMais20++
//            }
//        }
//        qtd++
//    }
//    val mediaIdadeGrupo = somaIdades / 5.0
//    val mediaIdadeHomens = if (Homen > 0) somaIdadeHomens / Homen.toDouble() else 0.0
//
//    println("Total de homens cadastrados: $Homen")
//    println("Total de mulheres cadastradas: $Mulher")
//    println("Média de idade do grupo: %.2f".format(mediaIdadeGrupo))
//    println("Média de idade dos homens: %.2f".format(mediaIdadeHomens))
//    println("Mulheres com mais de 20 anos: $qtdMulheresMais20")
//}



//• Desenvolva um aplicativo que leia o peso e a altura de 7
//pessoas, mostrando no final:
//• Qual foi a média de altura do grupo
//• Quantas pessoas pesam mais de 90Kg
//• Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//• Quantas pessoas que medem mais de 1.90m pesam mais de
//100Kg.
//
//fun main() {
//    var somaAltura = 0
//    var pessoasMais90kg = 0
//    var pessoasMenos50kgMenos160cm = 0
//    var pessoasMais190cmMais100kg = 0
//    var qtd = 0
//
//    while (qtd < 7) {
//        print("Digite o peso da pessoa ${qtd + 1} (Kg): ")
//        val peso = readLine()!!.toDouble()
//
//        print("Digite a altura da pessoa ${qtd + 1} (m): ")
//        val altura = readLine()!!.toInt()
//
//        somaAltura += altura
//
//        if (peso > 90) {
//            pessoasMais90kg++
//        }
//        if (peso < 50 && altura < 1.60) {
//            pessoasMenos50kgMenos160cm++
//        }
//        if (altura > 1.90 && peso > 100) {
//            pessoasMais190cmMais100kg++
//        }
//
//        qtd++
//    }
//
//    val mediaAltura = somaAltura / 7
//
//    println("Média de altura do grupo: %.2f m".format(mediaAltura))
//    println("Pessoas com mais de 90Kg: $pessoasMais90kg")
//    println("Pessoas com menos de 50Kg e menos de 1.60m: $pessoasMenos50kgMenos160cm")
//    println("Pessoas com mais de 1.90m e mais de 100Kg: $pessoasMais190cmMais100kg")
//}



//• [DESAFIO] Vamos melhorar o jogo que fizemos no exercício
//32. A partir de agora, o computador vai sortear um número entre
//1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.

//import kotlin.random.Random
//
//fun main() {
//    val Sorteado = Random.nextInt(1, 11)
//    var tentativas = 4
//
//    while (tentativas > 0) {
//        print("Digite um número entre 1 e 10: ")
//        val palpite = readLine()!!.toInt()
//
//        if (palpite == Sorteado) {
//            println("Parabéns! Você acertou.")
//            return
//        }
//
//        tentativas--
//        println("Errado! Tentativas restantes: $tentativas")
//    }
//
//    println("Acabaram as tentativas! O número era $Sorteado.")
//}
