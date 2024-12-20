const http = require('http')

const server = http.createServer((request, response)=> {
    const {method, statusCode, url } = request

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
   
    response.statusCode = 404
    response._write('<P> Página não encontrada! Por favor retorne</p>')
    response.end()
})

server.listen(5000, 'localhost', () =>{
    console.log('servidor rodando na porta local:3000')
})