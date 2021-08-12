let nome = document.getElementById("input-nome").value;
let nota = document.getElementById("input-nota").value;
let sinopse = document.getElementById("input-sinopse").value;
let form = document.getElementById("form");

function verifica_nome(){
    if(document.getElementById("input-nome").value == null || document.getElementById("input-nome").value == " " || document.getElementById("input-nome").value==""){
        alert("digite o titulo!!");
        return false;
    }
    else{
        return true
    }
}
function verifica_nota(){
    if(document.getElementById("input-nota").value == null || document.getElementById("input-nota").value == " " || document.getElementById("input-nota").value==""){
        alert("digite uma nota!!");
        return false;
    }
    else{
        return true
    }
}
function verifica_sinopse(){
    if(document.getElementById("input-sinopse").value == null || document.getElementById("input-sinopse").value == " " || document.getElementById("input-sinopse").value==""){
        alert("Digite uma sinopse");
        return false;
    }
    else{
        return true
    }

}
function enviar_formulario(){

    let nome=verifica_nome();
    let nota=verifica_nota();
    let sinopse=verifica_sinopse();

    if(nome && nota && sinopse) {
    form.submit();
    }
    else{
    alert("Não foi possivel enviar o formulario");
    }
}