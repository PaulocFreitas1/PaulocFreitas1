fetch('hppt://localhost:5000').then(
    response => response.text()
    .then(data => console.log(data))
)
// as duas fazem o mesmo trabalho.
async function Puxada() {//poderia dar uma funçao, mas n precisa
    const response = await fetch('hppt://localhost:5000')
    const data = await response.text()

    console.log(data)
}
Puxada()