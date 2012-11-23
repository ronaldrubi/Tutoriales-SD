package universidad;
public class ProfesorServiceSkeleton {
  public static service = ProfesorService();
  public FindProfesorResponse findProfesor(FindProfesor findProfesor) {
        String id = findProfesor.getArgs0();
        String[] data = service.findProfesor(id);
        FindProfesorResponse() response = new FindProfesorResponse();
        response.set_return(data);
        return response;
  }
  public FindAllResponse findAll (FindAll findAll){
        String[] data = service.findProfesores();
        FindAllResponse() response = new FindAllResponse();
        response.set_return(data);
        return response;      
  }
}