const { rejects } = require('assert')
const rl = require('readline')

const prompt = rl.createInterface({
    input: process.stdin, // pega a resposta do teclado do user
    output: process.stdout // retorna a resposta do teclado do user
})

const promptPromise= {
    question: (pergunta) => new Promise((resolve,reject) => {
        try{
            prompt.question((pergunta), (resposta)=> resolve(resposta))
        }catch (error) {
            reject(error)
        }
    }),
    close: ()=> prompt.close()
} //poderia fazer o mesmo processo apenas usando prompit.question e retornar no console
// mas teria de repetir o processo a cada pergunta. (usando callback)
async function askUser() {
    const numero = await promptPromise.question('Qual seu numero favorito?: ')
    console.log(`O dobro do seu numero favorito é: ${parseInt(numero) * 2}`)

    const cor= await promptPromise.question('Qual sua cor favorita?: ')
    console.log(`Sua cor favorita é: ${cor}`)
    promptPromise.close()
}
askUser()
