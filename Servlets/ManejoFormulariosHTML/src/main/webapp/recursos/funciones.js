
function validarForma(forma) {
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario.");
        usuario.focus();
        usuario.select();
        return false;
    }

    var password = forma.password;
    if (password.value == "" || password.value.length < 3) {
        alert("Debe proporcionar un password valido (más de 3 caracteres).");
        usuario.focus();
        usuario.select();
        return false;
    }

    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }

    if (!checkSeleccionado) {
        alert("Debe seleccionar una tecnología.");
        return false;
    }

    var genero = forma.genero;
    var radioSeleccionado = false;

    for (var i = 0; i < genero.length; i++) {
        if (genero[i].checked) {
            radioSeleccionado = true;
        }
    }

    if (!radioSeleccionado) {
        alert("Debe seleccionar un género.");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupación.");
        return false;
    }
    
    alert("Formulario válido, enviando datos al servidor...");
    return true;
}