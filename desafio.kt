enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome:String)

data class ConteudoEducacional(var nome: String, var nivel:Nivel)

data class Formacao(val nome: String, var nivel: Int, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        usuarios.forEach { inscritos.add(it) }
    }
}

fun main() {

    val usuario1 = Usuario("João")
    val conteudo1 = ConteudoEducacional("Kotlin", Nivel.BASICO)
    val formacao1 = Formacao("Kotlin", 1, listOf(conteudo1))

    formacao1.matricular(usuario1)

    println("Alunos inscritos: "+formacao1.inscritos)
    println("Conteúdos: "+formacao1.conteudos)
}
