package servicio;
import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

@WebService (targetNamespace ="http://service", name="universidad")
public class Universidad {

  private static ProfesorService profesor;
	
  @WebMethod (action="urn:findProfesor", operationName="findProfesor")
  public ProfesorDTO findProfesor(
    @WebParam (name="profesorID") String profesorID
    ) {
    checkProfesor();
	  return profesor.find(profesorID);
  }
  
  @WebMethod (action="urn:insertProfesor", operationName="insertProfesor")
  public void insertProfesor(
	@WebParam (name="profesorId") String profesorID,
    @WebParam (name="cedula") String cedula, 
	@WebParam (name="area") String area, 
	@WebParam (name="nombre") String nombre, 
	@WebParam (name="titulo") String titulo,
	@WebParam (name="correo") String correo,
	@WebParam (name="telefono") String telefono
	) {
    checkProfesor();
      profesor.insert(profesorID, cedula, area, nombre, titulo, correo, telefono);
  }
  
  @WebMethod (action="urn:updateProfesor", operationName="updateProfesor")
  public void updateProfesor(
    @WebParam (name="profesorId") String profesorID,
    @WebParam (name="cedula") String cedula,
    @WebParam (name="nombre") String nombre,
    @WebParam (name="titulo") String titulo,
    @WebParam (name="area") String area,
	@WebParam (name="correo") String correo,
    @WebParam (name="telefono") String telefono
    ) {
    checkProfesor();
	  profesor.update(profesorID,cedula,nombre,titulo,area,correo,telefono);
  }
    
  @WebMethod (action="urn:deleteProfesor", operationName="deleteProfesor")
  public void deleteProfesor(
    @WebParam (name="profesorId") String profesorID
	) {
    checkProfesor();
      profesor.delete(profesorID);
  }
  
  @WebMethod (action="urn:findAllProfesor", operationName="findAllProfesor")
  public List<ProfesorDTO> findAllProfesor() {
    checkProfesor();
	return profesor.findAll();
  }
  	
  private void checkProfesor() {
    if (profesor == null)
	  profesor = new ProfesorService();
  }
}