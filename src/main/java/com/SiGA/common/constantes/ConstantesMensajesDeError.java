package  com.SiGA.common.constantes;

/**
 * @author Altamirano Lopez Arnold Eduardo NEC de Mexico.
 * @version 1.0
 * @fecha 20/02/2013
 * @descripcion Interface con constantes con los mensajes de error.
 *
 */
public interface ConstantesMensajesDeError {
	//errores BD
	public static String ERROR_FIND_BY = "Error al tratar de buscar objetos: ";
	public static String ERROR_INSERT = "Error al tratar de insertar objeto: ";
	public static String ERROR_UPDATE = "Error al tratar de actualziar objeto: ";
	public static String ERROR_DELETE = "Error al tratar de borar objeto: ";
	public static String ERROR_SELECT_ALL = "Error al consultar todos los registros: ";
	public static String ERROR_CONVERSION_POJO_VO = "Error al tratar de convertir a VO el POJO: ";
	public static String ERROR_CONVERSION_VO_POJO = "Error al tratar de convertir a POJO el VO: ";
	public static String ERROR_SELECT_BY_ALL_FILTERS = "Error al tratar de consultar con filtros el objeto: ";

	//errores core
	public static String ERROR_INICIALIZACION_SPRING_FRAMEWORK = "Error al tratar de iniciar el contexto de Spring";
}
