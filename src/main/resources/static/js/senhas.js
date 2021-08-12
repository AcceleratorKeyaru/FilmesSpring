let senha = document.getElementById("input-senha").value;
let senha2 = document.getElementById("input-senha2").value;
let nome = document.getElementById("input-nome").value;
let user = document.getElementById("input-usuario").value;
let form = document.getElementById("form");

function verifica_nome(){
    if(document.getElementById("input-nome").value == null || document.getElementById("input-nome").value == " " || document.getElementById("input-nome").value==""){
        alert("digite seu nome!!");
        return false;
    }
    else{
        return true
    }
}
function verifica_usuario(){
    if(document.getElementById("input-usuario").value == null || document.getElementById("input-usuario").value == " " || document.getElementById("input-usuario").value==""){
        alert("digite seu usuario!!");
        return false;
    }
    else{
        return true
    }
}
function verifica_senha(){
    if(document.getElementById("input-senha").value !=  document.getElementById("input-senha2").value || document.getElementById("input-senha").value == ""){
        alert("senhas invalidas!!");
        return false;
    }
    else{
        return true
    }

}
function enviar_formulario(){

    let nome=verifica_nome();
    let usuario=verifica_senha();
    let senha=verifica_usuario();

    if(nome && usuario && senha) {
    form.submit();
    }
    else{
    alert("Não foi possivel enviar o formulario!!");
    }
}