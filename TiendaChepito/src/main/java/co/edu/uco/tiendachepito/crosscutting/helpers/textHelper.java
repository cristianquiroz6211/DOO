package co.edu.uco.tiendachepito.crosscutting.helpers;
import static co.edu.uco.tiendachepito.crosscutting.helpers.objetHelper

public  final class textHelper {
	public static final String EMPTY = "";
	
	private textHelper() {
		super();;
	}
	
	public static final boolean isNull( final String string) {
		return (objetHelper.getobjetHelper().isNull(string));
		
	}
	public static boolean isNullOrEmpty(final String string ) {
		return isNull(string) || EMPTY.equals(applyTrim(string));
		
	}
	public static final String applyTrim(final String string) {
		return string.trim();
	}
	public static final String getDefault(final String string , final String DefaultValue)
	return isNull(string) ? DefaultValue: string;
	}
public static final String getDefault(final String string )
return getDefault(string, EMPTY );
}

}
