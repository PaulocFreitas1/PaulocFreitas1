const listaDeNumeros = [25, 88, 32, 40, 101, 97]
const listaDePares = []
const listaDeImpares = []

let indiceDoNumero = 0

while (indiceDoNumero < listaDeNumeros.length) {
    if (listaDeNumeros[indiceDoNumero] %2 === 0) {
     listaDePares.push(listaDeNumeros[indiceDoNumero])
    }
    else{
     listaDeImpares.push(listaDeNumeros[indiceDoNumero])
    }
    indiceDoNumero=indiceDoNumero + 1
}
console.log(listaDePares)
console.log(listaDeImpares)