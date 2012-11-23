  function AgregarProfesor(row) {
    d3.json("http://localhost:8089/rest/profesores/nuevo", function(json) {
      var content = d3.select("#content");
      content.selectAll("div").remove();
	  var idAleatorio = Math.floor(Math.random()*5000)
      var div = content.append("div");
      div.append("input")
        .attr("value",idAleatorio)
        .attr("id","id").
        attr("type","hidden");
      div.append("h2").text("Nuevo profesor");
      var table = div.append("table");
      var tr = table.append("tr");
      tr.append("td").text("Cedula:");
      tr.append("td").append("input")
        .attr("value","")
        .attr("id","cedula");
      tr.append("td").text("Nombre:");
      tr.append("td").append("input")
        .attr("value","")
        .attr("id","nombre");
      tr = table.append("tr");
      tr.append("td").text("Titulo:");
      tr.append("td").append("input")
        .attr("value","")
        .attr("id","titulo");;
      tr.append("td").text("Area:");
      tr.append("td").append("input")
        .attr("value","")
        .attr("id","area");;
      tr = table.append("tr");
      tr.append("td").text("Correo:");
      tr.append("td").append("input")
        .attr("value","")
        .attr("id","correo");;
      tr.append("td").text("Telefono:");
      tr.append("td").append("input")
        .attr("value","")
        .attr("id","telefono");;
      div.append("input").attr("type","button").attr("value","Actualizar").attr("id","button").attr("onClick","ActualizarProfesor(this)");
    });
  }