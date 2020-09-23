

/**
 * @author: Siva Srinivasa Pasam
 *
 */
public class TrickyBooleanExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String guestCookieSecureToken = "abc";
        String guestSessionSecureToken = "abc";
        System.out.println(null == guestCookieSecureToken && null == guestSessionSecureToken || (null != guestCookieSecureToken && null != guestSessionSecureToken && guestSessionSecureToken.equals(guestCookieSecureToken)));
        
        guestCookieSecureToken = null;
        guestSessionSecureToken = null;
        System.out.println(null == guestCookieSecureToken && null == guestSessionSecureToken || (null != guestCookieSecureToken && null != guestSessionSecureToken && guestSessionSecureToken.equals(guestCookieSecureToken)));
        
        guestCookieSecureToken = null;
        guestSessionSecureToken = "abc";
        System.out.println(null == guestCookieSecureToken && null == guestSessionSecureToken || (null != guestCookieSecureToken && null != guestSessionSecureToken && guestSessionSecureToken.equals(guestCookieSecureToken)));
        
        guestCookieSecureToken = "abc";
        guestSessionSecureToken = null;
        System.out.println(null == guestCookieSecureToken && null == guestSessionSecureToken || (null != guestCookieSecureToken && null != guestSessionSecureToken && guestSessionSecureToken.equals(guestCookieSecureToken)));
        
        guestCookieSecureToken = "abc";
        guestSessionSecureToken = "sfgsd";
        System.out.println(null == guestCookieSecureToken && null == guestSessionSecureToken || (null != guestCookieSecureToken && null != guestSessionSecureToken && guestSessionSecureToken.equals(guestCookieSecureToken)));
	}

}
