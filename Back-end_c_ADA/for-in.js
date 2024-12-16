const { normalize } = require("path")

const user = {
    name: 'Jose Inácio de Souza',
    email: 'jose.inacio1@gmail.com',
    age: 23,
    adress: 'X Street'
}

for (const baseuser in user){
    if (baseuser === 'name'){
        const names = user[baseuser].split(' ')
        user[baseuser]= ''

        for (const name of names){
            const NormalizedName= name.toLocaleLowerCase()
            const [primeiraLetra, ...restoDoNome]= NormalizedName

            user[baseuser]= user[baseuser] + ' '+ primeiraLetra.toUpperCase +restoDoNome.join('')
            user[baseuser] = user[baseuser].trim()
        }
        if (baseuser === 'email'){
            user[baseuser]= user[baseuser].toLocaleLowerCase
        }
       
    }
}