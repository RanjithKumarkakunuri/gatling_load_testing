package com.olive.gatlingdemo.util;


public class StringUtil {
	/**
	 * left pad with '0'
	 * 
	 * @param s   - original string
	 * @param len - desired len
	 * @return zero padded string
	 * @throws ISOException if string's length greater than len
	 */
	public static String zeropad(String s, int len)  {
		return padleft(s, len, '0');
	}

	/**
	 * zeropads a long without throwing an ISOException (performs modulus operation)
	 *
	 * @param l   the long
	 * @param len the length
	 * @return zeropadded value
	 */
	public static String zeropad(long l, int len) {
 		return padleft(Long.toString((long) (l % Math.pow(10, len))), len, '0');
	 
	}

	/**
	 * pad to the left
	 * 
	 * @param s   - original string
	 * @param len - desired len
	 * @param c   - padding char
	 * @return padded string
	 * @throws ISOException on error
	 */
	public static String padleft(String s, int len, char c)   {
		s = s.trim();
		if (s.length() > len)
			throw new RuntimeException("invalid len " + s.length() + Constants.PATH_SEPERATOR + len);
		StringBuilder d = new StringBuilder(len);
		int fill = len - s.length();
		while (fill-- > 0)
			d.append(c);
		d.append(s);
		return d.toString();
	}
}
