PATH=C:\Program Files\Java\jdk1.6.0_25\bin

javac -Xlint:unchecked -cp "universidad/WEB-INF/lib/*" -d universidad/WEB-INF/classes src/service/beans/Grupo.java src/service/beans/Profesor.java src/service/storage/ProfesorStore.java src/service/storage/GrupoStore.java src/service/resources/ProfesorResource.java src/service/resources/ProfesoresResource.java src/service/util/ParamUtil.java