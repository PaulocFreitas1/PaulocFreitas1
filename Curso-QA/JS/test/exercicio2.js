/*let aluno = "Adriano ";
let notaAluno = 8;
let notaFinal = notaAluno;

console.log("nome do aluno= ",aluno )+
console.log("nota final= ",notaFinal);
if(notaFinal <= 6){
    console.log("Aluno reprovado!")
}else{
    console.log("Aluno Aprovado!")
}
;
*/const notas = [8, 9, 10, 6.5, 8.5];

 let soma = 0;

 notas.foreach(nota => {
    soma += nota;
 });

 let media = soma/notas.length;

 console.log("Média: ", media);