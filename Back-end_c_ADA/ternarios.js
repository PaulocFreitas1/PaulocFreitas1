const idade =19 
const temCH = true
const podeDirigir = idade > 18 && temCH

if (podeDirigir) {
    console.log('Pessoa esta habilitada para conduzir')
}else {
    console.log('Pessoa não esta habilitada para conduzir')
}
const numeroDePassageiros = podeDirigir ? 4 : 0

console.log({numeroDePassageiros})