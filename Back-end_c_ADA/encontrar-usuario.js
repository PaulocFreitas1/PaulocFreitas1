const listaDeContatos = ["Paulo", "Alice", "Carlos", "Zeca", "Lucas"]

let encontrouUsuarioOuPercorreuLista = false
let antingiuFimDaLista = false
let indinceDoUsuario = 0 

while (!encontrouUsuarioOuPercorreuLista){
    const usuarioAtual = listaDeContatos[indiceDoUsuario]
    if (usuarioAtual.startsWith('Z')) {
        encontrouUsuarioOuPercorreuLista = true
        console.log(`Usuário econtrado:' ${usuarioAtual}`)
    }
    indiceDoUsuario = indiceDoUsuario + 1

    if (indiceDoUsuario === listaDeContatos.length) {
        encontrouUsuarioOuPercorreuLista = true
        console.log('Usuário não foi encontrado')
    }

}
