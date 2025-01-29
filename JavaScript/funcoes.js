function criarBotoes(){
    var container = document.querySelector('div')
    var b1 = document.createElement("button")
    var b2 = document.createElement("button")
    var imagem = document.createElement("img")
    imagem.src="OIP.jpg"
    b1.innerHTML="Mostrar"
    b1.addEventListener('click', ()=>{container.appendChild(imagem)})
    b2.innerHTML="Esconder"
    b2.addEventListener('click', ()=>{container.removeChild(imagem)})
    container.appendChild(b1)
    container.appendChild(b2)

    container.appendChild(imagem)
}