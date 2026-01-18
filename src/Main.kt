fun main() {
    println("Login")
    println("Digite senha\n")
    val senha = readln()
    val regexEspecial = Regex("[!@#%]")// regex para caracteres especiais
    val regexUppercase = Regex("[A-Z]") // regex para Uppercase Alfabetico
    if (regexUppercase.containsMatchIn(senha) && regexEspecial.containsMatchIn(senha)) {
        println("Bem vindo")
    }// filtra por input
        else {
            println("Digite senha novamente")
            println("Senha incorreta, digite ao menos um maiuscula e um caráctere especial")
        } // caso não... senha incorreta.


    }



