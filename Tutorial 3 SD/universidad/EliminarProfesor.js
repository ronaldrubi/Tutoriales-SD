  function EliminarProfesor() {
    var id = d3.select("#id").property("value");
    var cedula = d3.select("#cedula").property("value");
    var nombre = d3.select("#nombre").property("value");
    var titulo = d3.select("#titulo").property("value");
    var area = d3.select("#area").property("value");
    var telefono = d3.select("#telefono").property("value");
    var correo = d3.select("#correo").property("value");
    var params = "id="+id+"&cedula="+cedula+"&nombre="+nombre+
                 "&titulo="+titulo+"&area="+area+"&correo="+correo+
                 "&telefono="+telefono;
    d3.xhr2("http://localhost:8089/rest/profesores/"+id,"DELETE",params,function(json) {
    });
    ListadoProfesores();
  }