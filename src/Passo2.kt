//
////17 - Escreva um programa que pergunte a velocidade de um carro.
////Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado.
////O valor da multa será de R$5 por cada Km acima da velocidade permitida.
//fun calculateSpeedingTax(speed: Double, maxSpeed: Double, taxPricePerKilometer: Double): Double {
//    if (speed > maxSpeed) {
//        val difference:Double = speed - maxSpeed
//        val taxPrice:Double = difference * taxPricePerKilometer
//        return taxPrice
//    }
//    return 0.0
//}
//
////18 - Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.
//fun podeVotar(){
//    print("Digite o ano de nascimento: ")
//    val anoNascimento = readln().toInt()
//    val idade = 2023 - anoNascimento
//
//    if (idade >= 16) {
//        println("Você pode votar!")
//    } else {
//        println("Você não pode votar.")
//    }
//}
//
////19 - Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela.
////No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (média acima de 7.0).
//fun mediaAluno() {
//    print("Digite o nome do aluno: ")
//    val nome = readln()
//
//    print("Digite a primeira nota: ")
//    val nota1 = readln().toDouble()
//
//    print("Digite a segunda nota: ")
//    val nota2 = readln().toDouble()
//
//    val media = (nota1 + nota2) / 2
//
//    println("A média do aluno $nome é $media")
//
//    if (media > 7.0) {
//        println("O aluno teve um bom aproveitamento.")
//    } else {
//        println("O aluno não teve um bom aproveitamento.")
//    }
//}
//
//
////20 - Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.
//fun parOuImpar() {
//    print("Digite um número inteiro: ")
//    val numero = readln().toInt()
//
//    if (numero % 2 == 0) {
//        println("O número é PAR.")
//    } else {
//        println("O número é ÍMPAR.")
//    }
//}
//
////21 - Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.
//fun anoBissexto() {
//    print("Digite um ano: ")
//    val ano = readln().toInt()
//
//    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
//        println("O ano $ano é BISSEXTO.")
//    } else {
//        println("O ano $ano não é BISSEXTO.")
//    }
//}
//
////22 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
////Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
////Se já tiver mais de 18 anos, mostre quantos anos já se passaram do alistamento.
//fun alistamentoMilitar() {
//    print("Digite o ano de nascimento: ")
//    val anoNascimento = readln().toInt()
//    val idade = 2023 - anoNascimento
//
//    if (idade < 18) {
//        println("Faltam ${18 - idade} anos para o alistamento.")
//    } else {
//        println("Já se passaram ${idade - 18} anos do alistamento.")
//    }
//}
//
////23 - Uma loja quer dar descontos para todos, mas especialmente para mulheres.
////Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto.
////Homens ganham 5% de desconto.
////Mulheres ganham 13% de desconto.
//fun descontoPeloGenero() {
//    print("Digite o nome do cliente: ")
//    val nome = readln()
//
//    print("Digite o sexo do cliente (M/F): ")
//    val sexo = readln().uppercase()
//
//    print("Digite o valor das compras: ")
//    val valorCompras = readln().toDouble()
//
//    val desconto = if (sexo == "F") 0.13 else 0.05
//    val valorFinal = valorCompras * (1 - desconto)
//
//    println("O valor final com desconto é: R$$valorFinal")
//}
//
////24 - Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km.
////Calcule o preço da passagem, cobrando R$0,50 por Km para viagens até 200Km e R$0,45 para viagens mais longas.
//fun calcularPrecoPassagem() {
//    print("Digite a distância a ser percorrida (Km): ")
//    val distancia = readln().toDouble()
//
//    val preco = if (distancia <= 200) {
//        distancia * 0.50
//    } else {
//        distancia * 0.45
//    }
//
//    println("O preço da passagem é: R$$preco")
//}
//
////25- [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
////Analise seus comprimentos e diga se é possível formar um triângulo com essas retas.
////Regra Matemática: Para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.
//fun main() {
//    // Solicita ao usuário os comprimentos dos três segmentos de reta
//    print("Digite o comprimento do primeiro segmento: ")
//    val a = readln().toDouble()
//
//    print("Digite o comprimento do segundo segmento: ")
//    val b = readln().toDouble()
//
//    print("Digite o comprimento do terceiro segmento: ")
//    val c = readln().toDouble()
//
//    // Verifica se é possível formar um triângulo com os segmentos fornecidos
//    if (a < b + c && b < a + c && c < a + b) {
//        println("É possível formar um triângulo com esses segmentos.")
//    } else {
//        println("Não é possível formar um triângulo com esses segmentos.")
//    }
//}