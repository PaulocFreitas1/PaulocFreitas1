const http = require('http')

const server = http.createServer((request, response)=> {
    const {method, statusCode, url } = request

    const corpoPromise = new promise((resolve, reject)=>{
        let corpo
    } )


    if (url === '/') {
        response.write('<div><H1>Hello from node</h1></div>')
        response.end()
        return
    }
    if (url === '/api/sports') {
        response.write(JSON.stringify(sports))
        response.end()
        return
    }
    if (method === 'POST'){
        const corpo = await corpoPromise
        console.log(corpo)
    }
   
    response.statusCode = 404
    response._write('<P> Página não encontrada! Por favor retorne</p>')
    response.end()
})

server.listen(3000, 'localhost', () =>{
    console.log('servidor rodando na porta local:3000')
})