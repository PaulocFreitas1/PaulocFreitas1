const path= require('node:path') // esse node é para garantir q busq so no node
const fs=require('node:fs')

const filePath = path.join(process.cwd(), 'texto.txt')
console.log('filePath')