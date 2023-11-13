// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

class Usuario(val id: Int, val nome: String, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("Usuário ${usuario.nome} matriculado com sucesso!")
        } else {
            println("Usuário ${usuario.nome} já está matriculado.")
        }
    }

    override fun toString(): String {
        return "Formação(nome='$nome', conteudos=$conteudos, inscritos=$inscritos)"
    }
}

fun main() {
    val usuario = Usuario(1, "João", "joao@gmail.com")
    val conteudo = ConteudoEducacional("Kotlin Básico", 60)
    val formacao = Formacao("Desenvolvimento Android", listOf(conteudo))

    formacao.matricular(usuario)
    println(formacao)
}