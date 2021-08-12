let form = document.getElementById("form");

function verifica_nome(){
    if(document.getElementById("input-nome").value == null || document.getElementById("input-nome").value == " " || document.getElementById("input-nome").value==""){
        alert("digite o nome antigo!!");
        return false;
    }
    else{
        return true
    }
}

function verifica_nota(){
    if(document.getElementById("input-nota").value == null || document.getElementById("input-nota").value == " " || document.getElementById("input-nota").value==""){
        alert("digite a nova nota!!");
        return false;
    }
    else{
        return true
    }
}

function verifica_nome_Atual(){
    if(document.getElementById("input-nome-Atual").value == null || document.getElementById("input-nome-Atual").value == " " || document.getElementById("input-nome-Atual").value==""){
        alert("digite o nome Atual!!");
        return false;
    }
    else{
        return true
    }
}

function verifica_sinopse(){
    if(document.getElementById("input-sinopse").value == null || document.getElementById("input-sinopse").value == " " || document.getElementById("input-sinopse").value==""){
        alert("digite a sinopse!!");
        return false;
    }
    else{
        return true
    }
}

function enviar_formulario(){

    let nome=verifica_nome();
    let nome_Atual=verifica_nome_Atual();
    let sinopse=verifica_sinopse();
    let nota=verifica_nota();

    if(nome && nome_Atual && nota && sinopse) {
    form.submit();
    }
    else{
    alert("O formulario nao pode ser enviado!!");
    }
}
