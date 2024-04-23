package co.edu.uco.tiendachepito.crosscutting.helpers;

public  final class objetHelper {
	private static final objetHelper instance = new objectHelper();
	
	private objetcHelper() {
		super();
	}
	
	public static final objetHelper getObjectHelper() {
		return instance;
	}
	public   final <T> boolean  isNull( T object ) {
		return object == null;
	}

}
