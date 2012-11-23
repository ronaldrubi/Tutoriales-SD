var parser = new X2JS();
function ProfesorList($) {
  xhr('http://localhost:8089/axis2/services/UniversidadService',function (data) {
    var json = parser.xml_str2json(data);
    $.profesores = json.Envelope.Body.findAllProfesorResponse.return;
    framux.render();
  },'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllProfesor xmlns="http://service"></findAllProfesor></soap:Body></soap:Envelope>','text/xml');
};
function ProfesorDetail($, params) {
  xhr('http://localhost:8089/axis2/services/UniversidadService',function(data) {
    var json = parser.xml_str2json(data);
    $global.profesor = json.Envelope.Body.findProfesorResponse.return;
    $.prof = $global.profesor;
    framux.render();
  },'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findProfesor xmlns="http://service"><profesorID>'+params[0]+'</profesorID></findProfesor></soap:Body></soap:Envelope>','text/xml');
};
function ProfesorNew($) {
  xhr('http://localhost:8089/axis2/services/UniversidadService',function (data) {
    framux.render();
  });
};
function ProfesorInsert($, params) {
  $.prof = $global.profesor;
  xhr('http://localhost:8089/axis2/services/UniversidadService',function(data) {
    framux.go('profesores');
  },'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertProfesor xmlns="http://service"><profesorID>'+cedula.value+'</profesorID><cedula>'+cedula.value+'</cedula><nombre>'+nombre.value+'</nombre><titulo>'+titulo.value+'</titulo><area>'+area.value+'</area><correo>'+correo.value+'</correo><telefono>'+telefono.value+'</telefono></insertProfesor></soap:Body></soap:Envelope>','text/xml');
};
function ProfesorUpdate($, params) {
  $.prof = $global.profesor;
  xhr('http://localhost:8089/axis2/services/UniversidadService',function(data) {
    framux.go('profesores');
  },'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateProfesor xmlns="http://service"><profesorID>'+$.prof.cedula+'</profesorID><cedula>'+$.prof.cedula+'</cedula><nombre>'+$.prof.nombre+'</nombre><titulo>'+$.prof.titulo+'</titulo><area>'+$.prof.area+'</area><correo>'+$.prof.correo+'</correo><telefono>'+$.prof.telefono+'</telefono></updateProfesor></soap:Body></soap:Envelope>','text/xml');
};
function ProfesorDelete($, params) {
  $.prof = $global.profesor;
  xhr('http://localhost:8089/axis2/services/UniversidadService',function(data) {
    framux.go('profesores');
  },'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteProfesor xmlns="http://service"><profesorID>'+$.prof.cedula+'</profesorID></deleteProfesor></soap:Body></soap:Envelope>','text/xml');
};