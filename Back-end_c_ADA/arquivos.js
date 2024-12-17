const path= require('node:path') // esse node é para garantir q busq so no node
const fs=require('node:fs')

const filePath = path.join(process.cwd(), 'texto.txt')
const fileOutPath = path.join(process.cwd(), 'texto-com-linhas.txt')


fs.readFile(filePath, {}, (erro, dados)=>{
if(erro) {
    console.log(`Erro na leitura do arquivo no caminho ${filePath}`)
    return
}
const texto =dados.toString()
const linhas = texto.split('\n')

const linhasAjustadas= linhas.map((linha, index, ArrayDeLinhas)=> 
`${index + 1} - ${linha}`
)
fs.writeFile(fileOutPath, linhasAjustadas.join('\n'), {}, (erro)=> {//sobrescrever arquivo
    if(erro) {
         console.log(`Erro na leitura do arquivo no caminho ${fileOutPath}`)
     }
    })
})

//console.log(dados.toString()) para converter para string
//console.log('filePath')