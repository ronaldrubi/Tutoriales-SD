package universidad;

public class ProfesorRepository
{
	private static String[][] profesores =
	{
		{"101110111","Estadistica","Carlos Perez","Licenciado","carlos@xyz.com","3456-7890"},
		{"202220222","Matematica","Luis Torres","Master","luis@xyz.com","6677-3456"},
		{"303330333","Administracion","Juan Castro","Licenciado","castro@xyz.com","67455-7788"},
		{"404440444","Quimica","Joaquin Soto","Ingeniero","joaquin@xyz.com","3333-7890"}
	};

	public String[] findProfesor(String profesorID)
	{
		for (int i = 0; i < profesores.length; i++)
		{
			if (profesorID.equals(profesores[i][0]))
			{
				return profesores[i];
			}
		}
		return null;
	}

	public String[][] findAll()
	{
		return profesores;
	}

	public void insert(String id, String curso, String nombre, String titulo, String telefono)
	{
		int a = 0;
		String[][] profesoresAux = new String[profesores.length + 1][6];
		for (a; a < profesores.length; a++)
		{
			profesoresAux[a] = profesores[a];
		}
		profesoresAux[a] = [id, curso, nombre, titulo, telefono];
		profesores = profesoresAux;
	}
	
	public void update(String id, String curso, String nombre, String titulo, String telefono)
	{
		for (int i = 0; i < profesores.length; i++)
		{
			if (id.equals(profesores[i][0]))
			{
				profesores[i][0] = id;
				profesores[i][1] = curso;
				profesores[i][2] = nombre;
				profesores[i][3] = titulo;
				profesores[i][4] = telefono;
			}
		}
	}
	
	public void delete(String profesorID)
	{
		String[][] profesoresAux = new String[profesores.length - 1][6];
		int b = 0;
		for (int a = 0; a < profesores.length; a++)
		{
			if (!profesorID.equals(profesores[a][0]))
			{
				profesoresAux[b] = profesores[a];
				b++;
			}
		}
		profesores = profesoresAux;
	}
}