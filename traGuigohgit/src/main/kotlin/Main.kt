
fun main() {
    var num1 = 5
    var num2 = 6
    var palavra = "arara"
    var palavraR = palavra.reversed()
    var acao = readLine()
    var ligar : Boolean = true

    val calcularMedia = ((num1 + num2) / 2)

    while (ligar) {
        when (acao) {
            "1" -> if (palavra == palavraR) {
                println("é pali")
                break
            } else {
                println("Não é pali")
                break
            }
            "2"->if(ligar) {
                println("sua media é$calcularMedia")
                break
            }
            "3" -> ligar = false

            else ->if(ligar) {
                println("numero invalido")
                break
            }
        }
    }
}

