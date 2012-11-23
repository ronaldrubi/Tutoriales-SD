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
    @WebParam (name="id") String id
    ) {
    checkProfesor();
	  return profesor.find(profesorId);
  }
  
  @WebMethod (action="urn:insertProfesor", operationName="insertProfesor")
  public void insertProfesor(
    @WebParam (name="id") String profesorId,
    @WebParam (name="cedula") String cedula,
    @WebParam (name="nombre") String nombre,
    @WebParam (name="titulo") String titulo,
    @WebParam (name="area") String area,
    @WebParam (name="telefono") String telefono
	) {
    checkProfesor();
      profesor.insert(id,cedula,nombre,titulo,area,telefono);
  }
  
  @WebMethod (action="urn:updateProfesor", operationName="updateProfesor")
  public void updateProfesor(
    @WebParam (name="id") String profesorId,
    @WebParam (name="cedula") String cedula,
    @WebParam (name="nombre") String nombre,
    @WebParam (name="titulo") String titulo,
    @WebParam (name="area") String area,
    @WebParam (name="telefono") String telefono
    ) {
    checkProfesor();
	  profesor.update(id,cedula,nombre,titulo,area,telefono);
  }
  
  @WebMethod (action="urn:deleteProfesor", operationName="deleteProfesor")
  public void deleteProfesor(
    @WebParam (name="id") String profesorID
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