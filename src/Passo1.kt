//EXERCICIO 1:
//1 Escreva um programa que mostre na tela a mensagem "Olá, Mundo!"
fun main (){
    println("Olá, Mundo!")
}


//2 Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
//vindas para ela:
//
//Ex:
//Qual é o seu nome? João da Silva
//Olá João da Silva, é um prazer te conhecer!

fun welcome(){
    println("Qual seu nome?")
    val nome = readln()
    println("Ola $nome Seja bem vindo")
}

//3 Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
//mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.


fun salario1(){
    println("qual seu nome: ")
    var nome = readln()
    println("quanto voce ganha?: ")
    var salario= readln()

    println("O funcionário $nome do Carmo tem um salário de $salario em junho.")

}

//4 - Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.


fun soma(){
    println("digite um valor: ")
    var valor1 = readln().toInt()
    print("digite outro valor: ")
    var valor2= readln().toInt()
    var total = valor1+valor2
    println("A soma entre $valor1 e $valor2 é igual a $total")


}



//5- Faça um programa em Kotlin que leia as duas notas de um aluno em uma matéria e
//mostre na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5


fun media_aluno (){
    println("Nota 1: ")
    val nota1 = readln().toFloat()
    println("Nota 2: ")
    val nota2 = readln().toFloat()
    val media = (nota1 + nota2)/2

    println("A média entre $nota1 e $nota2 é igual a $media")
}


//7-Faça um programa em Kotlin que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

fun antecessor (){
    print("Digite um número: ")
    val num = readln().toInt()
    println("o antecessor de $num é ${num -1}")
    println("o sucessor de $num é ${num +1}")
}

//Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro
//e a sua terça parte.
//Ex: Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

fun dobro (){
    print("Digite um número: ")
    val num = readln().toFloat()
    println("O dobro de $num é ${num * 2}")
    println("a terça parte de $num é ${num / 3 }")
}


//9 Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
//valores relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 100
//Distância de 10000 Cm

fun distancia(){
    println("Digite uma distancia em metros: ")
    val distancia = readln().toFloat()
    println("A distancia em centimetros é: ${distancia*100}")
    println("A distancia em km é: ${distancia/1000}")

}



//10 Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
//R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
//cotação atual)


fun carteira_dolares(){
    println("Quanto dinheiro voce tem na carteira?: ")
    var dinheiro = readln().toFloat()
    val dolar = 5.79
    println("Voce pode comprar ${dinheiro/dolar} dolares")

}


//11-Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.

fun tinta(){
    print("digite a largura da parede")
    val largura = readln().toFloat()
    println("Digite a altura da parede:")
    val altura= readln().toFloat()
    val area = largura * altura
    val tinta = area/2

    println("A area da parede é $area e a quantidade de tinta necessaria é $tinta Litros")

}

//12-Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
//equação do segundo grau e mostre o valor de Delta. (formula Δ = b
//2 – 4ac)

fun baskara (){
    print("digite o valor de A: ")
    val a = readln().toInt()
    print("digite o valor de B: ")
    val b = readln().toInt()
    print("digite o valor de C: ")
    val c = readln().toInt()
    val baoquadrado = b*b
    val quatroporaporc = (4*a)*c

    val delta = (baoquadrado)-(quatroporaporc)

    println("valor de delta: ${baoquadrado-quatroporaporc}")
}

//13-Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
//seu PREÇO PROMOCIONAL, com 5% de desconto.

fun preco_promocional() {
    print("digite o preço")
    var preco = readln().toFloat()
    var valor_promocional = (5 * preco) / 100
    println("o valor promocional do produto é $valor_promocional")
}

//14-Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

fun salario_aumento(){
    print("digite seu salario: ")
    val salario = readln().toFloat()
    val aumento=salario*0.15
    val novo_salario = salario+aumento
    print("Seu salario é $salario 15% dele é $aumento e seu novo salario pós aumento é $novo_salario")
}

//
//15-Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário.
//
//Considere que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.


fun salary(){
    println("Digite quantos dias voce trbaalhou:")
    val dias_trabalhados = readln().toInt()
    val recebe_dia=8 * 25
    val salario= (dias_trabalhados*recebe_dia)
    println("Voce trabalhou $dias_trabalhados portanto seu salario é de $salario")

}

//15-[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante.
//
//Pergunte a quantidade de cigarros fumados por dia e quantos anos ele já fumou.
//Considere que um fumante perde 10 minutos de vida a cada cigarro.
//Calcule quantos dias de vida um fumante perderá e exiba o total em dias.
fun cigarro() {

    print("Quantos cigarros você fuma por dia? ")
    val cigarrosPorDia = readLine()!!.toInt()


    print("Há quantos anos você fuma? ")
    val anosFumando = readLine()!!.toInt()


    val totalCigarros = cigarrosPorDia * (anosFumando * 365)


    val minutosPerdidos = totalCigarros * 10


    val diasPerdidos = minutosPerdidos / 1440.0


    println("Você já perdeu aproximadamente %.2f dias de vida devido ao cigarro.".format(diasPerdidos))
}
//
//17-Escreva um programa que pergunte a velocidade de um carro.
//
//Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado.
//O valor da multa será de R$5 por cada Km acima da velocidade permitida.
fun multa() {

    print("Digite a velocidade do carro (Km/h): ")
    val velocidade = readLine()!!.toInt()


    val limite = 80


    if (velocidade > limite) {
        val excesso = velocidade - limite
        val multa = excesso * 5
        println("Você foi MULTADO! Excedeu o limite de $limite Km/h.")
        println("O valor da multa é de R$$multa,00.")
    } else {
        println("Velocidade dentro do limite. Dirija com segurança!")
    }
}



