
fun main() {

    var alunos = ArrayList<String>()
    var alunosListaFeminina = listOf<String>("Gabriela Queiroz", "Luiza Gomes", "Monica Andrade")
    var alunosListaMaculina = listOf<String>("Lucas Pereira", "Otavio Gomes", "Pedro Nascimento")

    alunos.addAll(alunosListaFeminina + alunosListaMaculina)

    var Quantiadade = alunos.count()
    println(Quantiadade)

    if (alunos.containsAll(alunosListaFeminina)) {
        println(alunos)
    }
val mensagem="A Sala está vazia"
    alunos.remove("Lucas Pereira")
    var QuantidadeRenovada=alunos.count()
println(QuantidadeRenovada)
    if  (alunos.containsAll(alunosListaFeminina) ||  alunos.containsAll(alunosListaMaculina)) {
println("Lista contem alunas e Alunos na Lista")}
else {
    println("Sala Vazia")
}

}