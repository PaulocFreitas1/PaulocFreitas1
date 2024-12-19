const searchedUrl = 'google.com' 
    
    console.time('Pesquisando url por DNS padrão')
    const addresses = await dns.promises.resolve4(searchedUrl)
    console.timeEnd('Pesquisando url por DNS padrão')
    console.log(addresses)

    const nameServers = await dns.promises.resolveNs(searchedUrl)
    console.log(nameServers)

    const ipNs = await dns.promises.resolve4(nameServers[1])

    const resolver = new dns.Resolver()
    resolver.setServers(ipNs)
    
    console.time('Pesquisando url por DNS especifico')
    resolver.resolve4(searchedUrl, (error, addresses)=> {
          if (error){
             console.error('Não foi possivel encontrar o ipv4')
            }
        console.timeEnd('Pesquisando url por DNS especifico')
        console.log(addresses)
    })
bootstrap()







//dns.resolve4(searchedUrl, (err, addresses)=> -ESTE É O METODO 1
//{
//    if(err){
 ////       console.log('url nao encontrada')
   //     return
   // }
   // console.log(addresses)
//})